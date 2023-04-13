package com.example.earthquake2;

public class Earthquake {/** Magnitude of Earthquake */
private String mMagnitude;

    /** Location of Earthquake */
    private String mLocation;

    /** Date of Earthquake */
    private String mDate;

    /**
     * Constructor a new {@link Earthquake} Object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earhquake happened
     */
    public Earthquake(String magnitude, String location, String date ){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /** Return the magnitude of the earthquake. */
    public String getmMagnitude(){
        return mMagnitude;
    }

    /** Return the location of the earthquake. */
    public String getmLocation(){
        return mLocation;
    }

    /** Return the date of the earthquake. */
    public String getmDate(){
        return mDate;
    }


}
