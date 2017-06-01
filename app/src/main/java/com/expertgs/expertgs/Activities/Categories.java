package com.expertgs.expertgs.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.expertgs.expertgs.R;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        if(getSupportActionBar()!=null) {
            getSupportActionBar().hide();
        }
    }
}
