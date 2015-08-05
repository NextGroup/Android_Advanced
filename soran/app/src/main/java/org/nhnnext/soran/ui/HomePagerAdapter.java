package org.nhnnext.soran.ui;

import org.nhnnext.soran.ui.session.SessionFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class HomePagerAdapter extends FragmentPagerAdapter {

	static final int PAGE_COUNT = 3; 

	public HomePagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		switch(position) {
		case 0:
			return new SessionFragment();
		case 1:
			return new EmptyFragment();
		case 2:
			return new SoranFragment();
		}
		return null;
	}

	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

}

