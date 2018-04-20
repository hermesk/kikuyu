package com.hermes.miwok;

public class Word {

    /** Default Translation of the word**/
    private String mDefaultTranslation;
    /** Miwok Translation of the word**/
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get Default translation
     */
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get Miwok translation
     */
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
