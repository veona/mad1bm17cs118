package com.example.mad_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2= (Button) findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener(){package com.example.mad_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2= (Button) findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v) {
            EditText e1 = (EditText)findViewById(R.id.editText8);
            EditText e2 = (EditText)findViewById(R.id.editText9);
            TextView t1 = (TextView)findViewById(R.id.dfg);

            
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e1.getText().toString());
                int sum = num1+ num2;

                t1.setText(Integer.toString(sum));

        }});
    }
}

            @Override
        public void onClick(View v) {
            EditText e1 = (EditText)findViewById(R.id.editText8);
            EditText e2 = (EditText)findViewById(R.id.editText9);
            TextView t1 = (TextView)findViewById(R.id.dfg);

            
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e1.getText().toString());
                int sum = num1+ num2;

                t1.setText(Integer.toString(sum));

        }});
    }
}
