package com.example.android.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.webkit.WebView;

public class LoginActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login = (Button)findViewById(R.id.btnLogin);
        Register =(Button)findViewById(R.id.btnRegister);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LogInIntent = new Intent(LoginActivity.this, ExecuteLogin.class);
                LoginActivity.this.startActivity(LogInIntent);
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupIntent = new Intent(LoginActivity.this, SignUpActivity.class);
                LoginActivity.this.startActivity(signupIntent);
            }
        });

//        String html = "<iframe width=\"600\" height=\"400\" src=\"https://data.gov.sg/dataset/community-clubs/resource/da666988-6c48-4f02-9ddf-bd8b11609cfd/view/990fcd0f-857c-4c98-82e8-9b83891d6d8a\" frameBorder=\"0\"> </iframe>";
//        WebView webview;
//        webview = (WebView) findViewById(R.id.webview);
//        webview.getSettings().setJavaScriptEnabled(true);
//        webview.loadData(html, "text/html", null);
    }
}
