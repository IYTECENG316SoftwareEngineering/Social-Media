package com.example.macbookpro.p3_databasedeneme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KullaniciEkle extends Activity implements View.OnClickListener{

    EditText editIsim;
    EditText editSoyisim;
    Button buttonKaydet;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kullanici_ekle);

        Initialize();
    }

    public void Initialize()
    {
        editIsim = (EditText) findViewById(R.id.editIsim);
        editSoyisim = (EditText) findViewById(R.id.editSoyisim);
        buttonKaydet = (Button) findViewById(R.id.buttonKaydet);

        buttonKaydet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.buttonKaydet)
        {
            Kayitlar.dbHelper.insertOyuncular(new Oyuncular(editIsim.getText().toString(),editSoyisim.getText().toString()));
        }
    }
}
