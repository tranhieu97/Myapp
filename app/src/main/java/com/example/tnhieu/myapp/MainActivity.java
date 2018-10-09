package com.example.tnhieu.myapp;

import android.accessibilityservice.GestureDescription;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.tnhieu.controller.CusTomAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    private EditText edt2;
    private EditText edt3;
    private Button bt;
    data x;
    private ListView listView;
    ArrayList<data> mArray=new ArrayList<>();    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        edt3= (EditText)findViewById(R.id.edt3);
        bt=(Button)findViewById(R.id.bt);
        listView=(ListView)findViewById(R.id.lv) ;
    }
    public void xuly(View view)
    {
        final CusTomAdapter cusTomAdapter =new CusTomAdapter(MainActivity.this, R.layout.view, mArray);
        listView.setAdapter(cusTomAdapter);
        String x1 = edt1.getText().toString();
        String x2 =edt2.getText().toString();
        String x3 = edt3.getText().toString();
         x = new data(x1, x2, x3);
        mArray.add(x);

    }
}
