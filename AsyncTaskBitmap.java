package com.e.piccassolib;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class AsyncTaskBitmap extends AsyncTask<String, Void, Bitmap> {
    ImageView imageView;
    Bitmap bitmap;

    public AsyncTaskBitmap(ImageView img){
        this.imageView=img;

    }

    @Override
    protected Bitmap doInBackground(String... url) {
        String urldisplay = url[0];
        bitmap = null;
        try {
            InputStream stream = new java.net.URL(urldisplay).openStream();
            bitmap = BitmapFactory.decodeStream(stream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        imageView.setImageBitmap(bitmap);
    }
}
