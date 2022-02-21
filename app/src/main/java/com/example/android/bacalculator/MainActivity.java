package com.example.android.bacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etHeight,etWeight;
//    TextView result;
    Button buttonView;

    Double height;
    Double weight;
    DecimalFormat df = new DecimalFormat("##.##");
    String resultdecimal;
    Double resultDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etHeight = findViewById(R.id.etHeight);
        EditText etWeight = findViewById(R.id.etWeight);
        Button buttonView = findViewById(R.id.buttonView);
        TextView result = findViewById(R.id.result);



        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                height= Double.parseDouble(etHeight.getText().toString());
                weight= Double.parseDouble(etWeight.getText().toString());
                if(height <=0 ) {
                    result.setText("Please enter valid height :)");

                }else if (weight <=0) {
                        result.setText("Please enter valid weight :)");

                    } else {
                        height = height / 100;
                        resultDouble = (weight / (height * height));
                        resultdecimal = df.format(resultDouble);
//                        result.setText(resultdecimal);
                    }
              // conditional statement for textview


                Toast.makeText(MainActivity.this, "Calculating :)", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this,screen_two.class);
                i.putExtra(screen_two.result,resultdecimal);
                startActivity(i);
            }

        });
    }
}