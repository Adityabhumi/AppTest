package com.android.test;

import android.content.Context;

import com.android.test.model.CollectionParse;

import java.io.IOException;
import java.io.InputStream;

public class Utils {

    /**
     * Read JSON file data
     * @param context
     * @return
     */
    public static String loadJSONFromAsset(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("collection.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }
}
