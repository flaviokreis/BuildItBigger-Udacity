package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * Test JokeAsyncTask
 */
public class JokeAsyncTaskTest extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testJokeAsyncTask(){
        new JokeAsyncTask(new OnJokeListener() {
            @Override
            public void onGetJoke(String joke) {
                assertNotNull(joke);
            }
        }).execute();
    }
}
