package com.example.localservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	public void appoint(View v) {
		Toast.makeText(this,"Make an Appointment",Toast.LENGTH_LONG).show();
		Intent i=new Intent(Home.this,Appointment.class);
		startActivity(i);
	}
	public void about(View v) {
		Toast.makeText(this,"About Us",Toast.LENGTH_LONG).show();
		Intent i=new Intent(Home.this,About.class);
		startActivity(i);
	}
	public void contact(View v) {
		Toast.makeText(this,"Contact Us",Toast.LENGTH_LONG).show();
		Intent i=new Intent(Home.this,Contact.class);
		startActivity(i);
	}
	public void logout(View v) {
		Intent i=new Intent(Home.this,Login.class);
		Toast.makeText(this,"Logged out",Toast.LENGTH_LONG).show();
		startActivity(i);
	}
	public void profile(View v) {
		Intent i=new Intent(Home.this,Profile.class);
		startActivity(i);
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
