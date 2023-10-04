package com.sandeep.counterlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView tvCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.initialize();
    }
    private void initialize(){
        tvCount = findViewById(R.id.tvCount);

        String c = getIntent().getStringExtra("count");

        tvCount.setText(c);
    }
}