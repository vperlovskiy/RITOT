package com.android.developer.ritot;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;


/**
 * Created by Pro1 on 31.07.2015.
 */
public class WatchFaceActivity extends ActionBarActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watchface);
        this.getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.activity_watchface);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.arrow_up);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown.
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }



}


