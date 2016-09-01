package com.example.dell.academytutorialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class ImageGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_grid);

        //ADD THE CODE FOR THE IMAGE ADAPTER OR SETTING THE ADAPTOR FOR THE GRID VIEW

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new imageAdapter(this));
    }
}
