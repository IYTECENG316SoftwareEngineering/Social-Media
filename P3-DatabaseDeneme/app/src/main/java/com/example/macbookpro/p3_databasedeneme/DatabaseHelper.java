package com.example.macbookpro.p3_databasedeneme;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "oyuncuDB";
    private static final String TABLE_OYUNCULAR = "oyuncular";
    String CREATE_TABLE = "CREATE TABLE " + TABLE_OYUNCULAR + "(id INTEGER PRIMARY KEY,oyuncu_isim TEXT,oyuncu_soyisim TEXT" + ")";

    public DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OYUNCULAR);
        onCreate(db);
    }

    public void insertOyuncular(Oyuncular oyuncu)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("oyuncu_isim",oyuncu.getIsim());
        values.put("oyuncu_soyisim",oyuncu.getSoyisim());

        db.insert(TABLE_OYUNCULAR,null,values);
        db.close();
    }

    public List<Oyuncular> getOyuncular()
    {
        List<Oyuncular> oyuncuList = new ArrayList<Oyuncular>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_OYUNCULAR, new String[]{"id", "oyuncu_isim", "oyuncu_soyisim"}, null, null, null, null, null);

        while(cursor.moveToNext())
        {
            Oyuncular oyuncular = new Oyuncular();
            oyuncular.setId(cursor.getInt(0));
            oyuncular.setIsim(cursor.getString(1));
            oyuncular.setSoyisim(cursor.getString(2));
            oyuncuList.add(oyuncular);
        }

        return oyuncuList;
    }
}
