package com.example.delivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.bstore.R;


public class MainActivity extends AppCompatActivity {


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
                Intent i = new Intent(MainActivity.this,CashPayments.class);
                startActivity(i);
            }
        });
    }
}
