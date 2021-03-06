package com.example.juniorf.maqtt.data;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by juniorf on 07/12/16.
 */

public class MySQLiteOpenHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "programacao";

    public MySQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tableLocation = "CREATE TABLE programacao ("+
                "id INTEGER PRIMARY KEY NOT NULL,"+
                "toLigar int,"+
                "toDesligar int"+
                ");";
        db.execSQL(tableLocation);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
