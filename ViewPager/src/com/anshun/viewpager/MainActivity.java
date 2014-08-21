package com.anshun.viewpager;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends Activity {
	private ViewPager viewPager;
	private ViewpagerAdapter mAdapter;
	private ArrayList<View> dataList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		  viewPager=(ViewPager) findViewById(R.id.viewpager);
          dataList = new ArrayList<View>();
          LayoutInflater inflater=LayoutInflater.from(this);
          dataList.add(inflater.inflate(R.layout.viewpager_1,null ));
          dataList.add(inflater.inflate(R.layout.viewpager_2,null ));
          dataList.add(inflater.inflate(R.layout.viewpager_3,null ));
	      mAdapter=new ViewpagerAdapter(dataList);
	      viewPager.setAdapter(mAdapter);
	}
	}
