package com.csgo.sentes.csgocallouts;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.csgo.sentes.csgocallouts.models.Map;

import java.util.ArrayList;

/**
 * Created by Faßreiter on 02.02.2017.
 */

public class MapAdapter extends ArrayAdapter<Map> {
    private int color_category;

    public MapAdapter(Activity act, ArrayList<Map> maps) {
        super(act, 0, maps);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Map currentMap = getItem(position);

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }

        TextView tvDefault = (TextView) listItemView.findViewById(R.id.title);
        tvDefault.setText(currentMap.getTitle());



        ImageView iv = (ImageView) listItemView.findViewById(R.id.image_map);
        if(currentMap.hasImage()) {
            iv.setImageResource(currentMap.getImage());
            iv.setVisibility(View.VISIBLE);
        } else {
            iv.setVisibility(View.GONE);
        }

        return listItemView;
    }
}