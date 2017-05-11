package com.example.sala01.aula04;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

public class MainActivity extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonClick(View view){
        switch (view.getId()){
            case R.id.button1:
                dialogDefault();
                break;
            case R.id.button2:

                break;
            case R.id.button3:
                listDialog();
                break;
            case R.id.button4:
                break;

        }
    }

    public void dialogDefault(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.title);

        builder.setMessage(R.string.description)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
            .setNegativeButton(R.string.no, new DialogInterface.OnClickListener(){
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create();
        builder.show();

    }

    /*public void materialDialog(){
        new MaterialDialog().Builder(this)
                .positiveText(R.string.yes)
                .positiveColorRes(R.color.colorAccent)
                .onPositive(new MaterialDialog.SingleButtonCallback(){
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog,
                                        @NonNull DialogAction white) {
                        finish();
                    }
                })
                .negativeText(R.){

                }

    }*/


    public void listDialog(){
        new MaterialDialog.Builder(this)
                .title(R.string.title)
                .items(R.array.mArray)
                .itemsCallback(new MaterialDialog.ListCallback() {
            @Override
            public void onSelection (MaterialDialog dialog, View view, int which, CharSequence text){
                String[] mArray = getResources().getStringArray(R.array.mArray);

                textView.setText(mArray[which]);
            }

        })
        .show();

    }


}
