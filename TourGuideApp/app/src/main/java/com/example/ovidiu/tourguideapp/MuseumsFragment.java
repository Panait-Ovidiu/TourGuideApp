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
public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Location> words = new ArrayList<>();
        words.add(new Location(R.string.museumsName_1, R.string.location, R.string.museumsAddress_1,
                R.string.museumsDescription_1, R.drawable.museums1));
        words.add(new Location(R.string.museumsName_2, R.string.location, R.string.museumsAddress_2,
                R.string.museumsDescription_1, R.drawable.museums2));

        LocationAdapter adapter = new LocationAdapter(getActivity(), words, R.color.item_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
