package com.example.android.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText idText=(EditText) findViewById(R.id.idText);
        EditText passwordText=(EditText) findViewById(R.id.passwordText);
        EditText nameText=(EditText) findViewById(R.id.nameText);
        EditText emailText=(EditText) findViewById(R.id.emailText);
        EditText phoneText=(EditText) findViewById(R.id.phoneText);

        Button signupButton=(Button) findViewById(R.id.signupButton);

    }


}
