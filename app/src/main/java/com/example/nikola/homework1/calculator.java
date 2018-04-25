package com.example.nikola.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText prvi= (EditText) findViewById(R.id.broj1);

                EditText drugi = (EditText) findViewById(R.id.broj2);
                TextView rez = (TextView) findViewById(R.id.rezultat);
                int num1 = Integer.parseInt(prvi.getText().toString());

                int num2 = Integer.parseInt(drugi.getText().toString());
                int result= num1 + num2;
                rez.setText(result + "");

            }
        });
        Button minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText prvi= (EditText) findViewById(R.id.broj1);

                EditText drugi = (EditText) findViewById(R.id.broj2);
                TextView rez = (TextView) findViewById(R.id.rezultat);
                int num1 = Integer.parseInt(prvi.getText().toString());

                int num2 = Integer.parseInt(drugi.getText().toString());
                int result= num1 - num2;
                rez.setText(result + "");
            }
        });
        Button mnozi = (Button) findViewById(R.id.mnozi);
        mnozi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText prvi= (EditText) findViewById(R.id.broj1);

                EditText drugi = (EditText) findViewById(R.id.broj2);
                TextView rez = (TextView) findViewById(R.id.rezultat);
                int num1 = Integer.parseInt(prvi.getText().toString());

                int num2 = Integer.parseInt(drugi.getText().toString());
                int result= num1 * num2;
                rez.setText(result + "");

            }
        });
        Button djeli = (Button) findViewById(R.id.djeli);
        djeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText prvi= (EditText) findViewById(R.id.broj1);

                EditText drugi = (EditText) findViewById(R.id.broj2);
                TextView rez = (TextView) findViewById(R.id.rezultat);
                int num1 = Integer.parseInt(prvi.getText().toString());

                int num2 = Integer.parseInt(drugi.getText().toString());
                int result= num1 / num2;
                rez.setText(result + "");


            }
        });
    }
}
