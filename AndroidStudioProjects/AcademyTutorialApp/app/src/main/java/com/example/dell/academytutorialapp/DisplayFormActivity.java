package com.example.dell.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayFormActivity extends AppCompatActivity {


    public static final String USERNAME_KEY = "UserName";
    public static final String AGE_KEY = "USERAGE";
    public static final String EMAIL_KEY = "USERAGE";
    public static final String PHONENUM_KEY = "USERPHONENUMBER";


    //get a variable ready for all the fields
    private EditText mNameField;
    private EditText mAgeField;
    private EditText mEmailField;
    private EditText mPhoneField;


    private TextView mNameField1;
    private TextView mAgeField1;
    private TextView mEmailField1;
    private TextView mPhoneField1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form);

        //making the font to work
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/newfont.ttf");


        //after setting the variables, this is how we assign the variables into the java code
        //now set the font to do something

        mNameField = (EditText)findViewById(R.id.enter_name_field);
        mAgeField= (EditText)findViewById(R.id.enter_age_field);
        mEmailField= (EditText)findViewById(R.id.enter_email_field);
        mPhoneField= (EditText)findViewById(R.id.enter_phone_field);


        mNameField1  = (TextView) findViewById(R.id.form_enter_name_field);
        mAgeField1  = (TextView) findViewById(R.id.form_enter_age_field_field);
        mEmailField1 = (TextView) findViewById(R.id.form_enter_email_field);
        mPhoneField1 = (TextView)findViewById(R.id.form_enter_phone_field_field);

        //setting the font to different fields
        mNameField.setTypeface(tf);
        mAgeField.setTypeface(tf);
        mEmailField.setTypeface(tf);
        mPhoneField.setTypeface(tf);

        mNameField1.setTypeface(tf);
        mAgeField1.setTypeface(tf);
        mEmailField1.setTypeface(tf);
        mPhoneField1.setTypeface(tf);




    }


    public void  onSubmitProcess(View view)

    {
        //getting the editText
        String userName = mNameField.getText().toString();
        String userUserAge = mAgeField.getText().toString();
        String getUserEmail = mEmailField.getText().toString();
        String getUserPhone = mPhoneField.getText().toString();
        //formatting the information on to one string


      //  String output = "Hello There" + userName +
       //         "You Are" + userUserAge +
         //       "Years Old" + getUserEmail +
       //         "\nYour Email Address Is" + getUserEmail +
       //         "\nYour Number Is" + getUserPhone;

        //FOR THE LITTLE POP UP AT THE SCREEN BOTTOM after you enter your
      //  Toast.makeText(this, output, Toast.LENGTH_LONG).show();

        Bundle bundle = new Bundle();
        bundle.putString (USERNAME_KEY, userName);
        bundle.putString (AGE_KEY, userUserAge);
        bundle.putString(EMAIL_KEY,getUserEmail);
        bundle.putString(PHONENUM_KEY,getUserPhone);

        //creating the intent and adding a bundle to it

        Intent intent = new Intent(this, DispalyInformationActivity.class);
        intent.putExtras(bundle);

        //starting the intent
        startActivity(intent);


    }



}
