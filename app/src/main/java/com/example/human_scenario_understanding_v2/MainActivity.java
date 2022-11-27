package com.example.human_scenario_understanding_v2;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.view.View;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

public class MainActivity extends AppCompatActivity{
    //EditText editText;
    //Button btnText;
    TextToSpeech tts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout lay = (ConstraintLayout) findViewById(R.id.main_layout);
        String text = "Scene It. Human Scenario Understanding. Tap Anywhere to Continue.";
        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

                // if No error is found then only it will run
                if(i!=TextToSpeech.ERROR){
                    // To Choose language of speech
                    tts.setLanguage(Locale.US);
                    tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                }
            }
        });

        lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camIntent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(camIntent);

            }
        });


    }
}