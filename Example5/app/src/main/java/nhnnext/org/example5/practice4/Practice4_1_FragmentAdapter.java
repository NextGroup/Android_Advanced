package nhnnext.org.example5.practice4;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import nhnnext.org.example5.practice1.Practice1_1_Fragment1;
import nhnnext.org.example5.practice1.Practice1_1_Fragment2;

public class Practice4_1_FragmentAdapter extends FragmentPagerAdapter {

	public Practice4_1_FragmentAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		switch(position) {
		case 0:
			return new Practice1_1_Fragment1();
		case 1:
			return new Practice1_1_Fragment2();
		}
		return null;
	}

	@Override
	public int getCount() {
		return 2;
	}

}
