package com.example.android.logindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RegisterFragment extends Fragment {
    private View view;
    private Button confirm;
    private Button cancel;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        view = inflater.inflate(R.layout.activity_register, container, false);

        confirm = (Button)view.findViewById(R.id.confirm);
        cancel = (Button)view.findViewById(R.id.cancel);

        confirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                Intent coursesIntent = new Intent(Register.this, ConfirmPayment.class);
//                Register.this.startActivity(coursesIntent);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                Intent coursesIntent = new Intent(Register.this, CoursesFragment.class);
//                Register.this.startActivity(coursesIntent);
            }
        });

        return view;
    }


}
