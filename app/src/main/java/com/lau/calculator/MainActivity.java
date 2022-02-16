package com.lau.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.language, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void calculate(View v){
        Spinner spinner = findViewById(R.id.spinner1);
        ImageView img = (ImageView) findViewById(R.id.img);

        String text = spinner.getSelectedItem().toString();

        switch (text){
            case "Java":
                img.setImageResource(R.drawable.java);
                break;
            case "SQL":
                img.setImageResource(R.drawable.sql);
                break;
            case "JavaScript":
                img.setImageResource(R.drawable.javascript);
                break;
            case "Python":
                img.setImageResource(R.drawable.python);
                break;
            case "VisualBasic":
                img.setImageResource(R.drawable.);
                break;
            case "Java":
                img.setImageResource(R.drawable.java);
                break;

        }


    }


}