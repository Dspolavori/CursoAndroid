package com.example.sala01.aula02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.userLbl);
        String mString = getIntent().getStringExtra("mTag");
        User userGson = new Gson().fromJson(mString, User.class);
        //textView.setText(getIntent().getStringExtra("mTag"));
        textView.setText(userGson.getName());

    }
}
