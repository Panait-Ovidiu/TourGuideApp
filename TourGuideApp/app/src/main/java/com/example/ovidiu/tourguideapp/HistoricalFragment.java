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
public class HistoricalFragment extends Fragment {
    public HistoricalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Location> words = new ArrayList<>();
        words.add(new Location(R.string.historyName_1, R.string.location, R.string.historyAddress_1,
                R.string.historyDescription_1, R.drawable.history1));
        words.add(new Location(R.string.historyName_2, R.string.location, R.string.historyAddress_2,
                R.string.historyDescription_2, R.drawable.history2));

        LocationAdapter adapter = new LocationAdapter(getActivity(), words, R.color.item_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
