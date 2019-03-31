package com.example.android.logindemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BadmintonFragment extends Fragment {
    private View view;
    private ViewPager viewPager;
    private SlideAdapter myadapter;
    private Button register;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        view = inflater.inflate(R.layout.activity_badminton, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        myadapter=new SlideAdapter(getActivity());
        viewPager.setAdapter(myadapter);

        return view;
    }


}
