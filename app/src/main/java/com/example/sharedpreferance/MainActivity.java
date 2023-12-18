package com.example.sharedpreferance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferance;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_name);
        sharedPreferance= getSharedPreferences("Data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editer = sharedPreferance.edit();
        editer.putString("Name","bvugguyjvjvj");
        editer.putInt("age",1);
        editer.putBoolean("add",true);
        editer.putFloat("float", 10.2F);
        editer.apply();

        String name = sharedPreferance.getString("Name","jhjhj");
        textView.setText(name);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }


}