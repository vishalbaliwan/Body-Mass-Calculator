package com.example.android.bacalculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class screen_two extends AppCompatActivity {

    public static String result;
    double resultInt;
    TextView tvResult;
    TextView tvLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    tvResult=findViewById(R.id.tvResult);
    tvLogic=findViewById(R.id.tvLogic);
        Intent i = getIntent();
        result=i.getStringExtra(result);

        resultInt =Double.valueOf(result);
        if(resultInt<18.5)
            tvLogic.setText("You are underweight \n jeb mein 5 ka sikka leke ghum");
        else if (resultInt>18.5 && resultInt<24.9)
            tvLogic.setText("You are normal weight \n Bdhiya chlra hai sab");
        else if (resultInt>24.9 && resultInt<29.9)
            tvLogic.setText("You are obese \n Thoda khana kam kyu ni krdeta be");
        else
            tvLogic.setText("You are extremely obese \n Abe kese krke manega bhukkad");

        tvResult.setText(result);

    }
}