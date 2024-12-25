package com.example.localservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
     public void register(View v) {
    	 Toast.makeText(this, "Welcome to Regsitration Page", Toast.LENGTH_LONG).show();
    	 Intent i=new Intent(MainActivity.this,Register.class);
    	 startActivity(i);
     }
     public void login(View v) {
    	 Toast.makeText(this, "Welcome to Login Page", Toast.LENGTH_LONG).show();
    	 Intent i=new Intent(MainActivity.this,Login.class);
    	 startActivity(i);
     }
     public void about(View v) {
    	 Toast.makeText(this, "About Us",Toast.LENGTH_LONG).show();
    	 Intent i=new Intent(MainActivity.this,About.class);
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
