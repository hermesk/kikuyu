package com.hermes.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.media.MediaPlayer;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
private  MediaPlayer mMediaPlayer;
   /**
     * Handles audio focus when playing a sound file
     */
   private android.media.AudioManager mAudioManager;

       /**
     * This listener gets triggered whenever the audio focus changes
     * (i.e., we gain or lose audio focus because of another app or device).
     */
    private android.media.AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new android.media.AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {


              mAudioManager = (android.media.AudioManager) getSystemService(android.content.Context.AUDIO_SERVICE);

               // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
                // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
                // our app is allowed to continue playing sound but at a lower volume. We'll treat
                // both cases the same way because our app is playing short sound files.

                // Pause playback and reset player to the start of the file. That way, we can
                // play the word from the beginning when we resume playback.
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);

            } else if (focusChange == android.media.AudioManager.AUDIOFOCUS_GAIN) {
                // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
                mMediaPlayer.start();
            } else if (focusChange == android.media.AudioManager.AUDIOFOCUS_LOSS) {
                // The AUDIOFOCUS_LOSS case means we've lost audio focus and
                // Stop playback and clean up resources
               releaseMediaPlayer();
           }
        }
    };

   private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
       @Override
       public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //create aan arrayList of string
     final   ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("White","mweru",R.drawable.color_white,R.raw.color_white));
        words.add(new Word("Red","mutune",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("Black","muiru",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("Brown","gitiiri",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("Yellow","Ngoikoni",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new Word("Blue","Mbiruiru",R.drawable.blue,R.raw.color_white));
        words.add(new Word("Purple","Gakarau",R.drawable.purple,R.raw.color_white));
        words.add(new Word("Grey","kibuu / kimuhu",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("green","Nyeni",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("Orange","Ngoikoni",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));



        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
           listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
                Word word = words.get(position);

            // Request audio focus so in order to play the audio file. The app needs to play a
                // short audio file, so we will request audio focus with a short amount of time
                // with AUDIOFOCUS_GAIN_TRANSIENT.
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        android.media.AudioManager.STREAM_MUSIC, android.media.AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now.

                    // Create and setup the {@link MediaPlayer} for the audio resource associated
                    // with the current word
                    mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());

                    // Start the audio file
                    mMediaPlayer.start();

                    // Setup a listener on the media player, so that we can stop and release the
                    // media player once the sound has finished playing.
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
   }
               /**
    /**
     * Clean up the media player by releasing its resources.
     */
 private void releaseMediaPlayer() {
    // If the media player is not null, then it may be currently playing a sound.
    if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

                       // Regardless of whether or not we were granted audio focus, abandon it. This also
         // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
              mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
    }
}
}

