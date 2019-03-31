package com.example.android.logindemo;


import android.content.Context;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;




import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchListViewAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater inflater;
    List<SearchModel> modelList;
    ArrayList<SearchModel> arrayList;

    public SearchListViewAdapter(Context Context, List<SearchModel> modelList){
        this.mContext = Context;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<SearchModel>();
        this.arrayList.addAll(modelList);
    }

    public class ViewHolder{
        TextView mNameTv, mBuildingTv, mAddressTv;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.search_list, null);

            //locate the views in list.xml
            holder.mNameTv = view.findViewById(R.id.clubName);
            holder.mBuildingTv = view.findViewById(R.id.clubBuilding);
            holder.mAddressTv = view.findViewById(R.id.clubAddress);

            view.setTag(holder);
        }
        else{
            holder = (ViewHolder)view.getTag();
        }
        //set the result into textviews
        holder.mNameTv.setText(modelList.get(position).getClubName());
        holder.mBuildingTv.setText(modelList.get(position).getClubBuilding());
        holder.mAddressTv.setText(modelList.get(position).getClubAddress());

//        listview item
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new SearchItemFragment(); // Fragment 생성
                Bundle bundle = new Bundle();

                if (modelList.get(position).getClubName().equals("Bishan CC")){
                    //start NewActivity with name for actionbar and text for textview

                    bundle.putString("clubNameTV", "Bishan CC"); // Key, Value
                    bundle.putString("mainTitleTV", "Information"); // Key, Value
                    bundle.putString("subTitle1TV", "Location:");
                    bundle.putString("subTitle1ContentTV", "51 BISHAN STREET 13 579799");
                    bundle.putString("subTitle2TV", "How to get here:");
                    bundle.putString("subTitle2ContentTV", "Facing Bishan Bus Interchange. Buses No 52, 53, 54, 55, 56, 57, 58, 59, 410. Near Junction 8");
                    bundle.putString("subTitle3TV", "Contact:");
                    bundle.putString("subTitle3Content1TV", "6259 4720");
                    bundle.putString("subTitle3Content2TV", "6353 1912");
                    bundle.putString("subTitle3Content3TV", "N.A");
                    bundle.putString("subTitle4TV", "Office hours:");
                    bundle.putString("subTitle4Content1TV", "Operating Hours: N.A");
                    bundle.putString("subTitle4Content2TV", "Payment Hours: 9:00 AM - 9:30 PM");
                    fragment.setArguments(bundle);


//                    Intent intent = new Intent(mContext, SearchItem.class);

//                    bundle.putString("clubNameTV", "Bishan CC");
//                    bundle.putString("mainTitleTV", "Information");
//                    bundle.putString("subTitle1TV", "Location:");
//                    bundle.putString("subTitle1ContentTV", "51 BISHAN STREET 13 579799");
//                    bundle.putString("subTitle2TV", "How to get here:");
//                    bundle.putString("subTitle2ContentTV", "Facing Bishan Bus Interchange. Buses No 52, 53, 54, 55, 56, 57, 58, 59, 410. Near Junction 8");
//                    bundle.putString("subTitle3TV", "Contact:");
//                    bundle.putString("subTitle3Content1TV", "6259 4720");
//                    bundle.putString("subTitle3Content2TV", "6353 1912");
//                    bundle.putString("subTitle3Content3TV", "N.A");
//                    bundle.putString("subTitle4TV", "Office hours:");
//                    bundle.putString("subTitle4Content1TV", "Operating Hours: N.A");
//                    bundle.putString("subTitle4Content2TV", "Payment Hours: 9:00 AM - 9:30 PM");
//
//                    mContext.startActivity(intent);

                }

                else if (modelList.get(position).getClubName().equals("Bishan North CC")){
                    //start NewActivity with name for actionbar and text for textview
                    //Intent intent = new Intent(mContext, SearchItem.class);
                    bundle.putString("clubNameTV", "Bishan North CC");
                    bundle.putString("mainTitleTV", "Information");
                    bundle.putString("subTitle1TV", "Location:");
                    bundle.putString("subTitle1ContentTV", "233 BISHAN STREET 22 #01-126 570233");
                    bundle.putString("subTitle2TV", "How to get here:");
                    bundle.putString("subTitle2ContentTV", "BUSES: 410, 88, 54, 52 & 13 TAKE 410 FROM BISHAN INTERCHANGE. TAKE 88,54,13 ALONG BISHAN ROAD.");
                    bundle.putString("subTitle3TV", "Contact:");
                    bundle.putString("subTitle3Content1TV", "6451 5955");
                    bundle.putString("subTitle3Content2TV", "6451 6535");
                    bundle.putString("subTitle3Content3TV", "N.A");
                    bundle.putString("subTitle4TV", "Office hours:");
                    bundle.putString("subTitle4Content1TV", "Operating Hours: N.A");
                    bundle.putString("subTitle4Content2TV", "Payment Hours: 2:30 PM - 9:30 PM");

                   // mContext.startActivity(intent);
                }
                else if (modelList.get(position).getClubName().equals("Bukit Timah CC")){
                    //start NewActivity with name for actionbar and text for textview
                   // Intent intent = new Intent(mContext, SearchItem.class);
                    bundle.putString("clubNameTV", "Bukit Timah CC");
                    bundle.putString("mainTitleTV", "Information");
                    bundle.putString("subTitle1TV", "Location:");
                    bundle.putString("subTitle1ContentTV", "20 TOH YI DRIVE 596569");
                    bundle.putString("subTitle2TV", "How to get here:");
                    bundle.putString("subTitle2ContentTV", "Bus services No 61,66,77, 173,157,174,985");
                    bundle.putString("subTitle3TV", "Contact:");
                    bundle.putString("subTitle3Content1TV", "6466 2912, 6466 6115");
                    bundle.putString("subTitle3Content2TV", "6468 5378");
                    bundle.putString("subTitle3Content3TV", "N.A");
                    bundle.putString("subTitle4TV", "Office hours:");
                    bundle.putString("subTitle4Content1TV", "Operating Hours: N.A");
                    bundle.putString("subTitle4Content2TV", "Payment Hours: 9:30 AM - 9:30 PM");

                  //  mContext.startActivity(intent);
                }
                else if (modelList.get(position).getClubName().equals("Nanyang CC")){
                    //start NewActivity with name for actionbar and text for textview
                  //  Intent intent = new Intent(mContext, SearchItem.class);
                    bundle.putString("clubNameTV", "Nanyang CC");
                    bundle.putString("mainTitleTV", "Information");
                    bundle.putString("subTitle1TV", "Location:");
                    bundle.putString("subTitle1ContentTV", "60 JURONG WEST ST 91 649040");
                    bundle.putString("subTitle2TV", "How to get here:");
                    bundle.putString("subTitle2ContentTV", "FROM BOON LAY MRT STATION, TAKE BUS NO:241 FR. CLEMENTI BUS INTERCHANGE TAKE BUS NO: 99.");
                    bundle.putString("subTitle3TV", "Contact:");
                    bundle.putString("subTitle3Content1TV", "6791 0395");
                    bundle.putString("subTitle3Content2TV", "6791 0453");
                    bundle.putString("subTitle3Content3TV", "N.A");
                    bundle.putString("subTitle4TV", "Office hours:");
                    bundle.putString("subTitle4Content1TV", "Operating Hours: N.A");
                    bundle.putString("subTitle4Content2TV", "Payment Hours: 9:00 AM - 9:30 PM");

                 //   mContext.startActivity(intent);
                }
                else if (modelList.get(position).getClubName().equals("Nee Soon Central CC")){
                    //start NewActivity with name for actionbar and text for textview
                   // Intent intent = new Intent(mContext, SearchItem.class);
                    bundle.putString("clubNameTV", "Nee Soon Central CC");
                    bundle.putString("mainTitleTV", "Information");
                    bundle.putString("subTitle1TV", "Location:");
                    bundle.putString("subTitle1ContentTV", "749 YISHUN STREET 72 #01-138 760749");
                    bundle.putString("subTitle2TV", "How to get here:");
                    bundle.putString("subTitle2ContentTV", "TAKE BUS NO: 851, 852, 853, 854, 855, 856, 858, 171 & 169 BY MRT: ALIGHTING AT YISHUN STATION");
                    bundle.putString("subTitle3TV", "Contact:");
                    bundle.putString("subTitle3Content1TV", "6752 7687");
                    bundle.putString("subTitle3Content2TV", "6752 8965");
                    bundle.putString("subTitle3Content3TV", "N.A");
                    bundle.putString("subTitle4TV", "Office hours:");
                    bundle.putString("subTitle4Content1TV", "Operating Hours: N.A");
                    bundle.putString("subTitle4Content2TV", "Payment Hours: 2:00 PM - 10:00 PM");

                    //mContext.startActivity(intent);
                }
                else if (modelList.get(position).getClubName().equals("Tampines West CC")){
                    //start NewActivity with name for actionbar and text for textview
                    //Intent intent = new Intent(mContext, SearchItem.class);
                    bundle.putString("clubNameTV", "Tampines West CC");
                    bundle.putString("mainTitleTV", "Information");
                    bundle.putString("subTitle1TV", "Location:");
                    bundle.putString("subTitle1ContentTV", "5 TAMPINES AVENUE 3 529705");
                    bundle.putString("subTitle2TV", "How to get here:");
                    bundle.putString("subTitle2ContentTV", "BUS NO. 293(GREEN PLATE)& BUS NO. BUS NO. 291(RED PLATE) FROM TAMPINES INTERCHANGE.");
                    bundle.putString("subTitle3TV", "Contact:");
                    bundle.putString("subTitle3Content1TV", "6783 7910, 6788 6202");
                    bundle.putString("subTitle3Content2TV", "6788 0348");
                    bundle.putString("subTitle3Content3TV", "N.A");
                    bundle.putString("subTitle4TV", "Office hours:");
                    bundle.putString("subTitle4Content1TV", "Operating Hours: N.A");
                    bundle.putString("subTitle4Content2TV", "Payment Hours: 9:00 AM - 9:30 PM");

                   // mContext.startActivity(intent);

                }

                FragmentManager fragmentManager = ((AppCompatActivity)mContext).getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if(charText.length()==0){
            modelList.addAll(arrayList);
        }
        else{
            for(SearchModel model : arrayList){
                if(model.getClubName().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}
