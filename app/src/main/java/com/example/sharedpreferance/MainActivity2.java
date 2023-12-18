package com.example.sharedpreferance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.tv_shpre);

        sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);

        String name = sharedPreferences.getString("Name","jjh");
        int agge = sharedPreferences.getInt("age",0);

        textView.setText(String.valueOf(agge));
    }
}