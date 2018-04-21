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

        words.add(new Word("One","imwe",R.drawable.number_one));
        words.add(new Word("Two","igiri",R.drawable.number_two));
        words.add(new Word("Three","Ithatu",R.drawable.number_three));
        words.add(new Word("Four","inya",R.drawable.number_four));
        words.add(new Word("Five","ithano",R.drawable.number_five));
        words.add(new Word("Six","ithathatu",R.drawable.number_six));
        words.add(new Word("Seven","mugwanja",R.drawable.number_seven));
        words.add(new Word("Eight","inyanya",R.drawable.number_eight));
        words.add(new Word("Nine","kenda",R.drawable.number_nine));
        words.add(new Word("Ten","ikumi",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
