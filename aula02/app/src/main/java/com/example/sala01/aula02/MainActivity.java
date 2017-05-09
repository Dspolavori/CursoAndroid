package com.example.sala01.aula02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.loginBtn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
               goToAnother();
            }
                                  }
        );
    }

    private void  goToAnother(){
        Intent intent = new Intent(this, Main2Activity.class);
        final EditText editText = (EditText) findViewById(R.id.userImp);
        //intent.putExtra("mTag", editText.getText().toString());

        String desc = getResources().getString(R.string.lorem);
        User user = new User (editText.getText().toString(), desc);

        intent.putExtra("mTag", new Gson().toJson(user));

        startActivity(intent);
    }
}
