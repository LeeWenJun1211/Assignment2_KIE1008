package com.example.donation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class InfoDetailsActivity extends AppCompatActivity {

    String[] areas = {"Perlis","Kedah","Kelantan","Terengganu","Penang","Perak","Pahang","Selangor","Negeri Sembilan","Malacca","Johor","Sabah","Sarawak"};
    AutoCompleteTextView autoCompleteText;
    ArrayAdapter<String> adapterAreas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_details);

        autoCompleteText = findViewById(R.id.auto_complete_text);

        adapterAreas = new ArrayAdapter<String>(this,R.layout.list_area, areas);
        autoCompleteText.setAdapter(adapterAreas);

        autoCompleteText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String area = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"Area: "+area, Toast.LENGTH_SHORT).show();
            }
        });
    }
}