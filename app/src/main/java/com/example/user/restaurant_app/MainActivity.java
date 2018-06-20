package com.example.user.restaurant_app;

import android.app.ListActivity;
import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();

       albumlist.add(new AlbumItem("隨義煮",R.drawable.pic_for_restaurant));

       AlbumArrayAdapter adapter = new AlbumArrayAdapter(this,albumlist);

       lv = (ListView) findViewById(R.id.list);
       lv.setAdapter(adapter);
       lv.setOnItemClickListener(itemclick);



    }


    AdapterView.OnItemClickListener itemclick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    };
}
