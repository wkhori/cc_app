package com.example.android.logindemo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
//    public static Stack<Fragment> fragmentStack;
//    public static FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        BottomNavigationHelper.disableShiftMode(bottomNav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

//        fragmentStack = new Stack<>();
//        manager = getSupportFragmentManager();
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
                        case R.id.nav_help :
                            selectedFragment = new HelpFragment();
                            break;
                    }

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();
                        return true;


                }
            };

//            @Override
//            public void onBackPressed() {
//                if(!fragmentStack.isEmpty()){
//                    Fragment nextFragment = fragmentStack.pop();
//                    manager.beginTransaction().replace(R.id.fragment_container, nextFragment).commit();
//                    //System.out.println("[TESTING >>] " + fragmentStack.size());
//                }else {
//                    super.onBackPressed();
//                }
//            }

}
