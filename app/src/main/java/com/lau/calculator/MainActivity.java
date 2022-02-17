package com.lau.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

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
        TextView t = (TextView) findViewById(R.id.txt);
        String text = spinner.getSelectedItem().toString();
        Random rand = new Random();
        t.setText(Integer.toString(rand.nextInt(101)));
        EditText name = (EditText) findViewById(R.id.name);

        TableLayout table = (TableLayout) findViewById(R.id.table);
        TableRow tb = new TableRow(this);
        TextView tv1 = new TextView(this);
        TextView tv2 = new TextView(this);
        TextView tv3 = new TextView(this);
        tv1.setText(name.getText().toString());
        tv2.setText(text);
        tv3.setText();
        tb.addView(tv1);
        table.addView(tb);

        switch (text){

            case "SQL":
                img.setImageResource(R.drawable.sql);
                break;
            case "Java":
                img.setImageResource(R.drawable.java);
                break;
            case "JavaScript":
                img.setImageResource(R.drawable.javascript);
                break;
            case "Python":
                img.setImageResource(R.drawable.python);
                break;
            case "VisualBasic":
                img.setImageResource(R.drawable.visualbasic);
                break;
            case "Ruby":
                img.setImageResource(R.drawable.ruby);
                break;

        }


    }


}