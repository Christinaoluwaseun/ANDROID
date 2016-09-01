package com.example.dell.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ToDoTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_task);


    }

    public void onNewTaskClicked(View view){
        Intent intent = new Intent(this, AddNewTask.class);
                startActivity(intent);
    }
    //adding the button to go to the display what u input into the first button from the second button
    public void onNewTaskView(View view) {
        Intent intent = new Intent(this, DisplayTaskActivity.class);
        startActivity(intent);

    }
}
