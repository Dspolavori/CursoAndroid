package com.example.sala01.aula05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Item> array = new ArrayList<Item>();
        array.add(new Item("teste 1"));
        array.add(new Item("teste 2"));
        array.add(new Item("teste 3"));

        CustomAdapter itemsAdapter = new CustomAdapter(this, array);

        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setAdapter(itemsAdapter);
    }
}
