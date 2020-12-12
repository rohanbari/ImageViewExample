package com.rohanbari.imageviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private final int[] images = new int[]{R.drawable.greece, R.drawable.san_francisco, R.drawable.indiana};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
    }

    public void shuffleImage(View view) {
        int id = images[new Random().nextInt(images.length)];
        Glide.with(this).load(id).into(imageView);

        imageView.setCropToPadding(true);
    }
}