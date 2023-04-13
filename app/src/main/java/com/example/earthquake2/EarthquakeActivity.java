package com.example.earthquake2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_list_items);

        // Create a fake list of a earthquakes.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("7.2","San Francisco","Feb 2, 2016"));
        earthquakes.add(new Earthquake("6.1","London","July 20, 2015"));
        earthquakes.add(new Earthquake("3.9","Tokyo","Nov 10,2014"));
        earthquakes.add(new Earthquake("5.4","Mexico city", "Mar 3, 2014"));
        earthquakes.add(new Earthquake("2.8","Mascow","Jan 31, 2013"));
        earthquakes.add(new Earthquake("4.9","Rio de Janeiro","Agn 19, 2010"));
        earthquakes.add(new Earthquake("1.6","Paris","Oct 13, 2011"));


        //Create a new adapter that takes the list of the earthquakes as input.
        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);

        // Find the reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);


        // Set on adapter on the {@link ListView}
        // so the list can be pulated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}

