package com.example.ovidiu.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class StatuesFragment extends Fragment {
    public StatuesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Location> words = new ArrayList<>();
        words.add(new Location(R.string.statuesName_1, R.string.location, R.string.statuesAddress_1,
                R.string.statuesDescription_1, R.drawable.statues1));
        words.add(new Location(R.string.statuesName_2, R.string.location, R.string.statuesAddress_2,
                R.string.statuesDescription_2, R.drawable.statues2));

        LocationAdapter adapter = new LocationAdapter(getActivity(), words, R.color.item_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
