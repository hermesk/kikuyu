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

        words.add(new Word("Father","baba",R.drawable.family_father));
        words.add(new Word("Mother","mami",R.drawable.family_mother));
        words.add(new Word("Grandmother","cucu",R.drawable.family_grandmother));
        words.add(new Word("Grandfather","guka",R.drawable.family_grandfather));
        words.add(new Word("Uncle","mama",R.drawable.family_father));
        words.add(new Word("Aunt","tata",R.drawable.family_mother));
        words.add(new Word("Brother","muru wa maitu",R.drawable.family_younger_brother));
        words.add(new Word("Sister","mwari wa maitu",R.drawable.family_younger_sister));
        words.add(new Word("Wife","mutumia",R.drawable.family_older_sister));
        words.add(new Word("Husband","muthuri",R.drawable.family_older_brother));
        words.add(new Word("Son","murue",R.drawable.family_son));
        words.add(new Word("Daughter","mwariwe",R.drawable.family_daughter));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
