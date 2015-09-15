package com.example.samsung.demolist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

ListView studentsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        //nameLabel = (TextView) findViewById(R.id.label_name);
        studentsListView = (ListView) findViewById(R.id.list);
        OceanAdapter adapter = new OceanAdapter(this, new OceanGenerator().generate());
        studentsListView.setAdapter(adapter);

    }
}
