package com.example.dell.academytutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DispalyInformationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispaly_information);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();


        String userName = bundle.getString(DisplayFormActivity.USERNAME_KEY);
        String userAge = bundle.getString(DisplayFormActivity.AGE_KEY);
        String userEmail = bundle.getString (DisplayFormActivity.EMAIL_KEY);
        String userPhone = bundle.getString(DisplayFormActivity.PHONENUM_KEY);


        Toast.makeText(this, "PHONE NUM IS : " + userPhone, Toast.LENGTH_LONG).show();

        TextView displayName = (TextView) findViewById(R.id.displaying_name_field);
        displayName.setText(userName);

        TextView displayAge = (TextView)findViewById(R.id.displaying_age_field);
        displayAge.setText(userAge);

        TextView displayEmail = (TextView)findViewById(R.id.displaying_email_field);
        displayEmail.setText(userEmail);


        TextView displayPhone = (TextView)findViewById(R.id.displaying_phone_field);
        displayPhone.setText(userPhone);



    }
}
