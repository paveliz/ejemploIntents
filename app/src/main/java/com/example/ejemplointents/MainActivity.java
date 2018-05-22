package com.example.ejemplointents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
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

	//hola mundo git
	
	public void CallIntentCompartir(View v) {
	    Intent share = new Intent(Intent.ACTION_SEND);
	    share.setType("text/plain");
	    share.putExtra(Intent.EXTRA_TEXT, "Te comparto la mejor app http://www.pickmebus.com");

	    startActivity(Intent.createChooser(share, "Compartiendo"));
	}
	
	public void CallSendEmailIntent(View v){

	Intent emailIntent = new Intent(Intent.ACTION_SEND);
	emailIntent.setData(Uri.parse("mailto:"));
	emailIntent.setType("text/plain");
	emailIntent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"paveliz@gmail.com"});
	emailIntent.putExtra(Intent.EXTRA_SUBJECT, "prueba");
	emailIntent.putExtra(Intent.EXTRA_TEXT  , "email de prueba");
	
	try {
	        startActivity(Intent.createChooser(emailIntent, "Enviando..."));
	        finish();
	      } catch (android.content.ActivityNotFoundException ex) {
	    	  
	        Toast.makeText(MainActivity.this,
	        "There is no email client installed.", Toast.LENGTH_SHORT).show();
	      }
	}

	public void botonCALL(View v) {

		Intent intentWeb = new Intent(Intent.ACTION_VIEW);

		intentWeb.setData(Uri.parse("tel:123123123"));

		startActivity(intentWeb);
	}

	public void botonSMS(View v) {

		Intent intentWeb = new Intent(Intent.ACTION_VIEW);

		intentWeb.setData(Uri.parse("sms:2020?body=juego"));

		startActivity(intentWeb);
	}

	public void botonURL(View v) {

		Intent intentWeb = new Intent(Intent.ACTION_VIEW);

		intentWeb.setData(Uri.parse("http://www.google.com"));

		startActivity(intentWeb);
	}

	public void botonMapa(View v) {

		Intent intentWeb = new Intent(Intent.ACTION_VIEW);

		intentWeb.setData(Uri.parse("http://maps.google.com/?q=Obelisco"));

		startActivity(intentWeb);
	}
}
