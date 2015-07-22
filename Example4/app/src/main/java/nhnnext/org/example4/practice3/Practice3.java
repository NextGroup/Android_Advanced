package nhnnext.org.example4.practice3;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import nhnnext.org.example4.R;

/**
 * Created by chayongbin on 15. 7. 22..
 */
public class Practice3 extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Lifecycle", "Activity - onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment3);
    }

    @Override
    protected void onStart() {
        Log.i("Lifecycle", "Activity - onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("Lifecycle", "Activity - onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("Lifecycle", "Activity - onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Lifecycle", "Activity - onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Lifecycle", "Activity - onDestroy()");
        super.onDestroy();
    }


}