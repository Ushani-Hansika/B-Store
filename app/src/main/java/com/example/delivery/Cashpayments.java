package com.example.delivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bstore.R;
import com.example.bstore.Thankyou;

public class Cashpayments extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashpayments);
        btn1=findViewById(R.id.agree);
    }

    public void onResume(){
        super.onResume();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                i = new Intent(Cashpayments.this, Thankyou.class);
                startActivity(i);
            }
        });
    }
}

