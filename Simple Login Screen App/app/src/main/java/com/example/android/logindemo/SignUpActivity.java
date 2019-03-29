package com.example.android.logindemo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText idText=(EditText) findViewById(R.id.idText);
        final EditText passwordText=(EditText) findViewById(R.id.passwordText);
        final EditText nameText=(EditText) findViewById(R.id.nameText);
        final EditText emailText=(EditText) findViewById(R.id.emailText);
        final EditText phoneText=(EditText) findViewById(R.id.phoneText);
        Button signupButton=(Button) findViewById(R.id.signupButton);


        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(idText.getText().toString(),passwordText.getText().toString(),nameText.getText().toString(),emailText.getText().toString(),phoneText.getText().toString());
            }
        });

    }

    private void validate(final String id,final String password,String name,String email,String phone){
        //Exception1. determine whether it is null-string or not
        if(id.getBytes().length<=0 || password.getBytes().length<=0 || name.getBytes().length<=0 || email.getBytes().length<=0 || phone.getBytes().length<=0){
            Toast.makeText(SignUpActivity.this, "Fill out all the blanks.", Toast.LENGTH_SHORT).show();
        }
        else{

                //Exception2. already existing account should be banned!

                //Successfully signed up

                    AlertDialog.Builder success = new AlertDialog.Builder(SignUpActivity.this,R.style.MyAlertDialogStyle);
                    success.setTitle("Successfully signed up");
                    success.setMessage("Login with your new account.")
                            .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent signupIntent = new Intent(SignUpActivity.this, ExecuteLogin.class);
                                    signupIntent.putExtra("this_is_id",id);
                                    signupIntent.putExtra("this_is_pwd",password);
                                    startActivity(signupIntent);
                                }
                            });
                    success.show();

        }
    }

}
