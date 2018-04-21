package com.hermes.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //create aan arrayList of string
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("White","mweru",R.drawable.color_white));
        words.add(new Word("Red","mutune",R.drawable.color_red));
        words.add(new Word("Black","muiru",R.drawable.color_black));
        words.add(new Word("Brown","gitiiri",R.drawable.color_brown));
        words.add(new Word("Yellow","",R.drawable.color_dusty_yellow));
        words.add(new Word("Blue",""));
        words.add(new Word("green","",R.drawable.color_green));
        words.add(new Word("Orange","",R.drawable.color_mustard_yellow));



        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
