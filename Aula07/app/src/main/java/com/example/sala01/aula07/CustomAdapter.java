package com.example.sala01.aula07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sala01 on 12/05/2017.
 */

public class CustomAdapter extends ArrayAdapter<Item> {

    Context context;
    List<Item> item;


    public CustomAdapter(Context context, List<Item> items){
        super(context, R.layout.item, items);
        this.context = context;
        this.item = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Get the data item for this position
        Item item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.namelbl);
        TextView tvDesc = (TextView) convertView.findViewById(R.id.desclbl);
        // Populate the data into the template view using the data object
        tvName.setText(item.name);
        tvDesc.setText(item.local);
        // Return the completed view to render on screen
        return convertView;


    }

    class ViewHolder{

    }
}
