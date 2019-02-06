package com.example.coloractivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View spinner = findViewById(R.id.spinner);

        //must have 10 colors
        String[] colorsArr = {"White", "Black", "Blue", "Cyan", "Gray", "Green",
        "Magenta", "Red", "Yellow", "LTGray"};
    }
}
