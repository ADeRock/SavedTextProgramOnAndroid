package com.example.antonioderock.myapplication;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.content.Context;


public class Controller {
    private ListView NameListView;
    private ListView AgeListView;
    private ListView MonthListView;
    private ListView HobbyListView;
    private ListView SubjectListView;
    private ListView FoodListView;

    private EditText Name0;
    private EditText Age0;
    private EditText Month0;
    private EditText Hobby0;
    private EditText Subject0;
    private EditText Food0;

    private ArrayAdapter<String> arrayAdapter1;
    private ArrayAdapter<String> arrayAdapter2;
    private ArrayAdapter<String> arrayAdapter3;
    private ArrayAdapter<String> arrayAdapter4;
    private ArrayAdapter<String> arrayAdapter5;
    private ArrayAdapter<String> arrayAdapter6;

    private Model model;


    Controller(EditText Name1, EditText Age1, EditText Month1, EditText Hobby1, EditText Subject1,  EditText Food1, ListView Name, ListView Age, ListView Month, ListView Hobby, ListView Subject, ListView Food, Context cntxt){
        NameListView = Name;
        AgeListView = Age;
        MonthListView = Month;
        HobbyListView = Hobby;
        SubjectListView = Subject;
        FoodListView = Food;
        Name0 = Name1;
        Age0 = Age1;
        Month0 = Month1;
        Hobby0 = Hobby1;
        Subject0 = Subject1;
        Food0 = Food1;
        arrayAdapter1 = (ArrayAdapter<String>)NameListView.getAdapter();
        arrayAdapter2 = (ArrayAdapter<String>)AgeListView.getAdapter();
        arrayAdapter3 = (ArrayAdapter<String>)MonthListView.getAdapter();
        arrayAdapter4 = (ArrayAdapter<String>)HobbyListView.getAdapter();
        arrayAdapter5 = (ArrayAdapter<String>)SubjectListView.getAdapter();
        arrayAdapter6 = (ArrayAdapter<String>)FoodListView.getAdapter();

        Name0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Name0Ready(); }
        });

        Age0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Age0Ready(); }
        });

        Month0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Month0Ready(); }
        });

        Hobby0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Hobby0Ready(); }
        });

        Subject0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Subject0Ready(); }
        });

        Food0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Food0Ready(); }
        });
    }

    public void Name0Ready() {
        arrayAdapter1.add(Name0.getText().toString());
        arrayAdapter1.notifyDataSetChanged();
        Name0.setText("");
    }

    public void Age0Ready() {
        arrayAdapter2.add(Age0.getText().toString());
        arrayAdapter2.notifyDataSetChanged();
        Age0.setText("");
    }

    public void Month0Ready() {
        arrayAdapter3.add(Month0.getText().toString());
        arrayAdapter3.notifyDataSetChanged();
        Month0.setText("");
    }

    public void Hobby0Ready() {
        arrayAdapter4.add(Hobby0.getText().toString());
        arrayAdapter4.notifyDataSetChanged();
        Hobby0.setText("");
    }

    public void Subject0Ready() {
        arrayAdapter5.add(Subject0.getText().toString());
        arrayAdapter5.notifyDataSetChanged();
        Subject0.setText("");
    }

    public void Food0Ready() {
        arrayAdapter6.add(Food0.getText().toString());
        arrayAdapter6.notifyDataSetChanged();
        Food0.setText("");
    }
}

