package com.example.nativeapp;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.nativeapp.adapters.DanhBaAdapter;
import com.example.nativeapp.models.DanhBa;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    ListView lvlCustom;
    ArrayList<DanhBa> arrDb;
    DanhBaAdapter adapter;
    ArrayAdapter<String> ada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        lvlCustom=findViewById(R.id.lvlCustom);

        arrDb=new ArrayList<DanhBa>();
        arrDb.add(new DanhBa(1,"abc","095034869"));
        arrDb.add(new DanhBa(2,"abc","095034869"));
        arrDb.add(new DanhBa(3,"abc","095034869"));

        adapter=new DanhBaAdapter(Main4Activity.this,R.layout.item,arrDb);
        lvlCustom.setAdapter(adapter);
    }
}
