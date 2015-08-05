package nhnnext.org.example5.practice4;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import nhnnext.org.example5.R;

public class Practice4_1 extends FragmentActivity {

	private ViewPager mViewPager;
	private Practice4_1_FragmentAdapter mPagerAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment4);
		
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mPagerAdapter = new Practice4_1_FragmentAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mPagerAdapter);
	}
}
