package com.example.android.quakereport;

/**
 * Created by Asus on 10/28/2017.
 */

public class Earthquake {
    //Define variables
    double mMagnitude;
    String mLocation;
    long mTimeInMiliseconds;
    String mUrl;
    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliseconds = timeInMilliseconds;
        mUrl = url;
    }
    //Getter methods
    //Get the magnitude of Earthquakes
    public double getMagnitude(){
        return mMagnitude;
    }
    //Get the location
    public String getLocation(){
        return mLocation;
    }
    //Get the time when the earthquakes occured
    public long getTimeInMiliseconds(){
        return mTimeInMiliseconds;
    }
    //Get the website url
    public String getUrl() {
        return mUrl;
    }
    //Setter methods
    //set the magnitude
    public void setMagnitude(double magnitude){
        mMagnitude = magnitude;
    }
    //set the Location
    public void setLocation(String location){
        mLocation = location;
    }
    //set the Time
    public void setTime(long timeInMiliseconds){
        mTimeInMiliseconds = timeInMiliseconds;
    }
}