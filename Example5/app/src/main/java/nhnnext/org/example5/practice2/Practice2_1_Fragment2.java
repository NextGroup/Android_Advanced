package nhnnext.org.example5.practice2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import nhnnext.org.example5.R;

public class Practice2_1_Fragment2 extends Fragment {
	
	Integer containerId;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		containerId = container.getId();
		
		View v = inflater.inflate(R.layout.view_fragment1_1_2, null);
		Button btn = (Button) ((ViewGroup)v).getChildAt(0);
		btn.setText(String.valueOf(getArguments().getInt("Num")));
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

				Practice2_1_Fragment1 fragment = new Practice2_1_Fragment1();
				Bundle bundle2 = new Bundle();
				bundle2.putInt("Num", getArguments().getInt("Num")+1);
				fragment.setArguments(bundle2);
				
				FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();	
				fragmentTransaction.replace(containerId, fragment);
				fragmentTransaction.commit();
			}
		});
		return v;
	}
	
}
