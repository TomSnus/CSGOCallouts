package com.csgo.sentes.csgocallouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class CalloutActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callout);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Intent intent = getIntent();
        int value = intent.getIntExtra("imageRecource", R.drawable.ca_dust2);

        TouchImageView  calloutView = (TouchImageView ) findViewById(R.id.calloutImageView);
        calloutView.setImageResource(value);
        calloutView.setVisibility(View.VISIBLE);
    }
}
