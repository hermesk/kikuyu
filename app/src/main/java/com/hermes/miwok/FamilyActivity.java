package com.hermes.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //create aan arrayList of string
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father","baba"));
        words.add(new Word("Mother","mami"));
        words.add(new Word("Grandmother","cucu"));
        words.add(new Word("Grandfather","guka"));
        words.add(new Word("Uncle","mama"));
        words.add(new Word("Aunt","tata"));
        words.add(new Word("Brother","muru wa maitu"));
        words.add(new Word("Sister","mwari wa maitu"));
        words.add(new Word("Wife","mutumia"));
        words.add(new Word("Husband","muthuri"));
        words.add(new Word("Son","murue"));
        words.add(new Word("Daughter","mwariwe"));


        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
