package com.example.cs188project3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class States extends Activity {
	
	public void toIowa(View view) {
		Intent intent = new Intent(this, Iowa.class);
		startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_states);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.states, menu);
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
				default:
					return super.onOptionsItemSelected(item);
				}
	}
}
