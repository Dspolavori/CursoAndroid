package com.example.sala01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sala01.cursoandroid.R;

public class Aula01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula01);

        Button button = (Button) findViewById(R.id.BTeste);

        final TextView textView = (TextView) findViewById(R.id.TtextoTeste);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.setText("Fui clicadis!");
            }
        });
    }
}
