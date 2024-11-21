package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Spinner_layout extends AppCompatActivity {

    Spinner spinner;
     ArrayList<String> arrIds = new ArrayList<>();// Use List instead of initializing ArrayAdapter directly

    AutoCompleteTextView autoView;
    ArrayList<String> arrLanguage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner_layout);

        spinner = findViewById(R.id.spinnerView);
        autoView =findViewById(R.id.AutoView);

        // Adding items to arrIds
        arrIds.add("Bike Id");
        arrIds.add("Driving license Id");
        arrIds.add("Voter Id Card");
        arrIds.add("Ration Id");
        arrIds.add("cycle Id");
        arrIds.add("Riksha Id");

        // Create an ArrayAdapter and pass context, layout, and the list of items
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrIds);
        // Set the adapter to the spinner
        spinner.setAdapter(spinnerAdapter);


        // autocomplete view
        arrLanguage.add("C");
        arrLanguage.add("C++");
        arrLanguage.add("Java");
        arrLanguage.add("PHP");
        arrLanguage.add("Javascript");

        ArrayAdapter<String> autoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguage);
        autoView.setAdapter(autoAdapter);
        autoView.setThreshold(1);
    }
}
