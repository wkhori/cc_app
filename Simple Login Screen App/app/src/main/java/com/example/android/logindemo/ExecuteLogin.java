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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ExecuteLogin extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    private Button Cancel;
    private TextView Signup;
    //private TextView ErrorMsg;

    //user name and password info//
    public List<String> id_list=new ArrayList<String>();
    public List<String> pwd_list=new ArrayList<String>();
    public static Context context;

/*
    public String[] Id_list=new String[] {
            "sehyun","walid","lucheng","cx","nick"
    };
    public String[] Password_list=new String[]{
            "1816","0000","1111","2222","3333"
    };
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execute_login);

        id_list.add("sehyun");id_list.add("walid");id_list.add("lucheng");id_list.add("cx");id_list.add("nick");
        pwd_list.add("1816");pwd_list.add("0000");pwd_list.add("1111");pwd_list.add("2222");pwd_list.add("3333");

        context=this;

        Intent getInfo=getIntent();
        String get_id=getInfo.getStringExtra("this_is_id");
        String get_pwd=getInfo.getStringExtra("this_is_pwd");

        id_list.add(get_id);
        pwd_list.add(get_pwd);

        Name = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        Login = (Button)findViewById(R.id.btnLogin);
        Cancel=(Button)findViewById(R.id.btnBack);
        Signup=(TextView)findViewById(R.id.move);

        //ErrorMsg=(TextView)findViewById(R.id.loginErrorMsg);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
        Cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExecuteLogin.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        Signup.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExecuteLogin.this, SignUpActivity.class);
                startActivity(intent);
            }
        }));
    }

    private void validate(String userName, String userPassword) {

//        if(Arrays.asList(Id_list).contains(userName) && Arrays.asList(Password_list).contains(userPassword)){
        int idx= id_list.indexOf(userName);

        if(id_list.contains(userName) && pwd_list.get(idx).equals(userPassword)){
            // ErrorMsg.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(ExecuteLogin.this, MainActivity.class);
            startActivity(intent);

        } else {
            //ErrorMsg.setVisibility(View.VISIBLE);
            Toast.makeText(ExecuteLogin.this, "Invalid : try again!", Toast.LENGTH_SHORT).show();
        }
    }

}