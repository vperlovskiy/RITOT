package com.android.developer.ritot;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


/**
 * Created by Pro1 on 31.07.2015.
 */
public class WatchFaceActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watchface);

        Button button=(Button)findViewById(R.id.button);
        button.setCompoundDrawables(new TextDrawable("Hour"), null, null, null);
    }


}


