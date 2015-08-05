package org.nhnnext.soran.db;

import org.nhnnext.soran.R;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBSessionDump {

	static void insert(Context context, SQLiteDatabase db) {

		ContentValues values;
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_1_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile1);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_1_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_1_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_2_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile2);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_2_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_2_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_3_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile3);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_3_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_3_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_4_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile4);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_4_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_4_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_5_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile5);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_5_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_5_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_6_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile6);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_6_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_6_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_7_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile7);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_7_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_7_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_8_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile8);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_8_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_8_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
		
		values = new ContentValues();
		values.put(DBSessionHelper.KEY_SESSION_INSTRUCTOR, context.getString(R.string.session_9_instructor));
		values.put(DBSessionHelper.KEY_SESSION_PHOTO, R.drawable.profile9);
		values.put(DBSessionHelper.KEY_SESSION_TITLE, context.getString(R.string.session_9_title));
		values.put(DBSessionHelper.KEY_SESSION_DESCRIPTION, context.getString(R.string.session_9_description));
		db.insert(DBSessionHelper.TABLE_SESSION, null, values);
	}
}