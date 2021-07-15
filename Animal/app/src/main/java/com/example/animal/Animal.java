package com.example.animal;

public class Animal {
    private String mName;
    private String mSound;
    private int mImage;
    private  String mType;

    public Animal(int mImage,String mName, String mSound,  String mType) {
        this.mName = mName;
        this.mSound = mSound;
        this.mImage = mImage;
        this.mType = mType;
    }

    public String getmName() {
        return mName;
    }

    public String getmSound() {
        return mSound;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmType() {
        return mType;
    }
}
