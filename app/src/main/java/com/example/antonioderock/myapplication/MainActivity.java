package com.example.antonioderock.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Controller controller;
    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName0 = findViewById(R.id.Name0);
        EditText inputAge0 = findViewById(R.id.Age0);
        EditText inputMonth0 = findViewById(R.id.Month0);
        EditText inputHobby0 = findViewById(R.id.Hobby0);
        EditText inputSubject0 = findViewById(R.id.Subject0);
        EditText inputFood0 = findViewById(R.id.Food0);

        ListView NameListView = findViewById(R.id.NameListView);
        ListView AgeListView = findViewById(R.id.AgeListView);
        ListView MonthListView = findViewById(R.id.MonthListView);
        ListView HobbyListView = findViewById(R.id.HobbyListView);
        ListView SubjectListView = findViewById(R.id.SubjectListView);
        ListView FoodListView = findViewById(R.id.FoodListView);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        NameListView.setAdapter(arrayAdapter1);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        AgeListView.setAdapter(arrayAdapter2);
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        MonthListView.setAdapter(arrayAdapter3);
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        HobbyListView.setAdapter(arrayAdapter4);
        ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        SubjectListView.setAdapter(arrayAdapter5);
        ArrayAdapter<String> arrayAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        FoodListView.setAdapter(arrayAdapter6);


        controller = new Controller(inputName0, inputAge0, inputMonth0, inputHobby0, inputSubject0,inputFood0, NameListView, AgeListView, MonthListView, HobbyListView, SubjectListView, FoodListView, getApplicationContext());

    }
    @Override
    protected void onStop() {
        model.save();
        super.onStop();
    }
}
