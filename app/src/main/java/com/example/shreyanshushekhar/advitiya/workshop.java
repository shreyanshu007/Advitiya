package com.example.shreyanshushekhar.advitiya;

import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class workshop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
