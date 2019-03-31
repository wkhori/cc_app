package com.example.android.logindemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SearchItemFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_search_item,container,false);

        //assign TextView
        TextView clubNameTV = v.findViewById(R.id.clubName);
        TextView mainTitleTV = v.findViewById(R.id.information);
        TextView subTitle1TV = v.findViewById(R.id.location);
        TextView subTitle2TV = v.findViewById(R.id.howToGetHere);
        TextView subTitle3TV = v.findViewById(R.id.contact);
        TextView subTitle4TV = v.findViewById(R.id.officeHours);

        TextView subTitle1ContentTV = v.findViewById(R.id.locationContent);
        TextView subTitle2ContentTV = v.findViewById(R.id.howToGetHereContent);
        TextView subTitle3Content1TV = v.findViewById(R.id.contactPhone);
        TextView subTitle3Content2TV = v.findViewById(R.id.contactFax);
        TextView subTitle3Content3TV = v.findViewById(R.id.contactEmail);
        TextView subTitle4Content1TV = v.findViewById(R.id.operatingHours);
        TextView subTitle4Content2TV = v.findViewById(R.id.paymentHours);

        if(getArguments() != null){
            String param1 = getArguments().getString("param1"); // 전달한 key 값
            String param2 = getArguments().getString("param2"); // 전달한 key 값

            //get text for titles

            String clubName = getArguments().getString("clubNameTV");
            String mainTitle = getArguments().getString("mainTitleTV");
            String subTitle1 = getArguments().getString("subTitle1TV");
            String subTitle2 = getArguments().getString("subTitle2TV");
            String subTitle3 = getArguments().getString("subTitle3TV");
            String subTitle4 = getArguments().getString("subTitle4TV");

            //get text for description
            String subTitle1Content =getArguments().getString("subTitle1ContentTV");
            String subTitle2Content = getArguments().getString("subTitle2ContentTV");
            String subTitle3Content1 = getArguments().getString("subTitle3Content1TV");
            String subTitle3Content2 = getArguments().getString("subTitle3Content2TV");
            String subTitle3Content3 = getArguments().getString("subTitle3Content3TV");
            String subTitle4Content1 = getArguments().getString("subTitle4Content1TV");
            String subTitle4Content2 = getArguments().getString("subTitle4Content2TV");

            //set text in textview, titles
            clubNameTV.setText(clubName);
            mainTitleTV.setText(mainTitle);
            subTitle1TV.setText(subTitle1);
            subTitle2TV.setText(subTitle2);
            subTitle3TV.setText(subTitle3);
            subTitle4TV.setText(subTitle4);

            //set text in textview, contents
            subTitle1ContentTV.setText(subTitle1Content);
            subTitle2ContentTV.setText(subTitle2Content);
            subTitle3Content1TV.setText(subTitle3Content1);
            subTitle3Content2TV.setText(subTitle3Content2);
            subTitle3Content3TV.setText(subTitle3Content3);
            subTitle4Content1TV.setText(subTitle4Content1);
            subTitle4Content2TV.setText(subTitle4Content2);
        }
        return v;
    }
}
