
package org.nhnnext.soran.ui.session;

import org.nhnnext.soran.R;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

public class SessionDetailActivity extends ActionBarActivity {

	private ActionBar mActionbar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_session_detail);
		
		mActionbar = getSupportActionBar();
		mActionbar.setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public boolean onSupportNavigateUp() {
		finish();
		return true;
	}
	
}
