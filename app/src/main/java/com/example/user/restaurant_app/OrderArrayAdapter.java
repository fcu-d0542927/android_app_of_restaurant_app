package com.example.user.restaurant_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderArrayAdapter extends ArrayAdapter<OrderItem>{

    Context context;

    public OrderArrayAdapter(Context context , ArrayList<OrderItem> items){
        super(context, 0, items);
        this.context = context;
    }

    @Override
    public View getView (int posititon, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        FrameLayout itemlayout = null;

        if (convertView == null) {
            itemlayout = (FrameLayout) inflater.inflate(R.layout.listitem_for_home, null);
        } else {
            itemlayout = (FrameLayout) convertView;
        }

        OrderItem item = (OrderItem)getItem(posititon);
        TextView order_name = (TextView)itemlayout.findViewById(R.id.order_name);
        order_name.setText(item.order_name);
        ImageView order_image = (ImageView)itemlayout.findViewById(R.id.order_image);
        order_image.setImageResource(item.order_image);
        return itemlayout;
    };
}
