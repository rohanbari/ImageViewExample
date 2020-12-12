package com.rohanbari.imageviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shuffleImage(View view) {
        imageView = findViewById(R.id.image);
        imageView.setImageResource(R.mipmap.san_francisco);
        imageView.setCropToPadding(true);
    }
}