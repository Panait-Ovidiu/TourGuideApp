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
public class ChurchesFragment extends Fragment {
    public ChurchesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Location> words = new ArrayList<>();
        words.add(new Location(R.string.churchesName_1, R.string.location, R.string.churchesAddress_1,
                R.string.churchesDescription_1, R.drawable.churches1));
        words.add(new Location(R.string.churchesName_2, R.string.location, R.string.churchesAddress_2,
                R.string.churchesDescription_2, R.drawable.churches2));

        LocationAdapter adapter = new LocationAdapter(getActivity(), words, R.color.item_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}