package com.hermes.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
//    public void openNumbersList(View view){
//
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
//    }

    public void openFamilyList(View view) {

        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void openPhrasesList(View view) {

        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }

    public void openColorsList(View view) {

        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
}
