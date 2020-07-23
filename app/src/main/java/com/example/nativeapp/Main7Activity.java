package com.example.nativeapp;

import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.nativeapp.adapters.ImageAdapter;
import com.example.nativeapp.models.ImageModel;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {

    ImageAdapter adapter;
    GridView gridHinh;
    ArrayList<ImageModel> dsImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        dsImage=new ArrayList<ImageModel>();

        gridHinh=findViewById(R.id.gridHinh);

        dsImage.add(new ImageModel(10,R.drawable.h1));
        dsImage.add(new ImageModel(12,R.drawable.h2));
        dsImage.add(new ImageModel(7,R.drawable.h3));
        dsImage.add(new ImageModel(170,R.drawable.h4));
        dsImage.add(new ImageModel(105,R.drawable.h5));
        dsImage.add(new ImageModel(22,R.drawable.h6));
        dsImage.add(new ImageModel(19,R.drawable.h7));
        dsImage.add(new ImageModel(30,R.drawable.h8));
        dsImage.add(new ImageModel(27,R.drawable.h9));
        dsImage.add(new ImageModel(18,R.drawable.h10));

        adapter=new ImageAdapter(Main7Activity.this,R.layout.items,dsImage);
        gridHinh.setAdapter(adapter);
    }
}
