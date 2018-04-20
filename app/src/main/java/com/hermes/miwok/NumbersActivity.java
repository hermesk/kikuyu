package com.hermes.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create aan arrayList of string
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","imwe"));
        words.add(new Word("Two","igiri"));
        words.add(new Word("Three","Ithatu"));
        words.add(new Word("Four","inya"));
        words.add(new Word("Five","ithano"));
        words.add(new Word("Six","ithathatu"));
        words.add(new Word("Seven","mugwanja"));
        words.add(new Word("Eight","inyanya"));
        words.add(new Word("Nine","kenda"));
        words.add(new Word("Ten","ikumi"));


        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
