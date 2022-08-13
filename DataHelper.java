package com.example.uas_akb_10119042;
// M Rifqu Abdillah IF-1 10119042

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "catatanharian.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table catatan(no integer primary key, judul text null, kategori null, isi text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO catatan (no, judul, kategori, isi) VALUES ('1', 'Kerja', 'Daftar Harian', 'Semangat');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
