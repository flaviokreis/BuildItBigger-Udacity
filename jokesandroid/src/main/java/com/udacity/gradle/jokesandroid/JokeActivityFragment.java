package com.udacity.gradle.jokesandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_joke, container, false);

        Bundle extras = getActivity().getIntent().getExtras();
        if(extras != null){
            String joke = extras.getString(JokeActivity.EXTRA_JOKE);
            ((TextView)view.findViewById(R.id.joke_string)).setText(joke);
        }

        return view;
    }
}
