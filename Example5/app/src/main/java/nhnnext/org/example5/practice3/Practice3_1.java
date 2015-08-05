
package nhnnext.org.example5.practice3;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import nhnnext.org.example5.R;

public class Practice3_1 extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment1_1);
		
		FragmentManager fragmentManager = getSupportFragmentManager();	

		Practice3_1_Fragment1 fragment = new Practice3_1_Fragment1();
		Bundle bundle = new Bundle();
		bundle.putInt("Num", 0);
		fragment.setArguments(bundle);
		
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();	
		fragmentTransaction.add(R.id.fragmentContainer, fragment);
		fragmentTransaction.commit();
	}
	
}
