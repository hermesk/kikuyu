package com.hermes.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //create aan arrayList of string
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?","wathii ku?"));
        words.add(new Word("What is your name?","witagwo atia"));
        words.add(new Word("My name is ...","njitagwo ..."));
        words.add(new Word("How are you feeling?","uraigua atia"));
        words.add(new Word("Am feeling good","ndiraigua wega"));
        words.add(new Word("Are you coming?","ni uroka?"));
        words.add(new Word("Yes am coming","ii nindiroka"));
        words.add(new Word("Am coming","nindiroka"));
        words.add(new Word("Lets go","nituthii"));
        words.add(new Word("Come here","uka haha"));
        words.add(new Word("How are you?","niatia?"));
        words.add(new Word("Am fine","ndi mwega"));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
