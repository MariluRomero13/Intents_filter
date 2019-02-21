package com.example.intents_filter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String t = getIntent().getStringExtra("Mensaje");
        tv = findViewById(R.id.tvtext);

        if (t != null)
        {
            tv.setText(t);
        }
    }
}
