package com.example.thagadur.tabfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thagadur on 9/1/2017.
 */

public class SectionsPageAdapter extends FragmentPagerAdapter {
    //Created a list which hold fragments and another which holds title
    private final List<Fragment> mFragmentList=new ArrayList<>();
    private final List<String> mFragmentTitleList=new ArrayList<>();

    //Function for adding Fragments and title to the list
    public void addFragment(Fragment fragment,String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    //Contructor
    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    //Returns title position
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    //Returns Fragment List position
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    //Returns Fragment List size
    @Override
    public int getCount() {
        return  mFragmentList.size();
    }
}
