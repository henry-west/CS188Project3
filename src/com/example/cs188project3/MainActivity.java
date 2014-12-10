package com.example.cs188project3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void toMidWestPhilosophy(View view){
		Intent intent = new Intent(this, MidwestPhilosophy.class);
		startActivity(intent);
	}
	public void tofavoites(View view){
		Intent intent = new Intent(this, Favorite.class);
		startActivity(intent);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// Handle action bar item
		switch(item.getItemId()) {
		case  R.id.home:
			
			return true;
		case R.id.states:
			startActivity(new Intent(this, States.class));
			return true;
		case R.id.holidays:
			startActivity(new Intent(this, Holidays.class));
			return true;
		case R.id.potluck:
			startActivity(new Intent(this, Potluck.class));
			return true;
		case R.id.bbc:
			startActivity(new Intent(this, BBC.class));
			return true;
		case R.id.favorites:
			startActivity(new Intent(this, Favorite.class));
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
