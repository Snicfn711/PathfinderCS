package com.stephen.pathfindercs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Stephen on 9/1/2015.
 */
public class myFragAdapter extends FragmentPagerAdapter
{
    public int getCount()
    {
        return 3;
    }

    public Fragment getItem(int i)
    {
        switch(i)
        {
            case 0:
                return StatScreen.newInstance(0, "Stats");
            case 1:
                return SkillScreen.newInstance(1, "Skills");
            default:
                return StatScreen.newInstance(2,"");
        }

    }


    public myFragAdapter(FragmentManager fm) {
        super(fm);
    }

}
