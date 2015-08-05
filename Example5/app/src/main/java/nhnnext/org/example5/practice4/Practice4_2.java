
package nhnnext.org.example5.practice4;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;

import nhnnext.org.example5.R;

public class Practice4_2 extends ActionBarActivity {

	private ViewPager mViewPager;
	private Practice4_1_FragmentAdapter mPagerAdapter;
	
	private ActionBar mActionbar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment4);
		
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mPagerAdapter = new Practice4_1_FragmentAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(mPagerAdapter);
		
		mActionbar = getSupportActionBar();
		mActionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		Tab tab;
		
		tab = mActionbar.newTab()
				.setText("Fragment1")
				.setTabListener(tabListener);
		mActionbar.addTab(tab);
		
		tab = mActionbar.newTab()
				.setText("Fragment2")
				.setTabListener(tabListener);
		mActionbar.addTab(tab);

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                mActionbar.setSelectedNavigationItem(position);
            }
        });
	}
	
	private ActionBar.TabListener tabListener = new TabListener() {
		
		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			
		}
		
		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			mViewPager.setCurrentItem(tab.getPosition());
		}
		
		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			
		}
	};
	
}
