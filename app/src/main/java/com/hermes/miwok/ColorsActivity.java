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

        words.add(new Word("White","mweru"));
        words.add(new Word("Red","mutune"));
        words.add(new Word("Black","muiru"));
        words.add(new Word("Brown","gitiiri"));
        words.add(new Word("Yellow",""));
        words.add(new Word("Blue",""));
        words.add(new Word("Pink",""));
        words.add(new Word("Orange",""));



        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
