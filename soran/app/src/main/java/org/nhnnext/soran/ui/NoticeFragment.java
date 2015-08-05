package org.nhnnext.soran.ui;

import org.nhnnext.soran.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class NoticeFragment extends Fragment {

	static final String urlSoranRegistration = "http://m.onoffmix.com/event/25574";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_notice, null);
		
		TextView tv = (TextView) v.findViewById(R.id.tvNotice);
		tv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse(urlSoranRegistration);
				Intent it = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(it);
			}
		});
		
		return v;
	}
	
}
