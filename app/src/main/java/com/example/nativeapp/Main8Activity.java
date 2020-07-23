package com.example.nativeapp;

import android.app.AlertDialog;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Main8Activity extends AppCompatActivity {

    EditText txtA,txtB;
    Button btnCong;

    ListView lvlScreen2;
    ArrayAdapter<String> adapter;
    ArrayList<String> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        txtA=findViewById(R.id.txtA);
        txtB=findViewById(R.id.txtB);
        lvlScreen2=findViewById(R.id.lvlScreen2);

        TabHost tabHost=findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setIndicator("1.Phép cộng");
        tab1.setIndicator("",getResources().getDrawable(R.drawable.icons8_add_32));
        tab1.setContent(R.id.linear1);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        tab2.setIndicator("2.List");
        tab2.setIndicator("",getResources().getDrawable(R.drawable.icons8_time_machine_32));
        tab2.setContent(R.id.linear2);
        tabHost.addTab(tab2);


        btnCong=findViewById(R.id.btnCong);
        txtA=findViewById(R.id.txtA);
        txtB=findViewById(R.id.txtB);

        data=new ArrayList<String>();
        adapter=new ArrayAdapter<>(Main8Activity.this, android.R.layout.simple_list_item_1,data);

        lvlScreen2.setAdapter(adapter);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int a=Integer.parseInt(txtA.getText().toString());
                    int b=Integer.parseInt(txtB.getText().toString());
                    int c=a+b;
                    //Toast.makeText(Main8Activity.this,c+"",Toast.LENGTH_SHORT).show();
                    String str=a+"+"+b+"="+c;
                    data.add(str);
                    adapter.notifyDataSetChanged();
                }
                catch (Exception e){
                    AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());
                    builder.setTitle("Warning!");
                    builder.setMessage("Có lỗi, vui lòng kiểm tra input");
                    builder.setCancelable(false);
                    builder.setPositiveButton("No",null);
                    builder.setNegativeButton("Yes",null);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }

            }
        });
    }
}
