package com.example.shreyanshushekhar.advitiya;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class competition extends AppCompatActivity {

//    private FloatingActionButton btn1;
    public void btnPressed(View view){
        Toast.makeText(competition.this, "clicked btn 1", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competition);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*btn1 = (FloatingActionButton) findViewById(R.id.menu_item1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(competition.this, "clicked btn 1", Toast.LENGTH_SHORT).show();
            }
        });

        }*/


    }
}
