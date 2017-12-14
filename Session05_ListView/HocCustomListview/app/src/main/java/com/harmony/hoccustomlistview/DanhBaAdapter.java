package com.harmony.hoccustomlistview;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Harmony on 12/2/2017.
 */

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {

    Activity context;
    int resource;
    List<DanhBa> objects;

    public DanhBaAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(resource, parent, false);

        DanhBa danhBa = objects.get(position);

        ImageView imgAvatar = convertView.findViewById(R.id.imgAvatar);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvSDT = convertView.findViewById(R.id.tvSDT);

        imgAvatar.setImageResource(danhBa.getHinh());
        tvName.setText(danhBa.getName());
        tvSDT.setText(danhBa.getSdt());

        return convertView;
    }
}
