package com.example.listview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    int[] arrNo = new int[]{1,2,3,4,5};
    ArrayList<String> arrNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        arrNames.add("Ali");
        arrNames.add("Hassan");
        arrNames.add("Ahmed");
        arrNames.add("Murtaza");
        arrNames.add("Shan");
        arrNames.add("Ali");
        arrNames.add("Hassan");
        arrNames.add("Ahmed");
        arrNames.add("Murtaza");
        arrNames.add("Shan");
        arrNames.add("Ali");
        arrNames.add("Hassan");
        arrNames.add("Ahmed");
        arrNames.add("Murtaza");
        arrNames.add("Shan");
        arrNames.add("Ali");
        arrNames.add("Hassan");
        arrNames.add("Ahmed");
        arrNames.add("Murtaza");
        arrNames.add("Shan");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplication(),android.R.layout.simple_list_item_1,arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Toast.makeText(MainActivity.this, "Click First Item", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Spinner_layout.class);
                    startActivity(intent);
                }else if (position == 1){
                    Toast.makeText(MainActivity.this, "Click Second Item", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}