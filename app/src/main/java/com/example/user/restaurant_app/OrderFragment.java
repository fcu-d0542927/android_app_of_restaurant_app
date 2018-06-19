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
        listview = (ListView) view.findViewById(R.id.gv);

        List<Map<String, Object>> list = getdata();
        listview.setAdapter(new OrderArrayAdapter(getActivity(), list));

        return view;
    }

    public List<Map<String, Object>> getdata()
    {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        int[] imagArr;
        String nameArr;

        for(int i=0; i<10 ; i++)
        {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", R.drawable.ic_launcher_background);
            map.put("name", "tag"+i);
            list.add(map);
        }
        return list;
    }
}
