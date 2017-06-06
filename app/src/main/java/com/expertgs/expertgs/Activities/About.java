package com.expertgs.expertgs.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;
import com.expertgs.expertgs.Adapters.ViewPagerAdapter;
import com.expertgs.expertgs.Fragments.FragmentOne;
import com.expertgs.expertgs.Fragments.FragmentThree;
import com.expertgs.expertgs.Fragments.FragmentTwo;
import com.expertgs.expertgs.R;

import me.relex.circleindicator.CircleIndicator;

public class About extends AppCompatActivity {

    ViewPager viewPager;
//    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().hide();

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentOne(), "ONE");
        adapter.addFragment(new FragmentTwo(), "TWO");
        adapter.addFragment(new FragmentThree(), "THREE");
        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true, new RotateUpTransformer());
    }
}
