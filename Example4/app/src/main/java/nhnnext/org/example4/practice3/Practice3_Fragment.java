package nhnnext.org.example4.practice3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nhnnext.org.example4.R;

/**
 * Created by chayongbin on 15. 7. 22..
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Practice3_Fragment extends Fragment {


    @Override
    public void onAttach(Activity activity) {
        Log.i("Lifecycle", "Fragment - onAttach()");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("Lifecycle", "Fragment - onCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("Lifecycle", "Fragment - onCreateView()");
        return inflater.inflate(R.layout.view_fragment1, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("Lifecycle", "Fragment - onActivityCreated()");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("Lifecycle", "Fragment - onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("Lifecycle", "Fragment - onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("Lifecycle", "Fragment - onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("Lifecycle", "Fragment - onStop()");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("Lifecycle", "Fragment - onDestroyView()");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("Lifecycle", "Fragment - onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("Lifecycle", "Fragment - onDetach()");
        super.onDetach();
    }

}
