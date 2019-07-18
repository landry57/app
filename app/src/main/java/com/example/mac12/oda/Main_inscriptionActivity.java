package com.example.mac12.oda;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Main_inscriptionActivity extends AppCompatActivity {
    private TabLayout tablayout;
    private AppBarLayout appBarlayout;
    public ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inscription);

        tablayout = (TabLayout)findViewById(R.id.tablayout_id);
        appBarlayout = (AppBarLayout)findViewById(R.id.appbarid);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);

        viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Inscription_next(),"INSCRIPTION");
        adapter.AddFragment(new Connexion(),"CONNEXION");


        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
    }
}
