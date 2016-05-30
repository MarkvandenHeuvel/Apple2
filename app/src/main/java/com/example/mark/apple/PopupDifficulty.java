package com.example.mark.apple;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by Mark on 5/23/2016.
 */
public class PopupDifficulty extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.difficultywindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager() .getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8), (int)(height*0.55));


    }

}
