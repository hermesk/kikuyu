package com.hermes.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default Translation of the word
     **/
    private String mDefaultTranslation;
    /**
     * Kikuyu Translation of the word
     **/
    private String mKikuyuTranslation;

    /**
     * Image resource ID for the word
     */
  private int mImageResourceId = NO_IMAGE_PROVIDED;

  /**
     * audioResourse ID
     **/
  private  int mAudioResourceId;

    public Word(String defaultTranslation, String kikuyuTranslation, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mKikuyuTranslation = kikuyuTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * +     * Create a new Word object.
     * +     *
     * +     * @param defaultTranslation is the word in a language that the user is already familiar with
     * +     *                           (such as English)
     * +     * @param KikuyuTranslation is the word in the Kikuyu language
     * +     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * +     *
     * +
     */
    public Word(String defaultTranslation, String KikuyuTranslation, int imageResourceId,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mKikuyuTranslation = KikuyuTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    /**
     * Get Default translation
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get Kikuyu translation
     */
    public String getmKikuyuTranslation() {
        return mKikuyuTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public  boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

        /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
