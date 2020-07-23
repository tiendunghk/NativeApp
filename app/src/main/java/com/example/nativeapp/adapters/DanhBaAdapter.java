package com.example.nativeapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.nativeapp.R;
import com.example.nativeapp.models.DanhBa;

import java.util.List;

public class DanhBaAdapter extends ArrayAdapter<DanhBa>{

    Activity context;
    int resource;
    List<DanhBa> objects;
    public DanhBaAdapter(@NonNull Activity context, int resource, @NonNull List<DanhBa> objects) {
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
        TextView txtTen=row.findViewById(R.id.txtTen);
        TextView txtSDT=row.findViewById(R.id.txtSDT);
        ImageButton btnCall=row.findViewById(R.id.btnCall);
        ImageButton btnDetail=row.findViewById(R.id.btnDetail);
        ImageButton btnSms=row.findViewById(R.id.btnSms);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"aaa",Toast.LENGTH_SHORT).show();
            }
        });

        DanhBa db=this.objects.get(position);
        txtTen.setText(db.getTen());
        txtSDT.setText(db.getSdt());
        return row;
    }
}
