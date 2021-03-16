package com.example.ovidiu.tourguideapp;

/**
 * Created by Ovidiu on 7/23/2017.
 */
public class Location {
    private int mName;
    private int mCity;
    private int mAddress;
    private int mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(int Name, int City, int Address, int Description, int imageResourceId) {
        mName = Name;
        mCity = City;
        mAddress = Address;
        mDescription = Description;
        mImageResourceId = imageResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getCity() {
        return mCity;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}