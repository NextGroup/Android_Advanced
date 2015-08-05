package org.nhnnext.soran.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBSessionHelper extends SQLiteOpenHelper {

	static final int DATABASE_VERSION = 1;

	static final String DATABASE_NAME = "soran";

	static final String TABLE_SESSION = "session";

	static final String KEY_SESSION_ID = "id";
	static final String KEY_SESSION_INSTRUCTOR = "instructor";
	static final String KEY_SESSION_PHOTO = "photo";
	static final String KEY_SESSION_TITLE = "title";
	static final String KEY_SESSION_DESCRIPTION = "desc";

	private Context context;
	public DBSessionHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		this.context = context;
		
		// For DB test
		SQLiteDatabase db = getWritableDatabase();
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_SESSION);
		onCreate(db);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_SESSION_TABLE = "CREATE TABLE " + TABLE_SESSION + "("
				+ KEY_SESSION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ KEY_SESSION_INSTRUCTOR + " TEXT,"
				+ KEY_SESSION_PHOTO + " TEXT,"
				+ KEY_SESSION_TITLE + " TEXT,"
				+ KEY_SESSION_DESCRIPTION + " TEXT"
				+ ");";
		db.execSQL(CREATE_SESSION_TABLE);
		
		DBSessionDump.insert(context, db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_SESSION);
		onCreate(db);
	}

	public int getSessionCount() {
		SQLiteDatabase db = this.getReadableDatabase();
		
		String query = "SELECT COUNT(*) FROM " + TABLE_SESSION;
		
		Cursor cursor = db.rawQuery(query, null);
		cursor.moveToFirst();
		return cursor.getInt(0);
	}
	
	public ObjSession getSession(int position) {
		SQLiteDatabase db = this.getReadableDatabase();
		
		String query = "SELECT * FROM " + TABLE_SESSION + " LIMIT " + position + ",1";
		
		Cursor cursor = db.rawQuery(query, null);

		ObjSession session = null;
		if (cursor.moveToFirst()) {
			session = new ObjSession();
			session.instructor = cursor.getString(cursor.getColumnIndex(KEY_SESSION_INSTRUCTOR));
			session.photo = cursor.getString(cursor.getColumnIndex(KEY_SESSION_PHOTO));
			session.title = cursor.getString(cursor.getColumnIndex(KEY_SESSION_TITLE));
			session.description = cursor.getString(cursor.getColumnIndex(KEY_SESSION_DESCRIPTION));
		}
		return session;
	}
	
}