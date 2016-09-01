package com.example.dell.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddNewTask extends AppCompatActivity {


public static ArrayList<Task> taskList = new ArrayList<>();


    private EditText mTitleField;
    private EditText mDescriptionField;
    private Spinner mUrgencyField;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_page);

        mTitleField = (EditText)findViewById(R.id.task_enter_title_field);
        mDescriptionField = (EditText) findViewById(R.id.enter_description_field);
        mUrgencyField = (Spinner) findViewById(R.id.task_Enter_Urgency_Field);



    }

    public void onSubmitPressed (View view){
        String title = mTitleField.getText(). toString();
        String description = mDescriptionField.getText().toString();
        String urgency = mUrgencyField.getSelectedItem().toString();

        if (title.equals("") || description.equals("")){
            Toast.makeText(this, "please input all information",
                    Toast.LENGTH_LONG).show();
            return;

        }

        int urgencyLevel = 0;
        switch (urgency) {
            case "Very Urgent":
                urgencyLevel = 3;
                break;
            case "Urgent":
                urgencyLevel = 2;
                break;
            case "Not Urgent":
                urgencyLevel = 1;
                break;
        }


            Task task = new Task(title, description, urgencyLevel);
        taskList.add(task);

            Toast. makeText (this, "New Task Added!",
                    Toast.LENGTH_LONG) .show();

        //clearing fields after it was submitted
        mTitleField.setText("");
        mDescriptionField.setText("");
        mUrgencyField.setSelection(0);


    }
}
