package com.example.examandro;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterScreenActivity extends Activity implements OnClickListener {
	EditText etreguser,etemail,etregpassword;
	Button btndisplay,btnregback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//initialization
		etreguser = (EditText) findViewById(R.id.etreguser);
		etregpassword = (EditText) findViewById(R.id.etregpassword);
		etemail = (EditText) findViewById(R.id.etemail);
		
		btndisplay = (Button) findViewById(R.id.btndisplay);
		btndisplay.setOnClickListener(this);
		
		btnregback = (Button) findViewById(R.id.btnregback);
		btndisplay.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		//To intent
		switch (v.getId()) {
		case R.id.btndisplay:

			Toast.makeText(getApplicationContext(), " User Name: akirachix,Email: akirachix@gmail.com,Password: AKIRACHIX", Toast.LENGTH_LONG).show();
			
			
			
			break;
        case R.id.btnregback:
        	startActivity(new Intent(getApplicationContext(),WelcomeScreenActivity.class));
        
			
			break;


		default:
			break;
		}
		
	}

}
