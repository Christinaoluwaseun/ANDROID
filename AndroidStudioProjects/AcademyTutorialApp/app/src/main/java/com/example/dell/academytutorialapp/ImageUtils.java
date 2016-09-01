package com.example.dell.academytutorialapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Dell on 26-Aug-16.
 */
public class ImageUtils {
    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        //setting up our utility class
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth){

            final int halfHeight = height/2;
            final int halfWidth = width/2;

            while ((halfHeight/ inSampleSize) > reqHeight && (halfWidth/ inSampleSize)> reqWidth){
                inSampleSize *= 2;
            }
            //is the picture bigger than it need to be, if it is the return inSamplesize
        }


        return inSampleSize;

    }
     //setting up our UTILITY Class
    public static Bitmap decodeSampleBitmapFromResource (Resources res, int resId, int reqWidth, int reqHeight){
        final BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;

        BitmapFactory.decodeResource(res, resId, options);

        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        options.inJustDecodeBounds = false;

        return BitmapFactory.decodeResource(res, resId, options);

    }
}
