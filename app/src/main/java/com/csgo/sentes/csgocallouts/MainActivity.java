package com.csgo.sentes.csgocallouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.csgo.sentes.csgocallouts.models.Map;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_list);

        mListView = (ListView) findViewById(R.id.list);

        final ArrayList<Map> maps = new ArrayList<Map>();
        maps.add(new Map("Dust2", R.drawable.dust2, R.drawable.ca_dust2));
        maps.add(new Map("Mirage", R.drawable.mirage, R.drawable.ca_mirage));
        maps.add(new Map("Cache", R.drawable.cache, R.drawable.ca_cache));
        maps.add(new Map("Cobblestone", R.drawable.cobblestone, R.drawable.ca_cobblestone));
        maps.add(new Map("Inferno", R.drawable.inferno, R.drawable.ca_inferno));
        maps.add(new Map("Train",R.drawable.train, R.drawable.ca_train));
        maps.add(new Map("Overpass", R.drawable.overpass, R.drawable.ca_overpass));
        maps.add(new Map("Nuke", R.drawable.nuke, R.drawable.ca_nuke));
        maps.add(new Map("Canals", R.drawable.canals, R.drawable.ca_canals));
        MapAdapter ma = new MapAdapter(this, maps);

        if(mListView != null)
            mListView.setAdapter(ma);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Map current = (Map) mListView.getItemAtPosition(position);
                Intent myIntent = new Intent(MainActivity.this, CalloutActivity.class);
                myIntent.putExtra("imageRecource", current.getCalloutImage()); //Optional parameters
                MainActivity.this.startActivity(myIntent);


            }
        });
    }

}
