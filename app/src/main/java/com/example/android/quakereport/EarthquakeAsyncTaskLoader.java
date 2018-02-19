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

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthquakeAsyncTaskLoader extends AsyncTaskLoader<List<Earthquake>> {
    private static final String LOG_TAG = EarthquakeAsyncTaskLoader.class.getName();
    private String mURL;

    public EarthquakeAsyncTaskLoader(Context context, String url) {
        super(context);
        this.mURL = url;
        Log.v(LOG_TAG, "Creating a EarthquakeAsyncTaskLoader instance");
    }

    @Override
    protected void onStartLoading() {
        Log.v(LOG_TAG, "onStartLoading() happening now");
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        Log.v(LOG_TAG, "Running background task...");

        // Don't perform the request if there are no URLs, or the first URL is null.
        if (this.mURL == null) {
            return null;
        }

        List<Earthquake> result = QueryUtils.fetchEarthquakeData(this.mURL);
        return result;
    }
}