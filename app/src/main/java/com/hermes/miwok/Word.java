package com.hermes.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default Translation of the word
     **/
    private String mDefaultTranslation;
    /**
     * Miwok Translation of the word
     **/
    private String mMiwokTranslation;

    /** Image resource ID for the word */
  private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * +     * Create a new Word object.
     * +     *
     * +     * @param defaultTranslation is the word in a language that the user is already familiar with
     * +     *                           (such as English)
     * +     * @param miwokTranslation is the word in the Miwok language
     * +     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * +     *
     * +
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get Default translation
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get Miwok translation
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public  boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
