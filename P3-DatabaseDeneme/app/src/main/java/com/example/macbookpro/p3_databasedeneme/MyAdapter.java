package com.example.macbookpro.p3_databasedeneme;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter{

    private LayoutInflater myInflater;
    private List<Oyuncular> myList;

    public MyAdapter(Activity activity, List<Oyuncular> oyuncular)
    {
        myInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        myList = oyuncular;
    }

    @Override
    public int getCount()
    {
        return myList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View satirView = convertView;

        if(convertView==null)
        {
            satirView = myInflater.inflate(R.layout.satir_layout,null);
        }

        TextView isim = (TextView) satirView.findViewById(R.id.textIsim);
        TextView soyIsim = (TextView) satirView.findViewById(R.id.textSoyisim);

        Oyuncular oyuncu = myList.get(position);
        soyIsim.setText(oyuncu.getSoyisim());
        isim.setText(oyuncu.getIsim());

        return satirView;
    }
}
