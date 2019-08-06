package com.example.delivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bstore.Payment;
import com.example.bstore.R;


public class Delivery extends AppCompatActivity {


    Button btn1;
    Button btn2;
    //Toast toast;


    //Context context = getApplicationContext();
    //CharSequence text = "Before submit fill all details in the form";
    //int duration = Toast.LENGTH_SHORT;
    // toas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= findViewById(R.id.cashpayment);
        btn2=findViewById(R.id.creditcardonline);

        //toast = Toast.makeText(context,text,duration);
        //toast.show();

        //toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

    }

    public void onResume(){
        super.onResume();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(com.example.delivery.Delivery.this, Cashpayments.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(com.example.delivery.Delivery.this, Payment.class);
                startActivity(i);
            }
        });
    }
}
