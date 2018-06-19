package com.example.user.restaurant_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderArrayAdapter extends BaseAdapter{

    private List<Map<String, Object>> data;
    private LayoutInflater layoutInflater;
    private Context context;

    public OrderArrayAdapter(Context context , List<Map<String, Object>> data){
        this.context = context;
        this.data = data;
        this.layoutInflater = layoutInflater.from(context);
    }

    public final class ItemObject{
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView (int posititon, View convertView, ViewGroup parent) {

        ItemObject itemObject = null;

        if (convertView == null) {
            itemObject = new ItemObject();
            convertView = layoutInflater.inflate(R.layout.fragment_order2,null);
            itemObject.imageView = (ImageView)convertView.findViewById(R.id.order_image);
            itemObject.textView = (TextView)convertView.findViewById(R.id.order_name);
            convertView.setTag(itemObject);
        }
        else
        {
            itemObject = (ItemObject)convertView.getTag();
        }

        itemObject.imageView.setBackgroundResource((Integer)data.get(posititon).get("image"));
        itemObject.textView.setText((String)data.get(posititon).get("name"));

        return convertView;

    }
}
