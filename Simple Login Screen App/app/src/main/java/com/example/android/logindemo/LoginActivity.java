package com.example.android.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button Signup;
    private TextView ErrorMsg;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);
        Signup=(Button)findViewById(R.id.btnSignup);
        ErrorMsg=(TextView)findViewById(R.id.loginErrorMsg);

   //     Info.setText("No of attempts remaining: 10");
        Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ErrorMsg.setVisibility(View.INVISIBLE);
            }
        });


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupIntent = new Intent(LoginActivity.this, SignUpActivity.class);
                LoginActivity.this.startActivity(signupIntent);
            }
        });
    }

    private void validate(String userName, String userPassword){

        if(((userName.equals("sehyun")) && (userPassword.equals("1816")))
                || ((userName.equals("walid")) && (userPassword.equals("0000")))
                || ((userName.equals("lucheng")) && (userPassword.equals("1111")))
                || ((userName.equals("cx")) && (userPassword.equals("2222")))
                || ((userName.equals("nick")) && (userPassword.equals("3333")))
          ){
            ErrorMsg.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            ErrorMsg.setVisibility(View.VISIBLE);
            /*
            counter--;

            Info.setText("No of attempts remaining: " + String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
            }
            */
        }
    }

}
