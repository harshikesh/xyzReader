package com.example.xyzreader.utility;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by harshikesh.kumar on 21/10/16.
 */
public class Utils {
  public static float getScreenHeight(Context applicationContext) {
    DisplayMetrics displaymetrics = new DisplayMetrics();
    ((Activity) applicationContext).getWindowManager()
        .getDefaultDisplay()
        .getMetrics(displaymetrics);
    int height = displaymetrics.heightPixels;
    int width = displaymetrics.widthPixels;
    return height;
  }
}
