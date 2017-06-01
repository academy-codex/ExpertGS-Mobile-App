package com.expertgs.expertgs;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null) {
            getSupportActionBar().hide();
        }

        ConstraintLayout bglayout = (ConstraintLayout)findViewById(R.id.bglayout);

        AnimationDrawable animationDrawable =(AnimationDrawable)bglayout.getBackground();
        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(500);


    }
}
