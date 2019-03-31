package com.example.android.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
    private Button confirm;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        confirm = (Button)findViewById(R.id.confirm);
        cancel = (Button)findViewById(R.id.cancel);

        confirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent coursesIntent = new Intent(Register.this, ConfirmPayment.class);
                Register.this.startActivity(coursesIntent);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent coursesIntent = new Intent(Register.this, CoursesFragment.class);
                Register.this.startActivity(coursesIntent);
            }
        });

    }
}
