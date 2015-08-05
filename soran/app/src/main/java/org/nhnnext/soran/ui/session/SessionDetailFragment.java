package org.nhnnext.soran.ui.session;

import org.nhnnext.soran.R;
import org.nhnnext.soran.db.DBSessionHelper;
import org.nhnnext.soran.db.ObjSession;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SessionDetailFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View convertView = inflater.inflate(R.layout.fragment_session_deatil, null);
		
		int position = 0;
		if(getActivity().getIntent() != null) {
			position = getActivity().getIntent().getIntExtra("position", 0);
		}
		DBSessionHelper db = new DBSessionHelper(getActivity());
		ObjSession session = db.getSession(position);
		
		ProfileView pv = (ProfileView) convertView.findViewById(R.id.pvInstructor);
		pv.ivPhoto.setImageResource(Integer.valueOf(session.photo));
		pv.tvName.setText(session.instructor);
		
		TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
		tvTitle.setText(session.title);
		
		TextView tvDescription = (TextView) convertView.findViewById(R.id.tvDescription);
		tvDescription.setText(session.description);
		
		return convertView;
	}
	
}
