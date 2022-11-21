package com.example.human_scenario_understanding_v2;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout lay = (ConstraintLayout) findViewById(R.id.main_layout);

        lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camIntent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(camIntent);

            }
        });
    }
}