package com.udacity.gradle.builditbigger;

/**
 * This listener is used to return the joke using AsyncTask
 */
public interface OnJokeListener {
    void onGetJoke(String joke);
}
