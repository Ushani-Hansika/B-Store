package com.example.bstore;

import androidx.appcompat.app.AppCompatActivity;

//import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.bstore.R.*;
import static com.example.bstore.R.id.*;
//import static com.example.bstore.R.id.submit;

public class FeedBack extends AppCompatActivity {

   Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_feed_back);

        btn = findViewById(R.id.submit);
    }

    public void onResume(){
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FeedBack.this, Comments.class);
                startActivity(i);
            }
        });
    }}



