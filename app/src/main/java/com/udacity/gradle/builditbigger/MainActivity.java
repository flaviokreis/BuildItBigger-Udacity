package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.udacity.gradle.jokesandroid.JokeActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view){
        new JokeAsyncTask(new OnJokeListener() {
            @Override
            public void onGetJoke(String joke) {
                Intent intent = new Intent(MainActivity.this, JokeActivity.class);
                intent.putExtra(JokeActivity.EXTRA_JOKE, joke);
                startActivity(intent);
            }
        }).execute();
    }

}
