package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view){
//        Joker joker = new Joker();
//        Toast.makeText(this, joker.getJoke(), Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(MainActivity.this, JokeActivity.class);
//        intent.putExtra(JokeActivity.EXTRA_JOKE, joker.getJoke());
//        startActivity(intent);

        new JokeAsyncTask(MainActivity.this).execute();
    }

}
