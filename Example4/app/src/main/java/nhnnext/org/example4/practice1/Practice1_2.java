package nhnnext.org.example4.practice1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;

import nhnnext.org.example4.R;

/**
 * Created by chayongbin on 15. 7. 22..
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Practice1_2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1_2);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Practice1_Fragment fragment = new Practice1_Fragment();
        fragmentTransaction.add(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }

}
