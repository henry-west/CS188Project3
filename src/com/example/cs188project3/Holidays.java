/*
 * This page contains the tabs for the "Holidays" category
 */
package com.example.cs188project3;

import java.util.Locale;

import android.content.Intent;
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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Holidays extends FragmentActivity {

	ViewPager myViewPager2;
	SectionsPagerAdapter mSectionsPagerAdapter2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_holidays);

		mSectionsPagerAdapter2 = new SectionsPagerAdapter(this, myViewPager2);

		// Set up the ViewPager with the sections adapter.
		myViewPager2 = (ViewPager) findViewById(R.id.vpPagerHolidays);
		myViewPager2.setAdapter(mSectionsPagerAdapter2);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.holidays, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// Handle action bar item
		switch(item.getItemId()) {
		case  R.id.home:
			startActivity(new Intent(this, MainActivity.class));
			return true;
		case R.id.states:
			startActivity(new Intent(this, States.class));
			return true;
		case R.id.holidays:

			return true;
		case R.id.potluck:
			startActivity(new Intent(this, Potluck.class));
			return true;
		case R.id.bbc:
			startActivity(new Intent(this, BBC.class));
			return true;
		case R.id.favorites:
			startActivity(new Intent(this, Favorite.class));
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
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
				return PlaceholderFragment5.newInstance(position + 1);
			}

			else if (position == 1) {
				return PlaceholderFragment6.newInstance(position + 2);
			}
			else if (position == 2) {
				return PlaceholderFragment7.newInstance(position + 3);
			}
			else {
				return PlaceholderFragment8.newInstance(position +4);
			}
		}

		@Override
		public int getCount() {
			// Show 4 total pages.
			return 4;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {

			case 0:

				String title1 = "Appetizers";
				return title1;

			case 1:

				String title2 = "Sides and Salads";
				return title2;

			case 2:

				String title3 = "Main Courses";
				return title3;

			case 3:

				String title4 = "Desserts";
				return title4;

			}
			return null;
		}
	}

	public static class PlaceholderFragment5 extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */

		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */

		public static PlaceholderFragment5 newInstance(int sectionNumber) {

			PlaceholderFragment5 fragment = new PlaceholderFragment5();
			Bundle args = new Bundle();

			args.putInt(ARG_SECTION_NUMBER, sectionNumber);

			fragment.setArguments(args);
			return fragment;

		}

		public PlaceholderFragment5() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			final View rootView = inflater.inflate(R.layout.appetizers, container,
					false);	
			//get the names, descriptions, and pictures for each recipe and use them
			//to populate the list view
			String[] sides = {"Appetizer 1", "Appetizer 2", "Appetizer 3", "Appetizer 4"};
			String[] descriptions = {"Description 1", "Description 2", "Description 3", "Description 4"};
			Integer[] pictures = {R.drawable.pizza, R.drawable.pizza, R.drawable.pizza, R.drawable.pizza};
			CustomList adapter = new CustomList(getActivity(), sides, descriptions, pictures);
			ListView list1 = (ListView)rootView.findViewById(R.id.listAppetizers);

			list1.setAdapter(adapter);
			return rootView;
		}



	}

	public static class PlaceholderFragment6 extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */

		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */

		public static PlaceholderFragment6 newInstance(int sectionNumber) {

			PlaceholderFragment6 fragment = new PlaceholderFragment6();
			Bundle args = new Bundle();

			args.putInt(ARG_SECTION_NUMBER, sectionNumber);

			fragment.setArguments(args);
			return fragment;

		}

		public PlaceholderFragment6() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.sides, container,
					false);			
			//get the names, descriptions, and pictures for each recipe and use them
			//to populate the list view
			String[] sides = {"Side 1", "Side 2", "Side 3", "Side 4"};
			String[] descriptions = {"Description 1", "Description 2", "Description 3", "Description 4"};
			Integer[] pictures = {R.drawable.pizza, R.drawable.pizza, R.drawable.pizza, R.drawable.pizza};
			CustomList adapter = new CustomList(getActivity(), sides, descriptions, pictures);
			ListView list1 = (ListView)rootView.findViewById(R.id.listSides);

			list1.setAdapter(adapter);
			return rootView;
		}

	}

	public static class PlaceholderFragment7 extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */

		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */

		public static PlaceholderFragment7 newInstance(int sectionNumber) {

			PlaceholderFragment7 fragment = new PlaceholderFragment7();
			Bundle args = new Bundle();

			args.putInt(ARG_SECTION_NUMBER, sectionNumber);

			fragment.setArguments(args);
			return fragment;

		}

		public PlaceholderFragment7() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.main_dishes, container,
					false);	
			//get the names, descriptions, and pictures for each recipe and use them
			//to populate the list view
			String[] sides = {"Green Bean Casserole", "Au Gratin Potatoes", "Sweet Potato Casserole", "Holiday Lasagna"};
			String[] descriptions = getResources().getStringArray(R.array.holidays_descriptions);
			Integer[] pictures = {R.drawable.green_bean_casserole, R.drawable.au_gratin_potatoes, R.drawable.sweet_potato_casserole, R.drawable.holiday_lasagna};
			CustomList adapter = new CustomList(getActivity(), sides, descriptions, pictures);
			ListView list1 = (ListView)rootView.findViewById(R.id.listMainDishes);

			list1.setAdapter(adapter);

			list1.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view, int position, long id){
					Intent intent = new Intent(view.getContext(), GrilledCorn.class);
					startActivity(intent);
				}
			});
			return rootView;
		}

	}

	public static class PlaceholderFragment8 extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */

		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */

		public static PlaceholderFragment8 newInstance(int sectionNumber) {

			PlaceholderFragment8 fragment = new PlaceholderFragment8();
			Bundle args = new Bundle();

			args.putInt(ARG_SECTION_NUMBER, sectionNumber);

			fragment.setArguments(args);
			return fragment;

		}

		public PlaceholderFragment8() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.desserts, container,
					false);	
			//get the names, descriptions, and pictures for each recipe and use them
			//to populate the list view
			String[] sides = {"Dessert 1", "Dessert 2", "Dessert 3", "Dessert 4"};
			String[] descriptions = {"Description 1", "Description 2", "Description 3", "Description 4"};
			Integer[] pictures = {R.drawable.pizza, R.drawable.pizza, R.drawable.pizza, R.drawable.pizza};
			CustomList adapter = new CustomList(getActivity(), sides, descriptions, pictures);
			ListView list1 = (ListView)rootView.findViewById(R.id.listDesserts);

			list1.setAdapter(adapter);
			return rootView;
		}

	}
}
