package com.example.nativeapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.nativeapp.R;
import com.example.nativeapp.models.ImageModel;

import java.util.List;

public class ImageAdapter extends ArrayAdapter<ImageModel> {
    Activity context;
    int resource;
    List<ImageModel> objects;
    public ImageAdapter(@NonNull Activity context, int resource, @NonNull List<ImageModel> objects) {
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
        ImageView imageView=row.findViewById(R.id.imgHinh);
        TextView txtSoLuong=row.findViewById(R.id.txtSoLuong);
        ImageModel im=this.objects.get(position);
        imageView.setImageResource(im.getIdHinh());
        txtSoLuong.setText(im.getSoluong()+"");
        return row;
    }
}
