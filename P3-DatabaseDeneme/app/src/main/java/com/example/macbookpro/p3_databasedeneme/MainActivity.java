package com.example.macbookpro.p3_databasedeneme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener{

    Button kullaniciEkle;
    Button kullaniciGor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize();
    }

    public void Initialize()
    {
        kullaniciEkle = (Button) findViewById(R.id.kullaniciEkle);
        kullaniciGor = (Button) findViewById(R.id.kullaniciGor);

        kullaniciEkle.setOnClickListener(this);
        kullaniciGor.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.kullaniciEkle)
        {
            Intent i = new Intent(MainActivity.this,KullaniciEkle.class);
            startActivity(i);
        }

        if(v.getId()==R.id.kullaniciGor)
        {
            Intent i = new Intent(MainActivity.this,KullaniciGor.class);
            startActivity(i);
        }
    }
}
