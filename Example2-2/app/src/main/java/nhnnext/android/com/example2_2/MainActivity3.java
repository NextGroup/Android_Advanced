package nhnnext.android.com.example2_2;

import java.lang.reflect.Method;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.widget.TextView;

public class MainActivity3 extends ActionBarActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Point screenSize = getSize(getWindowManager().getDefaultDisplay());

        int textSize = screenSize.x / 20;

        TextView tvInfo = new TextView(this);
        tvInfo.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
        tvInfo.setText("TextSize: "
                + textSize + " px, "
                + (textSize / getResources().getDisplayMetrics().density) + "dp\n"
                + getString(R.string.content));

        setContentView(tvInfo);
    }
}


