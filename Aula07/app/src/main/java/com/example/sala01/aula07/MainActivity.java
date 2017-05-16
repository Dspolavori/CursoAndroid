package com.example.sala01.aula07;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference reference;
    List<Item> array = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        database = mFireData.getDatabase();

        reference = database.getReference("results/");

        this.setUser();

        array.add(new Item("teste 1"));

        CustomAdapter itemsAdapter = new CustomAdapter(this, array);

        ListView listView = (ListView) findViewById(R.id.lista);
        listView.setAdapter(itemsAdapter);

    }

    private void setUser(){
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(int i = 0; i < dataSnapshot.getChildrenCount(); i++ ){

                    Item item = new Item();
                    item.setName((String)(dataSnapshot.child(i+"/").child("name/").child("first/").getValue()));
                    array.add(item);

                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
