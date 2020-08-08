package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView txtView2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Log.i("LifeCycle", "OnCreate() invoked");

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle", "OnStart() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle", "OnRestart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle", "OnResume() invoked");
    }

}