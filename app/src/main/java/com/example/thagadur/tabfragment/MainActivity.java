package com.example.thagadur.tabfragment;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaration of objects
    private SectionsPageAdapter mSectionsPageAdapter;
    TabLayout tabLayout;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //to set the title text color
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);

        mSectionsPageAdapter =new SectionsPageAdapter(getSupportFragmentManager());

        //setup up the ViewPager with the Sections Adapter
        mViewPager=(ViewPager)findViewById(R.id.container);
        setupPageviewer(mViewPager);
        //setting the page with tablaout
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }
    //adding fragments to the page View
    public void setupPageviewer(ViewPager viewPager){
        SectionsPageAdapter adapter=new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(),"Tab 1");
        adapter.addFragment(new Tab2Fragment(),"Tab 2");
        viewPager.setAdapter(adapter);
    }
}
