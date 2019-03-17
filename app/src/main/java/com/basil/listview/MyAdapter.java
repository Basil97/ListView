package com.basil.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    ArrayList<DataItems> data;
    Context context;

    public MyAdapter(Context context, ArrayList<DataItems> data) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public DataItems getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View mView = inflater.inflate(R.layout.list_item, null);

        ImageView image = mView.findViewById(R.id.img);
        TextView text = mView.findViewById(R.id.txt);

        image.setImageResource(data.get(position).id);
        text.setText(getItem(position).name);

        return mView;
    }
}
