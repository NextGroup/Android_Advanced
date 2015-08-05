package org.nhnnext.soran.ui.session;

import org.nhnnext.soran.R;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ProfileView extends RelativeLayout {

	public ProfileView(Context context) {
		super(context);
		initialize(context);
	}
	
	public ProfileView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize(context);
	}
	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public ProfileView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initialize(context);
	}
	
	public ImageView ivPhoto;
	public TextView tvName;
	
	private int minTextSize, maxTextSize;
	
	protected void initialize(Context context) {
		LayoutInflater li = ((Activity)context).getLayoutInflater();
		li.inflate(R.layout.view_profile, this);

		ivPhoto = (ImageView) findViewById(R.id.ivPhoto);
		tvName = (TextView) findViewById(R.id.tvName);

		minTextSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 12, getResources().getDisplayMetrics());
		maxTextSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 25, getResources().getDisplayMetrics());
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = 0;
        switch(heightMode) {
        case MeasureSpec.UNSPECIFIED:
            heightSize = heightMeasureSpec;
            break;
        case MeasureSpec.AT_MOST:
            break;
        case MeasureSpec.EXACTLY:
            heightSize = MeasureSpec.getSize(heightMeasureSpec);
            break;
        }
        
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = 0;
        switch(widthMode) {
        case MeasureSpec.UNSPECIFIED:
            widthSize = widthMeasureSpec;
            break;
        case MeasureSpec.AT_MOST:
            break;
        case MeasureSpec.EXACTLY:
            widthSize = MeasureSpec.getSize(widthMeasureSpec);
            break;
        }
        
		int textSize = 0;
		if(widthSize > heightSize) {
			textSize = widthSize / 7; 
		} else {
			textSize = heightSize / 7;
		}

		if(textSize > maxTextSize) {
			tvName.setTextSize(TypedValue.COMPLEX_UNIT_PX, maxTextSize);
		} else if(textSize < minTextSize) {
			tvName.setTextSize(TypedValue.COMPLEX_UNIT_PX, minTextSize);
		} else {
			tvName.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
		}
		
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

}
