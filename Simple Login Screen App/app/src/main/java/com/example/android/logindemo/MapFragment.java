package com.example.android.logindemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class MapFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        String html = "<iframe width=\"600\" height=\"400\" src=\"https://data.gov.sg/dataset/community-clubs/resource/da666988-6c48-4f02-9ddf-bd8b11609cfd/view/990fcd0f-857c-4c98-82e8-9b83891d6d8a\" frameBorder=\"0\"> </iframe>";
//        WebView webview;
//        webview = (WebView) getView().findViewById(R.id.webview);
//        webview.loadData(html, "text/html", null);
        return inflater.inflate(R.layout.fragment_map,container,false);
    }



//    String html = "<iframe width=\"600\" height=\"400\" src=\"https://data.gov.sg/dataset/community-clubs/resource/da666988-6c48-4f02-9ddf-bd8b11609cfd/view/990fcd0f-857c-4c98-82e8-9b83891d6d8a\" frameBorder=\"0\"> </iframe>";
}
