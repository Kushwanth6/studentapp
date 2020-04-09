package com.example.collegestudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {

    TextView welcstudentsTV;
    TextView selecourseTV;
    TextView feeTV;
    TextView HoursTV;
    TextView tpriceTV;
    TextView fialpriceTV;
    TextView nhoursTV;
    TextView nfeeTV;
    Spinner subjectsSpinner;

    String[] subjects = {"Java", "Swift", "iOS", "Android", "Database"};
    int[] hours = {6,5,5,7,4};
    int[] fee = {1300,1500,1350,1400, 1000};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subjectsSpinner = findViewById(R.id.spin);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, subjects);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        subjectsSpinner.setAdapter(dataAdapter);
    }
}

