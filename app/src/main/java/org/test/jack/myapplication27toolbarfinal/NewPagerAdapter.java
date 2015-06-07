package org.test.jack.myapplication27toolbarfinal;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by Jack on 2015/6/6.
 */
public class NewPagerAdapter extends FragmentPagerAdapter {

    String[] tabTitles = {"Tab1","Tab2","Tab3"};

    Context context;

    public NewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {

        if (position ==0){
            return  new FragmentTab1();

        }else if (position ==1){
            return new FragmentTab2();
        }else if (position ==2)
            return new FragmentTab3();


        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
            return tabTitles[position];
    }


}
