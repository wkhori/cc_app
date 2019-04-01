package com.example.android.logindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SportAndFitnessFragment extends Fragment {
    private Button badminton;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        view = inflater.inflate(R.layout.activity_sport_and_fitness, container, false);

        badminton=(Button)view.findViewById(R.id.sport0);

        badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent coursesIntent = new Intent(SportAndFitnessFragment.this, Badminton.class);
//                SportAndFitnessFragment.this.startActivity(coursesIntent);
                Fragment fragment=new BadmintonFragment();
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction
                        .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in,R.anim.fade_out)
                        .replace(R.id.fragment_container,fragment);
                fragmentTransaction.commit();
            }
        });

        return view;
    }


}
