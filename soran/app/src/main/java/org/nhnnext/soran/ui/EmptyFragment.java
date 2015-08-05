package org.nhnnext.soran.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class EmptyFragment extends Fragment {

	int position = 0;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v = new View(getActivity());
		v.setBackgroundColor(Color.RED);
		v.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				switch(position) {
				case 0:
					v.setBackgroundColor(Color.GREEN);
					break;
				case 1:
					v.setBackgroundColor(Color.BLUE);
					break;
				case 2:
					v.setBackgroundColor(Color.RED);
					break;
				}
				position = (position + 1) % 3;
			}
		});
		return v;
	}

}
