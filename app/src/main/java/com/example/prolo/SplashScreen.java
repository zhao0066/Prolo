package com.example.prolo;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    //Animation time on screen
    private static int SPLASH_TIMER = 5000;

    //Variables
    ImageView backgroundImage;
    TextView poweredByLine;

    //Animations
    Animation side_anim,bottom_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);

        //Hooks
        backgroundImage = findViewById(R.id.imageView);
        poweredByLine = findViewById(R.id.prolo_logo);

        //Animations
        side_anim = AnimationUtils.loadAnimation(this,R.anim.side_anim);
        bottom_anim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        // Set Animation on elements
        backgroundImage.setAnimation(side_anim);
        poweredByLine.setAnimation(bottom_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

             // To start next activity
                Intent intent = new Intent ( getApplicationContext(), MainActivity.class );
                startActivity(intent);
                finish();


            }
        },SPLASH_TIMER);

    }




}
