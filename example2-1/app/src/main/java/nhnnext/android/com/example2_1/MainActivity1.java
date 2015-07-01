package nhnnext.android.com.example2_1;

import java.lang.reflect.Method;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.TextView;

public class MainActivity1 extends Activity {

    public static Point getRealSize(Display display) {
        Point result = new Point();
        Method rawH;
        try {
            rawH = Display.class.getMethod("getRawHeight");
            Method rawW = Display.class.getMethod("getRawWidth");
            result.x = (Integer) rawW.invoke(display);
            result.y = (Integer) rawH.invoke(display);
            return result;
        } catch (Throwable e) {
            return null;
        }
    }

    @SuppressLint("NewApi")
    @SuppressWarnings("deprecation")
    public static Point getSize(Display display) {
        Point result = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics metrics = new DisplayMetrics();
            display.getRealMetrics(metrics);
            result.x = metrics.widthPixels;
            result.y = metrics.heightPixels;
        } else if (Build.VERSION.SDK_INT >= 14) {
            result = getRealSize(display);
        } else if (Build.VERSION.SDK_INT >= 13) {
            display.getSize(result);
        } else {
            result.x = display.getWidth();
            result.y = display.getHeight();
        }
        return result;
    }

    private String getScreenStats() {

        Display display = getWindowManager().getDefaultDisplay();

        DisplayMetrics metrics = getResources().getDisplayMetrics();

        Point pxSize = getSize(display);

        Point dpSize = new Point();
        dpSize.x = (int) (pxSize.x / metrics.density);
        dpSize.y = (int) (pxSize.y / metrics.density);

        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(", ");
        sb.append(Build.MODEL);
        sb.append("\n\n");

        sb.append("Pixels: ");
        sb.append(pxSize.x);
        sb.append(" x " );
        sb.append(pxSize.y);
        sb.append("\n\n");

        sb.append("Dp (px / density): ");
        sb.append(dpSize.x);
        sb.append(" x " );
        sb.append(dpSize.y);
        sb.append("\n\n");

        sb.append("smallest width: " + Math.min(pxSize.x, dpSize.x));
        sb.append("\n\n");

        sb.append("density: ");
        sb.append(metrics.densityDpi);
        sb.append("dpi, ");
        sb.append(metrics.density);

        return sb.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tvInfo = new TextView(this);
        tvInfo.setPadding(50, 50, 50, 50);
        tvInfo.setText(getScreenStats());

        setContentView(tvInfo);
    }
}