package com.example.s528772.sizecheckapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view) {
        EditText edLength = (EditText) findViewById(R.id.lengthET);
        EditText edWidth = (EditText) findViewById(R.id.widthET);
        String l = edLength.getText().toString();
        String w = edWidth.getText().toString();
        if (!l.isEmpty() && !w.isEmpty()) {
            Integer length = Integer.parseInt(edLength.getText().toString());
            Integer width = Integer.parseInt(edWidth.getText().toString());

                Intent intent = new Intent(this, SizeActivity.class);
            intent.putExtra("len", length);
            intent.putExtra("wid", width);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"please enter the length/width",Toast.LENGTH_SHORT).show();
        }
    }

    public void contact(View view){
        Intent intent = new Intent(this,ContactActivity.class);
        startActivity(intent);
    }
}
