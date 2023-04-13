package com.example.earthquake2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Constructors a new {@link EarthquakeAdapter}
     *
     * @param context of app
     * @param earthquakes is the list of the earthquakes, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }

    /** Returns a list Item view that display the information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise if convertView is null, then inflate a new List item layout.
        View listItemView = convertView;
        if (listItemView == null){
            LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_items, parent, false);
        }
        // Find the eartthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView with view ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Display the magnitude of the current earthquake in that TextView
        assert currentEarthquake != null;
        magnitudeView.setText(currentEarthquake.getmMagnitude());

        // Find the TextView with view ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        // Display the location of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getmLocation());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date of the current earthquake in that TextView
        dateView.setText(currentEarthquake.getmDate());

        // Return the list item view that is now showing the appropirate data
        return listItemView;

    }
}
