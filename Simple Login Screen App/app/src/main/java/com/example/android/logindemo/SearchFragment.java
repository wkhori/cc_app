package com.example.android.logindemo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;


import java.util.ArrayList;

public class SearchFragment extends Fragment {

    ListView listView;
    View view;
    SearchListViewAdapter adapter;
    ArrayList<SearchModel> arrayList = new ArrayList<SearchModel>();
    SearchView searchView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_search, container, false);
        listView = (ListView)view.findViewById(R.id.listView);
        searchView = (SearchView)view.findViewById(R.id.action_search);

        //Search List Items
        arrayList.add( new SearchModel("Bishan CC", "51", "Bishan Street 13"));
        arrayList.add( new SearchModel("Bishan North CC", "233", "Bishan Street 22"));
        arrayList.add( new SearchModel("Bukit Timah CC", "20", "Toh Yi Drive"));
        arrayList.add( new SearchModel("Nanyang CC", "60", "Jurong West Street 91"));
        arrayList.add( new SearchModel("Nee Soon Central CC", "749", "Yishun Street 72"));
        arrayList.add( new SearchModel("Tampines West CC", "5", "Tampines Avenue 3"));

        //pass results to listViewAdapter class
        adapter = new SearchListViewAdapter(this.getContext(), arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if(TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else{
                    adapter.filter(s);
                }
                return true;
            }
        });
        return view;
    }
}
