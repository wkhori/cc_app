package com.example.android.logindemo;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;


public class ExecuteLogin extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView ErrorMsg;

    //user name and password info//
    public String[] Id_list=new String[] {
            "sehyun","walid","lucheng","cx","nick"
    };
    public String[] Password_list=new String[]{
            "1816","0000","1111","2222","3333"
    };

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

    public void add_info(String id,String pwd){
         Arrays.asList(Id_list).add(id);
         Arrays.asList(Password_list).add(pwd);
    }
    private void validate(String userName, String userPassword) {

        if(Arrays.asList(Id_list).contains(userName) && Arrays.asList(Password_list).contains(userPassword)){
            ErrorMsg.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(ExecuteLogin.this, MainActivity.class);
            startActivity(intent);

        } else {
            ErrorMsg.setVisibility(View.VISIBLE);
        }
    }

}