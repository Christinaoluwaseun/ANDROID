package com.example.dell.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mNameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField= (EditText)findViewById(R.id.enter_name_field);
        TextView welcomeMessage= (TextView)findViewById(R.id.welcome_message);


        //getting the font you saved in assets file(where it says enter your name on the first page
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/newfont.ttf");
        mNameField.setTypeface(tf);
        welcomeMessage.setTypeface(tf);



    }

    public void onGridView (View view){
        //this is the method we will use to set up the pictures button
        Intent intent = new Intent(this,ImageGridActivity.class );
        startActivity(intent);
    }

    public void onButtonClicked(View view){
        //this code is executed when button has been clicked
        String enteredName = mNameField.getText().toString();
        Toast.makeText(this, "what\'s crackinglacking my G" + enteredName,
                Toast.LENGTH_SHORT).show();


    }

    public void onViewImageButton (View view){
        //starting a new activity
        // the Intent takes two arguments, the first is the content which allows the app
        //to know what activity is currently active.
        //the second is the .class field within the activity you're currently in to the one that you specify as the second parameter
        Intent intent = new Intent(this, DisplayImageActivity.class);
        //this starts the new activity
        startActivity(intent);
    }

    public void onFormButton (View view){
        Intent intent = new Intent(this,DisplayFormActivity.class);
        startActivity(intent);
        //linking your button to show the new activity you built
    }
}

