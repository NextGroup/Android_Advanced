package nhnnext.android.com.example1_2;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;


public class Practice1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView sv = new ScrollView(this);

        LinearLayout llGroup = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        llGroup.setOrientation(LinearLayout.HORIZONTAL);
        llGroup.setLayoutParams(params);
        sv.addView(llGroup);


        params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1);

        LinearLayout llLeft = new LinearLayout(this);
        llLeft.setOrientation(LinearLayout.VERTICAL);
        llLeft.setLayoutParams(params);
        llGroup.addView(llLeft);

        LinearLayout llRight = new LinearLayout(this);
        llRight.setOrientation(LinearLayout.VERTICAL);
        llRight.setLayoutParams(params);
        llGroup.addView(llRight);

        TextView tv;
        for(int i=1; i<50; i++) {
            tv = new TextView(this);
            tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, i);
            tv.setText(i + " PX");
            llLeft.addView(tv);

            tv = new TextView(this);
            tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, i);
            tv.setText(i + " DIP(DP)");
            llRight.addView(tv);
        }

        setContentView(sv);
    }
}