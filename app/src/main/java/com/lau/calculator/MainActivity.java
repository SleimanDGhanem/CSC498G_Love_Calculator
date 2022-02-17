package com.lau.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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


    public void calculate(View v) {
        Spinner spinner = findViewById(R.id.spinner1);
        ImageView img = (ImageView) findViewById(R.id.img);

        TextView t = (TextView) findViewById(R.id.txt);
        String text = spinner.getSelectedItem().toString();
        Random rand = new Random();
        t.setText(Integer.toString(rand.nextInt(101)));
        EditText name = (EditText) findViewById(R.id.name);

        TableLayout table = (TableLayout) findViewById(R.id.table);
        TableRow tb = new TableRow(this);
        TextView person = new TextView(this);
        TextView language = new TextView(this);
        TextView percentage = new TextView(this);

        TableRow.LayoutParams tlparams = new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT,
                (float) 1.0);

        person.setText(name.getText().toString());
        language.setText(text);
        percentage.setText(t.getText().toString());
        person.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1f));

        tb.addView(person);
        tb.addView(language);
        tb.addView(percentage);




        table.addView(tb);
        img.setTranslationX(-1500);
        switch (text) {

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
        img.animate().translationXBy(1500).rotation(3600).setDuration(3000);


    }


}