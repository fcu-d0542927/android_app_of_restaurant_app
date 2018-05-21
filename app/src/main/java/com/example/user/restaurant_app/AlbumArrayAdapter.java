package com.example.user.restaurant_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem> {

    Context context;

    public AlbumArrayAdapter(Context context , ArrayList<AlbumItem> items){
        super(context, 0 ,items);
        this.context = context;
    }

    @Override
    public View getView (int posititon, View convertView, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(context);

        LinearLayout itemlayout = null;
        if (convertView == null){
            itemlayout = (LinearLayout) inflater.inflate(R.layout.listitem_for_home,null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }
        AlbumItem item = (AlbumItem) getItem(posititon);

        TextView tv_restname = (TextView) itemlayout.findViewById(R.id.tv_name);
        tv_restname.setText(item.name);

        return itemlayout;
    }

}
