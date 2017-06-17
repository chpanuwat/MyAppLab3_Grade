package com.example.chpanuwat.myapplab3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SharedPreferences sharedPreferences = getSharedPreferences("CH", Context.MODE_PRIVATE);
        String yourName = sharedPreferences.getString("name", "");

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String name = intent.getStringExtra("yourName");
        String Email = intent.getStringExtra("Email");
        String Address = intent.getStringExtra("Address");
        String Spinner = intent.getStringExtra("Spinner");

        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(id);

        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setText(name);

        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setText(Email);

        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setText(Address);

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(Spinner);
    }


}
