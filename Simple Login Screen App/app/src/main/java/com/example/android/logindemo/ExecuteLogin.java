package com.example.android.logindemo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ExecuteLogin extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView ErrorMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execute_login);

        Name = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        Login = (Button)findViewById(R.id.btnLogin);
        ErrorMsg=(TextView)findViewById(R.id.loginErrorMsg);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }



    private void validate(String userName, String userPassword) {

        if (((userName.equals("sehyun")) && (userPassword.equals("1816")))
                || ((userName.equals("walid")) && (userPassword.equals("0000")))
                || ((userName.equals("lucheng")) && (userPassword.equals("1111")))
                || ((userName.equals("cx")) && (userPassword.equals("2222")))
                || ((userName.equals("nick")) && (userPassword.equals("3333")))) {

            ErrorMsg.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(ExecuteLogin.this, MainActivity.class);
            startActivity(intent);

        } else {
            ErrorMsg.setVisibility(View.VISIBLE);
        }
    }

}