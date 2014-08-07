package com.example.examandro;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;


public class LoginScreenActivity extends Activity implements OnClickListener {
	//declaration
EditText etuser,etpassword;
Button btnvery,btnback;
String struser,strpassword;
CheckBox chkpassword;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//initialization
		etuser = (EditText) findViewById(R.id.etuser);
		struser = etuser.getText().toString();
		
		etpassword = (EditText) findViewById(R.id.etpassword);
		strpassword = etpassword.getText().toString();
		
		btnvery = (Button) findViewById(R.id.btnverify);
		btnvery.setOnClickListener(this);
		
		btnback= (Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
           chkpassword = (CheckBox) findViewById(R.id.chkpassword);
		   
		
		chkpassword.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				if (!isChecked) {
					//show the password
					etpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
					
				} else {
					//hide the password
					etpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

				}
				
			}
		});
		
		
		
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnverify:
			String UserName = "akirachix";
			String Password = "girls@ict2013";
			
			
			if(etuser.getText().toString().equals("") && etpassword.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "Please enter the username and password", Toast.LENGTH_SHORT).show();
			}
			
			else if (etuser.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "Please enter the username", Toast.LENGTH_SHORT).show();
			}
			
			else if (!etuser.getText().toString().equals(UserName)) {
				Toast.makeText(getApplicationContext(), "This is not the correct username", Toast.LENGTH_SHORT).show();
			}
			else if (etpassword.getText().toString().equals("")) {
				Toast.makeText(getApplicationContext(), "input the password", Toast.LENGTH_SHORT).show();
			}
			
			else if (!etpassword.getText().toString().equals(Password)) {
				Toast.makeText(getApplicationContext(), "This is not the correct password", Toast.LENGTH_SHORT).show();
			}
			
			else if(etuser.getText().toString().equals("") && etpassword.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "You can login", Toast.LENGTH_SHORT).show();
			}
			
			break;
        case R.id.btnback:
        	startActivity(new Intent(getApplicationContext(),WelcomeScreenActivity.class));
			
			break;
			

		default:
			break;
		}
		
	}

	
}
