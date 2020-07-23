package com.example.nativeapp;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnClick,btnAction;
    CheckBox ck1,ck2,ck3;
    TextView ouput;
    RadioButton rd1,rd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAction=findViewById(R.id.btnAction);
        rd1=findViewById(R.id.rd1);
        rd2=findViewById(R.id.rd2);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder
                        .setTitle("Delete entry")
                        .setMessage(rd1.isChecked()?rd1.getText():rd2.getText())
                        .show();
            }
        });

    }
    public void onClickFunction(View view)
    {
        //Toast.makeText(this,"abc",Toast.LENGTH_LONG).show();
        //Intent intent=new Intent(this,Main2Activity.class);
        //startActivity(intent);
        ck1=findViewById(R.id.ck1);
        ck2=findViewById(R.id.ck2);
        ck3=findViewById(R.id.ck3);
        ouput=findViewById(R.id.output);
        String outputS="";
        if(ck1.isChecked()) outputS+=ck1.getText()+"\n";
        if(ck2.isChecked()) outputS+=ck2.getText()+"\n";
        if(ck3.isChecked()) outputS+=ck3.getText()+"\n";
        ouput.setText(outputS);
    }
}
