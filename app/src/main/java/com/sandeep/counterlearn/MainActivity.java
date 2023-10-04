package com.sandeep.counterlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     int count = 0;

    Button minusBtn, addBtn, btnNext;
    TextView countTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initialize();
    }
    private void initialize(){
        minusBtn = findViewById(R.id.btnMinus);
        addBtn = findViewById(R.id.btnAdd);
        btnNext  = findViewById(R.id.btnNextScreen);
        countTv = findViewById(R.id.tvCount);
        minusBtn.setOnClickListener(this);
        addBtn.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Log.d("MainActivity", "inside on click");
        int id = view.getId();
        if(id==R.id.btnMinus && count > 0){
            count--;
        }

        if(id==R.id.btnAdd){
            Log.d("MainActivity", "inside add btn");
           count++;
            Log.d("MainActivity", "Count is : " + count);
        }
        countTv.setText(String.valueOf(count));

        if(id==R.id.btnNextScreen){
            Log.d("MainActivity", "inside next btn");
            this.ExecuteSecondActivity();
        }
    }

    private void ExecuteSecondActivity(){
        String c = String.valueOf(count);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("count", c);

        startActivity(intent);
    }

}