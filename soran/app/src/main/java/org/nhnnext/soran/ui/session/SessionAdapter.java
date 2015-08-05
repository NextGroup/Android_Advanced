package org.nhnnext.soran.ui.session;

import org.nhnnext.soran.R;
import org.nhnnext.soran.db.DBSessionHelper;
import org.nhnnext.soran.db.ObjSession;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SessionAdapter extends BaseAdapter {
	
	private DBSessionHelper db;
	
	private LayoutInflater li;
	private int itemHeight;
	
	public SessionAdapter(Activity context) {
		this.db = new DBSessionHelper(context);
		this.li = context.getLayoutInflater();
		this.itemHeight = context.getResources().getDisplayMetrics().heightPixels / 10;
	}
	
	@Override
	public int getCount() {
		return db.getSessionCount();
	}

	@Override
	public Object getItem(int position) {
		return db.getSession(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if(convertView == null) {
			convertView = li.inflate(R.layout.item_session, null);
			LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
			params.height = itemHeight;
			convertView.setLayoutParams(params);
		}
		
		ObjSession session = (ObjSession) getItem(position);
		
		ProfileView pv = (ProfileView) convertView.findViewById(R.id.pvInstructor);
		pv.ivPhoto.setImageResource(Integer.valueOf(session.photo));
		pv.tvName.setText(session.instructor);
		
		TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
		tvTitle.setText(session.title);
		
		return convertView;
	}

}
