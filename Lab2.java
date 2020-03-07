<?xml version="1.0" encoding="utf-8"?>

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"

    xmlns:tools="http://schemas.android.com/tools"

    android:layout_width="match_parent"

    android:layout_height="match_parent"

    tools:context=".MainActivity">

<LinearLayout

android:layout_width="match_parent"

android:layout_height="100dp">

<TextView

    android:id="@+id/textView"

    android:layout_width="match_parent"

    android:layout_height="wrap_content"

    android:layout_margin="30dp"

    android:text="Details Form"

    android:textSize="25sp"

    android:gravity="center"/>

</LinearLayout>

<GridLayout

android:id="@+id/gridLayout"

android:layout_width="match_parent"

android:layout_height="match_parent"

android:layout_marginTop="100dp"

android:layout_marginBottom="200dp"

android:columnCount="2"

android:rowCount="3">

<TextView

    android:id="@+id/textView1"

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:layout_margin="10dp"

    android:layout_row="0"

    android:layout_column="0"

    android:text="Name"

    android:textSize="20sp"

    android:gravity="center"/>

<EditText

    android:id="@+id/editText"

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:layout_margin="10dp"

    android:layout_row="0"

    android:layout_column="1"

    android:ems="10"/>

<TextView

    android:id="@+id/textView2"

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:layout_margin="10dp"

    android:layout_row="1"

    android:layout_column="0"

    android:text="Reg.No"

    android:textSize="20sp"

    android:gravity="center"/>

<EditText

    android:id="@+id/editText2"

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:layout_margin="10dp"

    android:layout_row="1"

    android:layout_column="1"

    android:inputType="number"

    android:ems="10"/>

<TextView

    android:id="@+id/textView3"

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:layout_margin="10dp"

    android:layout_row="2"

    android:layout_column="0"

    android:text="Dept"

    android:textSize="20sp"

    android:gravity="center"/>

<Spinner

    android:id="@+id/spinner"

    android:layout_width="wrap_content"

    android:layout_height="wrap_content"

    android:layout_margin="10dp"

    android:layout_row="2"

    android:layout_column="1"

    android:spinnerMode="dropdown"/>

</GridLayout>

<Button

android:id="@+id/button"

android:layout_width="wrap_content"

android:layout_height="wrap_content"

android:layout_alignParentBottom="true"

android:layout_centerInParent="true"

android:layout_marginBottom="150dp"

android:text="Submit"/>

    </RelativeLayout>
    
    
***********************main.java**********************

package com.example.useofintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ArrayAdapter;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



        //Defining the Views

        EditText e1, e2;

        Button bt;

        Spinner s;

//Data for populating in Spinner

        String[] dept_array = {"CSE", "ECE", "IT", "Mech", "Civil" };

        String name,reg,dept;
        @Override

        protected void onCreate (Bundle savedInstanceState){

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

//Referring the Views

            e1 = (EditText) findViewById(R.id.editText);

            e2 = (EditText) findViewById(R.id.editText2);

            bt = (Button) findViewById(R.id.button);

            s = (Spinner) findViewById(R.id.spinner);

//Creating Adapter for Spinner for adapting the data from array to Spinner

            ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item, dept_array);

            s.setAdapter(adapter);

//Creating Listener for Button

            bt.setOnClickListener(new View.OnClickListener(){

                @Override

                public void onClick (View v){

//Getting the Values from Views(Edit text & Spinner)

                    name = e1.getText().toString();

                    reg = e2.getText().toString();

                    dept = s.getSelectedItem().toString();

//Intent For Navigating to Second Activity

                    Intent i = new Intent(MainActivity.this, Main2Activity.class);

//For Passing the Values to Second Activity

                    i.putExtra("name_key", name);

                    i.putExtra("reg_key", reg);

                    i.putExtra("dept_key", dept);

                    startActivity(i);

                }

            });

        }

    }





****************************main2.xml********************

<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"

    xmlns:tools="http://schemas.android.com/tools"

    android:layout_width="match_parent"

    android:layout_height="match_parent"

    tools:context="com.example.useofintents.Main2Activity"

    android:orientation="vertical"

    android:gravity="center">

<TextView

android:id="@+id/textView1"

android:layout_width="wrap_content"

android:layout_height="wrap_content"

android:layout_margin="20dp"

android:text="New Text"

android:textSize="30sp"/>

<TextView

android:id="@+id/textView2"

android:layout_width="wrap_content"

android:layout_height="wrap_content"

android:layout_margin="20dp"

android:text="New Text"

android:textSize="30sp"/>

<TextView

android:id="@+id/textView3"

android:layout_width="wrap_content"

android:layout_height="wrap_content"
android:layout_margin="20dp"

android:text="New Text"

android:textSize="30sp"/>

    </LinearLayout>
    
    
    
    
 *******************main2.java*********************
 
 package com.example.useofintents;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1,t2,t3;

    String name,reg,dept;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        t1= (TextView) findViewById(R.id.textView1);

        t2= (TextView) findViewById(R.id.textView2);

        t3= (TextView) findViewById(R.id.textView3);

//Getting the Intent

        Intent i = getIntent();

//Getting the Values from First Activity using the Intent received

        name=i.getStringExtra("name_key");

        reg=i.getStringExtra("reg_key");

        dept=i.getStringExtra("dept_key");

//Setting the Values to Intent

        t1.setText(name);

        t2.setText(reg);

        t3.setText(dept);

    }

}
