package nhnnext.android.com.example2_2;

/**
 * Created by chayongbin on 15. 7. 7..
 */
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class MainActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tvStringResource = new TextView(this);
        tvStringResource.setText(getResources().getString(R.string.content));

        setContentView(tvStringResource);
    }
}



