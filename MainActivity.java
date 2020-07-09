package com.e.piccassolib;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
EditText h,w;
Button resize;
String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= findViewById(R.id.imageView);
        h=findViewById(R.id.height);
        w=findViewById(R.id.width);
        resize=findViewById(R.id.resize);

        url="https://scipy-lectures.org/_images/face.png";
      resize.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
        int height=Integer.parseInt(h.getText().toString());
              int width=Integer.parseInt(w.getText().toString());

              Picasso.get()
                      .load(url)
                      .resize(width, height)
                      .centerCrop()
                      .into(imageView);

          }
      });


    }



}
