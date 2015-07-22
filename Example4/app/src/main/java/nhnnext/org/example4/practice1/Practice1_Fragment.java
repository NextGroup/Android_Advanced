package nhnnext.org.example4.practice1;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nhnnext.org.example4.R;

/**
 * Created by chayongbin on 15. 7. 22..
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Practice1_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view_fragment1, null);
    }

}
