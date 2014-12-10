package com.example.cs188project3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.example.cs188project3.Potluck.SectionsPagerAdapter;

public class Favorite extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_favorite);
		String[] sides = {"BURGER AND FRIES POT PIE", "NACHO CASSEROLE", "CHICKEN POT PIE", "BBQ, BEEF, AND BISCUIT CASSEROLE"};
		String[] descriptions = getResources().getStringArray(R.array.potluck_descriptions);
		Integer[] pictures = {R.drawable.burger_fries_pot_pie, R.drawable.nacho_casserole, R.drawable.chicken_pot_pie, R.drawable.chicken_pot_pie};

		CustomList adapter = new CustomList(Favorite.this, sides, descriptions, pictures);
		ListView list1 = (ListView)findViewById(R.id.list);
		list1.setAdapter(adapter);
		list1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				Intent intent = new Intent(view.getContext(), GrilledCorn.class);
				startActivity(intent);
			}
		});


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.favorite, menu);
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
}
