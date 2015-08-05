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
import android.widget.ImageView;

public class SoranFragment extends Fragment {

	static final String urlMapNhnNext = "http://m.map.naver.com/map.nhn?lng=127.1083022&lat=37.401955&pinType=site&pinId=31509959&dlevel=12";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_soran, null);

		ImageView ivMap = (ImageView) v.findViewById(R.id.ivMap);
		ivMap.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse(urlMapNhnNext);
				Intent it = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(it);
			}
		});
		return v;
	}

}
