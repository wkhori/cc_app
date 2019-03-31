package com.example.android.logindemo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class SearchItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_item);

        //assign TextView
        TextView clubNameTV = findViewById(R.id.clubName);
        TextView mainTitleTV = findViewById(R.id.information);
        TextView subTitle1TV = findViewById(R.id.location);
        TextView subTitle2TV = findViewById(R.id.howToGetHere);
        TextView subTitle3TV = findViewById(R.id.contact);
        TextView subTitle4TV = findViewById(R.id.officeHours);

        TextView subTitle1ContentTV = findViewById(R.id.locationContent);
        TextView subTitle2ContentTV = findViewById(R.id.howToGetHereContent);
        TextView subTitle3Content1TV = findViewById(R.id.contactPhone);
        TextView subTitle3Content2TV = findViewById(R.id.contactFax);
        TextView subTitle3Content3TV = findViewById(R.id.contactEmail);
        TextView subTitle4Content1TV = findViewById(R.id.operatingHours);
        TextView subTitle4Content2TV = findViewById(R.id.paymentHours);

        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();

        //get text for titles
        String clubName = intent.getStringExtra("clubNameTV");
        String mainTitle = intent.getStringExtra("mainTitleTV");
        String subTitle1 = intent.getStringExtra("subTitle1TV");
        String subTitle2 = intent.getStringExtra("subTitle2TV");
        String subTitle3 = intent.getStringExtra("subTitle3TV");
        String subTitle4 = intent.getStringExtra("subTitle4TV");

        //get text for description
        String subTitle1Content = intent.getStringExtra("subTitle1ContentTV");
        String subTitle2Content = intent.getStringExtra("subTitle2ContentTV");
        String subTitle3Content1 = intent.getStringExtra("subTitle3Content1TV");
        String subTitle3Content2 = intent.getStringExtra("subTitle3Content2TV");
        String subTitle3Content3 = intent.getStringExtra("subTitle3Content3TV");
        String subTitle4Content1 = intent.getStringExtra("subTitle4Content1TV");
        String subTitle4Content2 = intent.getStringExtra("subTitle4Content2TV");

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

        //assign BottonNavigationBar
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment=null;

                    switch (item.getItemId()){
                        case R.id.nav_search:
                            selectedFragment = new SearchFragment();
                            break;
                        case R.id.nav_courses:
                            selectedFragment = new CoursesFragment();
                            break;
                        case R.id.nav_map:
                            selectedFragment = new MapFragment();
                            break;
                        case R.id.nav_me:
                            selectedFragment = new MeFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };
}
