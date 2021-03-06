
/**
 * MIT License

 Copyright (c) 2018 Stefanie Molin

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mURL;

    public Earthquake(String location, long unixtime, double magnitude, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = unixtime;
        this.mURL = url;
    }

    /**
     * Get the magnitude of the earthquake
     * @return magnitude as double
     */
    public double getMagnitude() {
        return this.mMagnitude;
    }

    /**
     * Get the location of the earthquake
     * @return location as a string
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the unixtime of the earthquake
     * @return unixtime as long
     */
    public long getTime() {
        return mTimeInMilliseconds;
    }

    /**
     * Get the url of the earthquake
     * @return url as a string
     */
    public String getURL() {
        return mURL;
    }
}
