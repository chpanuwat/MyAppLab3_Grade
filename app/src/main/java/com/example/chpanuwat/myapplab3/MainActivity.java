package com.example.chpanuwat.myapplab3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerGrade;
    String id;
    String yourName;
    String Email;
    String Address;
    String Spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        SharedPreferences SharedPreferences = getSharedPreferences("CH", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = SharedPreferences.edit();
        editor.putString("name", "Elena");
        editor.putInt("idName", 12);
        editor.commit();



        button.setOnClickListener(
                    new View.OnClickListener(){

                        public void onClick (View v)
                        {
                            EditText editTextID = (EditText) findViewById(R.id.editText);
                            id = editTextID.getText().toString();
                            EditText editTextName = (EditText) findViewById(R.id.editText2);
                            yourName = editTextName.getText().toString();
                            EditText editTextEmail = (EditText) findViewById(R.id.editText3);
                            Email = editTextEmail.getText().toString();
                            EditText editTextAddress = (EditText) findViewById(R.id.editText4);
                            Address = editTextAddress.getText().toString();



                            spinnerGrade = (Spinner) findViewById(R.id.spinnerGrade);
                            String Spinner = spinnerGrade.getSelectedItem().toString();


                           // Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                            intent.putExtra("id", id);
                            intent.putExtra("yourName", yourName);
                            intent.putExtra("Email", Email);
                            intent.putExtra("Address", Address);
                            intent.putExtra("Spinner", Spinner);
                            startActivity(intent);
                        }
                    }

        );

        final Spinner spinnerGrade = (Spinner) findViewById(R.id.spinnerGrade);
        final String[] Grade = getResources().getStringArray(R.array.Grade_arrays);
        ArrayAdapter<String> adaptergrade = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, Grade);
        spinnerGrade.setAdapter(adaptergrade);
    }

}
