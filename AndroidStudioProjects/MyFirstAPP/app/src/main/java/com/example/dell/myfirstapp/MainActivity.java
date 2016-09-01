package com.example.dell.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //instance variable to name any variable you need M(members) infront of it. (edit text was imported)
    private EditText mNameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the variable name view(M.TEXT), access the ID u created (R.ID should be used)
        //for the appropriate view we're looking for, based on it's ID (VIEW is the parent class and EDIT TEXT (we get edit text from view)
        mNameField= (EditText)findViewById(R.id.enter_name_field);


        /*
        create a method which will be called when the button is clicked
         */

    }
    public void onClick(View view){
        /*
        here is where wqe will define what happens...then tell it what you want in the edit text area
         */

        String name = mNameField.getText().toString();
        Toast.makeText(this,"Hello There"+name, Toast.LENGTH_LONG).show();

    }
    public void showImageActivity(View view){
        Intent intent = new Intent(this, DisplayImageActivity.class);
        startActivity(intent);

    }

}
