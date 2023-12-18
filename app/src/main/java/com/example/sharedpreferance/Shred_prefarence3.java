package com.example.sharedpreferance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Shred_prefarence3 extends AppCompatActivity {
    EditText editText1,editText2;
    Button btn1,btn2,btn3;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shred_prefarence3);
        editText1=findViewById(R.id.editTextText4);
        editText2=findViewById(R.id.editTextText5);
        btn1=findViewById(R.id.button2);
        btn2=findViewById(R.id.button3);
        btn3=findViewById(R.id.button4);
        textView=findViewById(R.id.textView5);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("NaM",Context.MODE_PRIVATE);
                textView.setText(sharedPreferences.getString("Name",""));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences =getSharedPreferences("NaM", Context.MODE_PRIVATE);
                SharedPreferences.Editor edt= sharedPreferences.edit();
                edt.putString("Name",editText1.getText().toString());
                edt.putString("Last Name",editText2.getText().toString());
                edt.apply();
                editText1.setText("");
                editText2.setText("");
                textView.setText("Save Successfully");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("NaM",Context.MODE_PRIVATE);
                SharedPreferences.Editor edtt=sharedPreferences.edit();
                edtt.clear();
                edtt.apply();
                editText1.setText("");
                editText2.setText("");
                textView.setText("Delete Successfully");

            }
        });
    }
}