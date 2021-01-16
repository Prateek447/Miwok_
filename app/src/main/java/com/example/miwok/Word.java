package com.example.miwok;

public class Word {

    private String mDefaultTransalation;
    private  String mMiwokTranslation;
    private  int  mImageResourceId=ID_PROVIDED;
    private int mAudioResourceId;
    private static final int ID_PROVIDED = -1;

    public Word(String defaultTransalation, String miwokTransalation, int audioResourceId){
        mDefaultTransalation=defaultTransalation;
        mMiwokTranslation=miwokTransalation;
        mAudioResourceId=audioResourceId;
    }

    public Word(String defaultTransalation, String miwokTransalation,int imageResourceId, int audioResorceId){
        mDefaultTransalation=defaultTransalation;
        mMiwokTranslation=miwokTransalation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResorceId;
    }

    public String getmDefaultTransalation(){
        return mDefaultTransalation;
    }

    public  String getmMiwokTranslation(){
        return  mMiwokTranslation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public int getmAudioResourceId(){
        return  mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=ID_PROVIDED;
    }
}
