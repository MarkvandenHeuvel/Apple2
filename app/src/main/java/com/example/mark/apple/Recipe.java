package com.example.mark.apple;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.NumberPicker;

public class Recipe extends AppCompatActivity {


    NumberPicker numberPicker = null;
    ImageButton environmentBtn;
    ImageButton waterBtn;
    ImageButton carbonBtn;
    ImageButton timeBtn;
    ImageButton difficultyBtn;
    ImageButton priceBtn;
    ImageButton rankingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker.setMaxValue(100);
        numberPicker.setMinValue(1);
        numberPicker.setWrapSelectorWheel(false);



        //POP-UP'S FOR INFORMATION IN THE INFORMATION SECTION

        environmentBtn = (ImageButton) findViewById(R.id.environmentBtn);
        waterBtn = (ImageButton) findViewById(R.id.waterBtn);
        carbonBtn = (ImageButton) findViewById(R.id.carbonBtn);
        timeBtn = (ImageButton) findViewById(R.id.timeBtn);
        difficultyBtn = (ImageButton) findViewById(R.id.difficultyBtn);
        priceBtn = (ImageButton) findViewById(R.id.priceBtn);
        rankingBtn = (ImageButton) findViewById(R.id.ratingBtn);

        environmentBtn = (ImageButton) findViewById(R.id.environmentBtn);
        environmentBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), PopupEnvironment.class));
            }
        });

        waterBtn = (ImageButton) findViewById(R.id.waterBtn);
        waterBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), PopupWater.class));
            }
        });

        carbonBtn = (ImageButton) findViewById(R.id.carbonBtn);
        carbonBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), PopupCarbon.class));
            }
        });

        timeBtn = (ImageButton) findViewById(R.id.timeBtn);
        timeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), PopupTime.class));
            }
        });

        difficultyBtn = (ImageButton) findViewById(R.id.difficultyBtn);
        difficultyBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), PopupDifficulty.class));
            }
        });

        priceBtn = (ImageButton) findViewById(R.id.priceBtn);
        priceBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), PopupPrice.class));
            }
        });

        rankingBtn = (ImageButton) findViewById(R.id.ratingBtn);
        rankingBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), PopupRanking.class));
            }
        });



        //AMOUNT OF INGREDIENTS - NUMBER PICKER

        //In the ingredient section, there is a numberPicker that will enable the user to select the number
        //of servings. A button has to be added read out the information (or this can be done automatically
        //after some time the numberPicker has not been changed??)


        //int number = numberPicker.getValue();
        //float servingsAmount = (float) number;
        //float ingredientAmount = servingsAmount * ingredientPerPerson;
                            //has to be run multiple times, for all ingredients
                            //ingredientAmount depends on the current ingredient (different for every ingredient)
                            //ingredientPerPerson depends on the current ingredient (amount of ingredient for one person)
        //totalTextView.setText(Float.toString(ingredientAmount));
                            //this is an example of how the calculated result can be used to put in a text view



        //TO DO:
            //get ranking things
            //finish number picker
            //Add button to number picker
            //Add caption to number picker



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_henkhenkdehenkhenk, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
