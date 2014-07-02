package com.kevin.sodoku;

import android.app.Activity;
import android.os.Bundle;

/**
 *
 * @author kevin
 */
public class About extends Activity {

    /**
     * Called when the activity is first created.
     * @param icicle
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.about);     
    }
    
}