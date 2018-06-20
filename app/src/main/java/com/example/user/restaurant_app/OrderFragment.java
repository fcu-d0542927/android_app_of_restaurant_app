package com.example.user.restaurant_app;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {

    private ListView listview;

    public OrderFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_order, container, false);
        listview = (ListView) view.findViewById(R.id.lv_order);

        List<Map<String, Object>> list = getdata();
        listview.setAdapter(new OrderArrayAdapter(getActivity(), list));

        return view;
    }

    public List<Map<String, Object>> getdata()
    {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        int[] imagArr = {R.drawable.order1, R.drawable.order2, R.drawable.order3, R.drawable.order4, R.drawable.order5,
                R.drawable.order6, R.drawable.order7, R.drawable.order8};
        String[] nameArr = {"煙燻培根起司蛋黃", "蒜辣燻雞蟹肉", "大盤雞", "玫瑰海鮮豬肉炒花香醬", "微辣番茄黃咖哩雞",
                "檸香法式海陸雙拼", "肉醬濃起司培根蛋黃", "經典粉紅肉醬"};

        for(int i=0; i<8 ; i++)
        {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", imagArr[i]);
            map.put("name", nameArr[i]);
            list.add(map);
        }
        return list;
    }
}
