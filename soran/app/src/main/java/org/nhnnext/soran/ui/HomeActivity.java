
package org.nhnnext.soran.ui;

import org.nhnnext.soran.R;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;

public class HomeActivity extends ActionBarActivity implements TabListener, OnPageChangeListener {
	
	private ActionBar mActionbar;

	private ViewPager mViewPager;
	private HomePagerAdapter mHomePagerAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		mActionbar = getSupportActionBar();
		
		mViewPager = (ViewPager) findViewById(R.id.pager);
		if (mViewPager != null) {
			
			mActionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			
			mHomePagerAdapter = new HomePagerAdapter(getSupportFragmentManager());
			mViewPager.setAdapter(mHomePagerAdapter);
			mViewPager.setOnPageChangeListener(this);
			
			Tab tab;
			
			tab = mActionbar.newTab()
					.setText(R.string.tab_session)
					.setTabListener(this);
			mActionbar.addTab(tab);
			
			tab = mActionbar.newTab()
					.setText(R.string.tab_empty)
					.setTabListener(this);
			mActionbar.addTab(tab);
			
			tab = mActionbar.newTab()
					.setText(R.string.tab_soran)
					.setTabListener(this);
			mActionbar.addTab(tab);
		}
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) { }

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) { }

	@Override
	public void onPageScrollStateChanged(int state) { }

	@Override
	public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) { }

	@Override
	public void onPageSelected(int position) {
		mActionbar.setSelectedNavigationItem(position);
	}
	
}
