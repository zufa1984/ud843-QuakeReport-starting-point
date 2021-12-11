package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

class EarthquakeLoader extends AsyncTaskLoader<List<Constructor>> {



    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link EarthquakeLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i("Test logs", "onLoadFinished");
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Constructor> loadInBackground() {
        Log.i("Test logs", "onLoadFinished");
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Constructor> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}