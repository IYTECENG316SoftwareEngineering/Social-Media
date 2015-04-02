package com.example.macbookpro.p3_databasedeneme;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class KullaniciGor extends Activity{

    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanici_gor);

        Initialize();
    }

    public void Initialize()
    {
        myList = (ListView) findViewById(R.id.listView);
        Kayitlar.dbHelper = new DatabaseHelper(getApplicationContext());

        Kayitlar.oyuncular = Kayitlar.dbHelper.getOyuncular();

        MyAdapter adapter = new MyAdapter(this,Kayitlar.oyuncular);
        myList.setAdapter(adapter);
    }
}
