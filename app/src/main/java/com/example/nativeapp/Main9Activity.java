package com.example.nativeapp;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.nativeapp.adapters.MusicAdapter;
import com.example.nativeapp.models.Music;

import java.util.ArrayList;

public class Main9Activity extends AppCompatActivity {

    ListView lvlBaihatgoc;
    ArrayList<Music> lstBaihatgoc;
    MusicAdapter adapterGoc;

    ListView lvlBaihatyeuthich;
    ArrayList<Music> lstBaiyeuthich;
    MusicAdapter adapterYeuthich;

    TabHost tabHost;

    Button btnLike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        tabHost=findViewById(R.id.tabHost);
        tabHost.setup();
        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setIndicator("All");
        tab1.setIndicator("",getResources().getDrawable(R.drawable.icons8_musical_notes_32));
        tab1.setContent(R.id.linear1);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        tab2.setIndicator("Favorite");
        tab2.setIndicator("",getResources().getDrawable(R.drawable.icons8_favorite_folder_32));
        tab2.setContent(R.id.linear2);
        tabHost.addTab(tab2);


        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if(tabId.equalsIgnoreCase("t1"))
                    XuLyAll();
                else
                    if(tabId.equalsIgnoreCase("t2"))
                        XuLyYeuThich();
            }
        });


        lvlBaihatgoc=findViewById(R.id.lvlbaihatGoc);
        lstBaihatgoc=new ArrayList<>();
        adapterGoc=new MusicAdapter(Main9Activity.this, R.layout.itemmusic,lstBaihatgoc);
        lvlBaihatgoc.setAdapter(adapterGoc);

        lvlBaihatyeuthich=findViewById(R.id.lvlbaihatYeuthich);
        lstBaiyeuthich=new ArrayList<>();
        adapterYeuthich=new MusicAdapter(Main9Activity.this, R.layout.itemmusic,lstBaiyeuthich);
        lvlBaihatyeuthich.setAdapter(adapterYeuthich);

        InitData();
    }

    private void XuLyYeuThich() {
        lstBaiyeuthich.clear();
        for(Music ms:lstBaihatgoc){
            if(ms.isLike())
                lstBaiyeuthich.add(ms);
        }
        adapterYeuthich.notifyDataSetChanged();
    }

    private void XuLyAll() {
    }

    private void InitData() {
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",false));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",true));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",false));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",false));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",false));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",false));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",false));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",false));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",true));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",false));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",true));
        lstBaihatgoc.add(new Music("1","Trái tim bên lề","Bằng Kiều",true));
        adapterGoc.notifyDataSetChanged();
    }
}
