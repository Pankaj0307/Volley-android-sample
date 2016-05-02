package com.rajesh.volleysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

public class ImageLoaderActivity extends AppCompatActivity {

    private ImageLoader loader;
    private NetworkImageView networkImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loader);

        loader = MainApplication.getInstance(this).getImageLoader();

        networkImageView = (NetworkImageView) findViewById(R.id.networkImageView);

        // If image is Response
        imageLoaderMethod();
    }

    private void imageLoaderMethod() {

        String url = "www.example/imageno2.png";

        // Loading and displaying image from url using networkImageView
        networkImageView.setImageUrl(url, loader);
    }
}
