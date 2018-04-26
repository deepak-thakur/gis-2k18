package com.udacity.googleindiascholarships.profile;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by tavishjain on 26-04-2018.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "About", "GIS", "Projects" };

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutTab();
            case 1:
                return new GisTab();
            case 2:
                return new ProjectsTab();
            default:
                break;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}