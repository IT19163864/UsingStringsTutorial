package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView txtView2;
    private static final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Log.i(TAG, "onCreate() invoked");

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }

    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() invoked");
    }

    public void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart() invoked");
    }

    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() invoked");
    }

    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() invoked");
    }

    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() invoked");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() invoked");
    }
}