package com.example.cs188project3;


import java.util.Locale;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.cs188project3.Iowa.PlaceholderFragment4;

public class GrilledCorn extends FragmentActivity {
	
	ViewPager myViewPager;
	SectionsPagerAdapter mSectionsPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grilled_corn);
		
		mSectionsPagerAdapter = new SectionsPagerAdapter(this, myViewPager);

		// Set up the ViewPager with the sections adapter.
		myViewPager = (ViewPager) findViewById(R.id.vpPager2);
		myViewPager.setAdapter(mSectionsPagerAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.walking_taco, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

		public SectionsPagerAdapter(FragmentActivity fm, ViewPager pager) {
			super(fm.getSupportFragmentManager());

		}

		@Override
		public Fragment getItem(int position) {

			// getItem is called to instantiate the fragment for the given page.
			// Return a PlaceholderFragment (defined as a static inner class
			// below).

			if (position == 0) {
				return PlaceholderFragment1.newInstance(position + 1);
			}

			else if (position == 1) {
				return PlaceholderFragment2.newInstance(position + 2);
			}
			else {
				return PlaceholderFragment4.newInstance(position +3);
			}
		}

		@Override
		public int getCount() {
			// Show 4 total pages.
			return 3;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {

			case 0:

				String title1 = "Directions";
				return title1;

			case 1:

				String title2 = "Summary";
				return title2;
				
			case 2:

				String title3 = "Ingredients";
				return title3;
				
			}
			return null;
		}
	}

	public static class PlaceholderFragment1 extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */

		public static PlaceholderFragment1 newInstance(int sectionNumber) {

			PlaceholderFragment1 fragment = new PlaceholderFragment1();
			Bundle args = new Bundle();

			args.putInt(ARG_SECTION_NUMBER, sectionNumber);

			fragment.setArguments(args);
			return fragment;

		}

		public PlaceholderFragment1() {
		}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			final View rootView = inflater.inflate(R.layout.directions, container,
					false);	
			
			return rootView;
		}
		
		

	}
	
	public static class PlaceholderFragment2 extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */

		public static PlaceholderFragment2 newInstance(int sectionNumber) {

			PlaceholderFragment2 fragment = new PlaceholderFragment2();
			Bundle args = new Bundle();

			args.putInt(ARG_SECTION_NUMBER, sectionNumber);

			fragment.setArguments(args);
			return fragment;

		}

		public PlaceholderFragment2() {
		}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.summary, container,
					false);			
			return rootView;
		}

	}
	
	public static class PlaceholderFragment3 extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */

		public static PlaceholderFragment3 newInstance(int sectionNumber) {

			PlaceholderFragment3 fragment = new PlaceholderFragment3();
			Bundle args = new Bundle();

			args.putInt(ARG_SECTION_NUMBER, sectionNumber);

			fragment.setArguments(args);
			return fragment;

		}

		public PlaceholderFragment3() {
		}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.ingredients, container,
					false);			
			return rootView;
		}

	}
}
