package com.example.examandro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;



public class WelcomeScreenActivity extends Activity implements OnClickListener {
	// To declare
	Button btnregister,btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        //initialization
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(this);
        
        btnregister = (Button) findViewById(R.id.btnregister);
        btnregister.setOnClickListener(this);
        
       
    }

	@Override
	public void onClick(View v) {
		//To intent
		switch (v.getId()) {
        case R.id.btnlogin:
       	 startActivity(new Intent(getApplicationContext(),LoginScreenActivity.class));
       	 
       	 Toast.makeText(WelcomeScreenActivity.this, "go to login", Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.btnregister:
			startActivity(new Intent(getApplicationContext(),RegisterScreenActivity.class));
			
			Toast.makeText(WelcomeScreenActivity.this, "Register now", Toast.LENGTH_SHORT).show();
			break;
		


		default:
			break;
		}
		
	}


    
}
