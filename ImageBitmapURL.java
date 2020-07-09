package com.e.piccassolib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImageBitmapURL extends AppCompatActivity {
ImageView imageView;
String Urls="https://scipy-lectures.org/_images/face.png";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_bitmap_u_r_l);
        imageView=findViewById(R.id.ImgView);
        new AsyncTaskBitmap(imageView).execute(Urls);

    }
}