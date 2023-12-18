package com.example.sharedpreferance;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShredDataPass2 extends AppCompatActivity {

    TextView TextView1,TextView2,TextView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shred_data_pass2);
        TextView1=findViewById(R.id.textView2);
        TextView2=findViewById(R.id.textView3);
        TextView3=findViewById(R.id.textView4);

        Intent intent=getIntent();

        String txt=intent.getStringExtra("Name");
        String txt2=intent.getStringExtra("S_name");
        String txt3=intent.getStringExtra("T_Name");

        TextView1.setText(txt);
        TextView2.setText(txt2);
        TextView3.setText(txt3);




    }
}