package com.expertgs.expertgs;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.expertgs.expertgs.Activities.Categories;
import com.expertgs.expertgs.Activities.Test;

import mehdi.sakout.fancybuttons.FancyButton;

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

        FancyButton launchButton = (FancyButton)findViewById(R.id.launch_btn);
        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Categories.class));
                finish();
            }
        });

    }

}
