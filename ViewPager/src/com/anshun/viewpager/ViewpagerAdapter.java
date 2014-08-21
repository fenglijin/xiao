package com.anshun.viewpager;
import java.util.ArrayList;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
public class ViewpagerAdapter extends PagerAdapter {
  private ArrayList<View> dataList;
  public ViewpagerAdapter(ArrayList<View> dataList){
	  this.dataList=dataList;
  }
	@Override
	public int getCount() {	
		return dataList.size();
	}
	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0==arg1;
	}
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		View view=dataList.get(position);
		container.removeView(view);
	}
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
	   View view=dataList.get(position);
	   container.addView(view);
		return view;
	}
}
