package com.example.coloractivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = findViewById(R.id.spinner);

        //must have 10 colors
        //colors like "LTGray" dont work well with parsecolor
        final String[] colorsArr = {"White", "Black", "Blue", "Cyan", "Gray", "Green",
        "Magenta", "Red", "Yellow"};

        ColorAdapter colorAdapter = new ColorAdapter(MainActivity.this, colorsArr);

        spinner.setAdapter(colorAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor(colorsArr[position]));
                //spinner.setBackgroundColor(Color.WHITE);



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });




    }
}
