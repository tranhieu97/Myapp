package com.example.tnhieu.controller;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.tnhieu.myapp.R;
import com.example.tnhieu.myapp.data;

import java.util.ArrayList;
import java.util.List;

public class CusTomAdapter extends ArrayAdapter<data> {
    private Context context;
    private int resource;
    private ArrayList<data> arrayList;
    public CusTomAdapter(Activity context, int resource, ArrayList<data> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrayList=objects;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.view, parent, false);
        TextView t1 =(TextView)convertView.findViewById(R.id.t1);
        TextView t2 =(TextView)convertView.findViewById(R.id.t2);
        TextView t3 =(TextView)convertView.findViewById(R.id.t3);
        t1.setText(data.getName());
        t2.setText(data.getTuoi());
        t3.setText(data.getDiachi());
        return convertView;
    }
}
