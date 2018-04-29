package com.example.s528772.sizecheckapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        TextView data= (TextView)findViewById(R.id.dataTV);
        data.setText("Akshay Reddy Vontari.my Mailing address is 1115 N College Dr,Maryville,MO 64468");
    }
}
