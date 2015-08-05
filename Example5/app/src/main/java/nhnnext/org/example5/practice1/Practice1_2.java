package nhnnext.org.example5.practice1;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import nhnnext.org.example5.R;

public class Practice1_2 extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment1_2);
		
		FragmentManager fragmentManager = getSupportFragmentManager();	

		Practice1_1_Fragment1 fragment = new Practice1_1_Fragment1();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();	
		fragmentTransaction.add(R.id.fragmentContainer, fragment);
		fragmentTransaction.commit();
	}
	
}
