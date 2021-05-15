package com.example.atg_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {
    private static ImageView imgview;
    private static Button buttonsbm;
    private int current_image;
    int [ ]images={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.guitar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        buttonclick();
    }
    public void buttonclick()
    {
        imgview = (ImageView) findViewById(R.id.imageView3);
        buttonsbm=(Button)findViewById(R.id.forward1);
        buttonsbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image++;
                        current_image=current_image % images.length;
                        imgview.setImageResource(images[current_image]);

                    }
                }

        );


    }

}