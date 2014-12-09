package com.example.cs188project3;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {

	private final FragmentActivity context;
	private final Activity myActivty;
	private final String[] names;
	private final String[] descriptions;
	private final Integer[] imageId;
	public CustomList(FragmentActivity context,
			String[] names, String[] descriptions, Integer[] imageId) {
		super(context, R.layout.list_item, names);
		this.context = context;
		this.names = names;
		this.descriptions = descriptions;
		this.imageId = imageId;
		this.myActivty=null;
	}
	public CustomList(Activity myActivity,
			String[] names, String[] descriptions, Integer[] imageId) {
		super(myActivity, R.layout.list_item, names);
		this.myActivty = myActivity;
		this.names = names;
		this.descriptions = descriptions;
		this.imageId = imageId;
		this.context=null;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView= inflater.inflate(R.layout.list_item, null, true);

		TextView name = (TextView) rowView.findViewById(R.id.name);
		TextView description = (TextView) rowView.findViewById(R.id.description);
		ImageView picture = (ImageView) rowView.findViewById(R.id.picture);
		name.setText(names[position]);
		description.setText(descriptions[position]);
		picture.setImageResource(imageId[position]);
		return rowView;

	}
}

