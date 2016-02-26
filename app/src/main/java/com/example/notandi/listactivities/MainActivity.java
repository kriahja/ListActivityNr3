package com.example.notandi.listactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numPicker();
        spinner();


    }

    public void numPicker()
    {
        NumberPicker np = (NumberPicker)findViewById(R.id.numberPicker);

        int minValue = 1;
        int maxValue = 100;

        np.setMinValue(minValue);
        np.setMaxValue(maxValue);



    }

    public void spinner()
    {
        Spinner spin = (Spinner)findViewById(R.id.dropDown);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.usefulStuff, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spin.setAdapter(adapter);
    }


}
