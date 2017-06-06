package com.expertgs.expertgs.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.expertgs.expertgs.R;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        if(getSupportActionBar()!=null) {
            getSupportActionBar().hide();
        }

        ListenerSetup();
    }


    public void ListenerSetup(){

        CardView aboutView = (CardView)findViewById(R.id.about);
        aboutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categories.this, About.class));
            }
        });

        CardView softwareView = (CardView)findViewById(R.id.software);
        softwareView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categories.this, Test.class));
            }
        });

        CardView carsView = (CardView)findViewById(R.id.cars);
        carsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categories.this, Test.class));
            }
        });

        CardView consultingView = (CardView)findViewById(R.id.consulting);
        consultingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categories.this, Test.class));
            }
        });

        CardView mechanicalView = (CardView)findViewById(R.id.mechanical);
        mechanicalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categories.this, Test.class));
            }
        });

        CardView embeddedView = (CardView)findViewById(R.id.embedded);
        embeddedView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categories.this, Test.class));
            }
        });

        CardView publicationsView = (CardView)findViewById(R.id.publications);
        publicationsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categories.this, Test.class));
            }
        });

        CardView jobsView = (CardView)findViewById(R.id.jobs);
        jobsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Categories.this, Test.class));
            }
        });

    }
}
