package com.example.android.logindemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HelpFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_help,container,false);

//        AlertDialog.Builder success = new AlertDialog.Builder(HelpFragment.this,R.style.MyAlertDialogStyle);
//        success.setTitle("Successfully sended.");
//        success.setMessage("Login with your new account.")
//                .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Intent signupIntent = new Intent(HelpFragment.this, HelpFragment.class);
//                        startActivity(signupIntent);
//                    }
//                });
//        success.show();

        return v;
    }
}
