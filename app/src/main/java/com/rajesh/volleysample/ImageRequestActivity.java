package com.rajesh.volleysample;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;

public class ImageRequestActivity extends AppCompatActivity {

    private RequestQueue queue;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_request);

        queue = MainApplication.getInstance(this).getRequestQueue();

        imageView = (ImageView) findViewById(R.id.imageView);

        // If image is Response
        imageRequestMethod();
    }

    private void imageRequestMethod() {

        String url = "www.example/2/012642.png"; // replace with image url.

        ImageRequest imageRequest = new ImageRequest(url, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {

                // Handle response image bitmap
                imageView.setImageBitmap(response);

            }
        }, 0, 0, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                // Handle error
            }
        });

        // Access this image request through singleton class.
        MainApplication.getInstance(this).addToRequestQueue(imageRequest);
    }
}
