package com.rajesh.volleysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class StringRequestActivity extends AppCompatActivity {

    private RequestQueue queue;
    private static final String STRING_REQUEST_TAG = "string_request";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_request);

        // If Service response is string type user string request method of volley.
        stringRequestMethod();
    }

    private void stringRequestMethod() {

        queue = Volley.newRequestQueue(this);
        String url = "www.example.com"; // Enter your URL here.

        // Request a String response from provided url.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                // Handle response

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                // Handle error
            }
        });

        stringRequest.setTag(STRING_REQUEST_TAG);

        // Add Request to request queue
        queue.add(stringRequest);

    }

    @Override
    protected void onStop() {
        super.onStop();

        if (queue != null) {

            queue.cancelAll(STRING_REQUEST_TAG);
        }
    }
}
