package com.rajesh.volleysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.VolleyError;

public class CustomResponseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_response);

        // If is the response is custom with object
        customResponseObject();
    }

    private void customResponseObject() {

        String url = "www.example.com"; // replace with your url.

        GsonRequest gsonRequest = new GsonRequest(url, CustomResponseList.class, null, new Response.Listener() {
            @Override
            public void onResponse(Object response) {

                // Handle response

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                // Handle error
            }
        });

        MainApplication.getInstance(this).addToRequestQueue(gsonRequest);
    }
}
