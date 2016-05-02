package com.rajesh.volleysample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnStringReq;
    private Button btnSingleton;
    private Button btnJsonObject;
    private Button btnJsonArray;
    private Button btnImage;
    private Button btnImageLoader;
    private Button btnCustomResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialization
        btnStringReq = (Button) findViewById(R.id.btnStringReq);
        btnSingleton = (Button) findViewById(R.id.btnSingleton);
        btnJsonObject = (Button) findViewById(R.id.btnJsonObject);
        btnJsonArray = (Button) findViewById(R.id.btnJsonArray);
        btnImage = (Button) findViewById(R.id.btnImage);
        btnImageLoader = (Button) findViewById(R.id.btnImageLoader);
        btnCustomResponse = (Button) findViewById(R.id.btnCustomResponse);

        btnStringReq.setOnClickListener(this);
        btnSingleton.setOnClickListener(this);
        btnJsonObject.setOnClickListener(this);
        btnJsonArray.setOnClickListener(this);
        btnImage.setOnClickListener(this);
        btnImageLoader.setOnClickListener(this);
        btnCustomResponse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnStringReq:

                startActivity(new Intent(this, StringRequestActivity.class));

                break;

            case R.id.btnSingleton:

                startActivity(new Intent(this, SingletonUsageActivity.class));

                break;

            case R.id.btnJsonObject:

                startActivity(new Intent(this, JsonObjectActivity.class));

                break;

            case R.id.btnJsonArray:

                startActivity(new Intent(this, JsonArrayActivity.class));

                break;

            case R.id.btnImage:

                startActivity(new Intent(this, ImageRequestActivity.class));

                break;

            case R.id.btnImageLoader:

                startActivity(new Intent(this, ImageLoaderActivity.class));

                break;

            case R.id.btnCustomResponse:

                startActivity(new Intent(this, CustomResponseActivity.class));

                break;
        }
    }
}
