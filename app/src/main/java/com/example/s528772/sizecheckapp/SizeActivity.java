package com.example.s528772.sizecheckapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

public class SizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        Intent i = getIntent();
        Integer length = i.getIntExtra("len",0);
        Integer width = i.getIntExtra("wid",0);
        Integer product = length*width;
        TextView tv = (TextView) findViewById(R.id.productTV);
        ImageButton img = (ImageButton)findViewById(R.id.mailBTN);
        tv.setText("The product is "+product);
        if(product>=10&&product<=200){
            img.setBackgroundColor(GREEN);
        }
        else{
            img.setBackgroundColor(RED);
        }

    }

    public void mail(View view){
        Intent i = new Intent(this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(i);
    }
}
