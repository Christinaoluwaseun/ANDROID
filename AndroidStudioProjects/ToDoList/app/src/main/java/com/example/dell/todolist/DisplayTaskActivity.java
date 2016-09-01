package com.example.dell.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_task);

        //Getting a reference to the ListView on the screen
        ListView taskListView = (ListView) findViewById(R.id.task_list);

        String [] taskTitle = new String [AddNewTask.taskList.size()];

        //populating the array with the list of task
        for (int i = 0; i < taskTitle.length; ++i){
            taskTitle [i] = AddNewTask.taskList.get(i).getTitle();

        }

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, taskTitle);

        taskListView.setAdapter(adapter);

        taskListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //to delete the item from the list and recreate it
                AddNewTask.taskList.remove(position);
                //recreate yourself because content has changed
                recreate();
                 // what will it return
                return false;

            }
        });

    }
}
