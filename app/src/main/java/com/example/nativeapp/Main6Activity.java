package com.example.nativeapp;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main6Activity extends AppCompatActivity {

    EditText edtThongtin;
    AutoCompleteTextView txtAutoComplete;
    Button btnBai6;
    TextView txtThongtin;

    String[] arrTinh;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        edtThongtin=findViewById(R.id.edtThongtin);
        txtAutoComplete=findViewById(R.id.txtAutoComplete);
        btnBai6=findViewById(R.id.btnBai6);
        txtThongtin=findViewById(R.id.txtThongtin);
        arrTinh=getResources().getStringArray(R.array.arrTinh);
        adapter=new ArrayAdapter<>(Main6Activity.this, android.R.layout.simple_list_item_1,arrTinh);
        txtAutoComplete.setAdapter(adapter);

        btnBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten=edtThongtin.getText().toString()+"-"+txtAutoComplete.getText().toString();
                txtThongtin.setText(ten);
            }
        });
    }
}
