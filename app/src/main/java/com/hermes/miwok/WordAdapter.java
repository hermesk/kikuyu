package com.hermes.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        // find textview in the list_item.xml layout
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getmDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView

        if (currentWord.hasImage()) {
            //set the image view to the resource specified in word
            imageView.setImageResource(currentWord.getmImageResourceId());
            //make sure the image is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //hide the image
            imageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
