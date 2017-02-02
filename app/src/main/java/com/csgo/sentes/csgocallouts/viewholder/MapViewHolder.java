package com.csgo.sentes.csgocallouts.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import com.csgo.sentes.csgocallouts.R;
import com.csgo.sentes.csgocallouts.models.Map;
/**
 * Created by Faßreiter on 02.02.2017.
 */

public class MapViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;

    public ImageView mapView;


    public MapViewHolder(View itemView) {
        super(itemView);

        titleView = (TextView) itemView.findViewById(R.id.title);

        mapView = (ImageView) itemView.findViewById(R.id.image_map);

    }

    public void bindToMap(Map m) {
        titleView.setText(m.getTitle());
        mapView.setImageAlpha(m.getImage());

    }
}