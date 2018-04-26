package com.udacity.googleindiascholarships.profile.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.udacity.googleindiascholarships.R;
import com.udacity.googleindiascholarships.profile.TabPagerAdapter;

/**
 * Created by tavishjain on 25-04-2018.
 */

public class ProfileActivity extends AppCompatActivity  {
    private ViewPager viewPager;
    private Toolbar toolbar;
    private TabPagerAdapter tabPagerAdapter;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String[] tabNames = { "About", "GIS", "Projects" };
        fragmentManager = getSupportFragmentManager();
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        toolbar = (Toolbar) findViewById(R.id.profile_toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        tabPagerAdapter = new TabPagerAdapter(fragmentManager);
        viewPager.setAdapter(tabPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}