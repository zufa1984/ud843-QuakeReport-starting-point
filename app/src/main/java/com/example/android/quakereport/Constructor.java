package com.example.android.quakereport;

public class Constructor {

    private Double mMagnitude;
    private String mPlace;
    private long mTime;
    private String mUrl;

    public Constructor(Double magnitude, String place, long time, String url) {
        this.mMagnitude = magnitude;
        this.mPlace = place;
        this.mTime = time;
        this.mUrl = url;


    }

    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public long getmTime() {
        return mTime;
    }

    public String getmUrl() {
        return mUrl;
    }
}
