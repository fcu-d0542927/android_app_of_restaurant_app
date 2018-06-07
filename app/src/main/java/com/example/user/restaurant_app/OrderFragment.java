package com.example.user.restaurant_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {


    public OrderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order, container, false);

        ArrayList<OrderItem> orderlist = new ArrayList<>();

        orderlist.add(new OrderItem("餐點1", R.drawable.order1));
        orderlist.add(new OrderItem("餐點2", R.drawable.order2));
        orderlist.add(new OrderItem("餐點3", R.drawable.order3));

        OrderArrayAdapter adapter = new OrderArrayAdapter(this, orderlist);

        GridView gv = (GridView) container.findViewById(R.id.gv);
        gv.setAdapter(adapter);


    }

}
