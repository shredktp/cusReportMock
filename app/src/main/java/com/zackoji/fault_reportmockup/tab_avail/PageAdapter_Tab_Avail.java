package com.zackoji.fault_reportmockup.tab_avail;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Zackoji on 2/7/2558.
 */
public class PageAdapter_Tab_Avail extends FragmentPagerAdapter {

    private final int PAGE_NUM = 3;

    public PageAdapter_Tab_Avail(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return Fragment_Tab_Avail_M1.newInstance();
        else if (position == 1) return Fragment_Tab_Avail_M2.newInstance();
        else if (position == 2) return Fragment_Tab_Avail_M3.newInstance();
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_NUM;
    }
}
