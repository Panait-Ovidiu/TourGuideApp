package com.example.ovidiu.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ovidiu on 7/23/2017.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.item_name);
        name.setText(currentLocation.getName());

        TextView city = (TextView) listItemView.findViewById(R.id.item_location);
        city.setText(currentLocation.getCity());

        TextView address = (TextView) listItemView.findViewById(R.id.item_address);
        address.setText(currentLocation.getAddress());

        TextView description = (TextView) listItemView.findViewById(R.id.item_description);
        description.setText(currentLocation.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentLocation.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
