package com.example.nativeapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.nativeapp.R;
import com.example.nativeapp.models.Music;

import java.util.List;

public class MusicAdapter extends ArrayAdapter<Music> {
    Activity context;
    int resource;
    List<Music> objects;
    public MusicAdapter(@NonNull Activity context, int resource, @NonNull List<Music> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);

        TextView txtMabaihat=row.findViewById(R.id.txtMabaihat);
        TextView txtBaihat=row.findViewById(R.id.txtBaihat);
        TextView txtCasi=row.findViewById(R.id.txtCasi);
        ImageView btnLike=row.findViewById(R.id.btnLike);
        ImageView btnDislike=row.findViewById(R.id.btnDislike);





        Music ms=this.objects.get(position);
        txtBaihat.setText(ms.getTen());
        txtCasi.setText(ms.getCaSi());
        txtMabaihat.setText(ms.getMa());

        if(ms.isLike())
            btnLike.setVisibility(View.INVISIBLE);
        else
            if(!ms.isLike())
            btnDislike.setVisibility(View.INVISIBLE);

        return row;
    }
}
