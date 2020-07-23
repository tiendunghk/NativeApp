package com.example.nativeapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    ListView lvlDay;
    String[]arrThu;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvlDay=findViewById(R.id.lvlDay);
        arrThu=getResources().getStringArray(R.array.arrThu);
        adapter=new ArrayAdapter<>(Main2Activity.this, android.R.layout.simple_list_item_1,arrThu);
        lvlDay.setAdapter(adapter);
        lvlDay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,position+""+arrThu[position],Toast.LENGTH_LONG).show();
            }
        });
    }

    public void goBack(View view) {
        finish();
    }
}
