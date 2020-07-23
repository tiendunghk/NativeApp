package com.example.nativeapp;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    ListView lvlView;
    Button click;
    EditText text;
    ArrayList<String> arrData=new ArrayList<String>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lvlView=findViewById(R.id.lvlView);
        click=findViewById(R.id.Click);
        text=findViewById(R.id.input);
       // arrData.add("abc");
        //arrData.add("def");
        //arrData.add("ghi");
        adapter=new ArrayAdapter<>(Main3Activity.this, android.R.layout.simple_list_item_1,arrData);
        lvlView.setAdapter(adapter);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrData.add(text.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

    }
}
