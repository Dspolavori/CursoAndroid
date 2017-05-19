package com.example.sala01.doesangue;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.sala01.doesangue.tiposanguineo.TipoSanguineoAdapter;
import com.example.sala01.doesangue.tiposanguineo.TipoSanguineoData;
import com.example.sala01.doesangue.tiposanguineo.TipoSanguineoItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_tipo_sanguineo:
                    navigationTipoSanguineo();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void navigationTipoSanguineo(){
        List<TipoSanguineoItem> items = TipoSanguineoData.getList();

        TipoSanguineoAdapter itemsAdapter = new TipoSanguineoAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.listViewItemTipoSanguineo);
        listView.setAdapter(itemsAdapter);
    }

}
