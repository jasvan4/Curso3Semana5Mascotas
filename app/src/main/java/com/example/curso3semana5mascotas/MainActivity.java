package com.example.curso3semana5mascotas;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.curso3semana5mascotas.fragment.RecyclervVewFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
	
	private Toolbar toolbar;
	private TabLayout tabLayout;
	private ViewPager viewPager;
	
	@Override
	protected void onCreate ( Bundle savedInstanceState ) {
		super.onCreate (savedInstanceState);
		setContentView (R.layout.activity_main);
		
		toolbar = (Toolbar) findViewById (R.id.toolbar);
		tabLayout = (TabLayout) findViewById (R.id.tabLayout);
		viewPager = (ViewPager) findViewById (R.id.viewPager);
		
		Log.e("MainActivity", "onCreate");
		setTupViewPager ();
		if ( toolbar != null ){setSupportActionBar (toolbar);}
	}
	private ArrayList< Fragment > agregarFragment(){
		Log.e("MainActivity", "agregarFragments");
		ArrayList<Fragment> fragments = new ArrayList<> ();
		fragments.add (new RecyclervVewFragment ());
		return fragments;
	}
	
	private void setTupViewPager(){
		viewPager.setAdapter (new PageAdapter (getSupportFragmentManager (), agregarFragment ()));
		tabLayout.setupWithViewPager (viewPager);
		tabLayout.getTabAt (0).setIcon (R.drawable.ic_home);
		
	}
	
}