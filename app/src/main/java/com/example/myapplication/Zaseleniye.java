package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.myapplication.inventory.Data;

import java.util.ArrayList;
import java.util.List;

public class Zaseleniye extends AppCompatActivity {
    private CustomSpinner spinner_fruits;

    private FruitAdapter adapter;

    Button InhotelBut;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaseleniye);
        InhotelBut= findViewById(R.id.button_in_hoyel);
        InhotelBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Zaseleniye.this, InHotel.class);
                startActivity(i);
            }
        });

      // String[] countries = { "Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай"};
//
//            Spinner spinner = findViewById(R.id.spinner_hotel);
//            // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
//            ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);
//            // Определяем разметку для использования при выборе элемента
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//            // Применяем адаптер к элементу spinner
//            spinner.setAdapter(adapter);
//
        spinner_fruits = findViewById(R.id.spinner_hotel);


        adapter = new FruitAdapter(Zaseleniye.this, Data.getFruitList());
        spinner_fruits.setAdapter(adapter);

    }


    public void onPopupWindowOpened(Spinner spinner) {
        spinner_fruits.setBackground(getResources().getDrawable(R.drawable.krovat));
    }

    public void onPopupWindowClosed(Spinner spinner) {
        spinner_fruits.setBackground(getResources().getDrawable(R.drawable.krovat));
    }




}