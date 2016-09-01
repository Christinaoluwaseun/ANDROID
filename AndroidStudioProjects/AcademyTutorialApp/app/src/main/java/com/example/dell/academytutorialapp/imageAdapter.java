package com.example.dell.academytutorialapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Dell on 26-Aug-16.
 */
public class imageAdapter extends BaseAdapter {

    private Context mContext;
    private int mImageHieght = 200;
    private int mImageWidth = 200;

    private static Integer [] mPictureBadAssStyle = {
        R.drawable.female_hacker,
        R.drawable.hacker_gangster_chick,
        R.drawable.khaz,
        R.drawable.hackersjoke,
        R.drawable.made_with_codes,
        R.drawable.two,

    };

    public imageAdapter (Context context){
        mContext = context;

    }

    @Override
    public int getCount() {
        return mPictureBadAssStyle.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(mImageHieght, mImageWidth));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }else{
            imageView = (ImageView) convertView;
        }

        //imageView.setImageResource(mPictureBadAssStyle[position]); //dont need this anymore
        //we used this to put all the image on.
        //now we need to scale it then put it on.


        Bitmap bitmap = ImageUtils.decodeSampleBitmapFromResource(mContext.getResources(),
        mPictureBadAssStyle[position], mImageWidth, mImageHieght);
;        imageView.setImageBitmap(bitmap);
        return imageView;
    }
}
