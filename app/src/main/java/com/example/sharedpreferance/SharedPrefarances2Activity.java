package com.example.sharedpreferance;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SharedPrefarances2Activity extends AppCompatActivity {
    EditText EditText1,EditText2,EditText3;
    Button Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefarances2);
        EditText1=findViewById(R.id.editTextText);
        EditText2=findViewById(R.id.editTextText2);
        EditText3=findViewById(R.id.editTextText3);
        Button=findViewById(R.id.button);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String first = EditText1.getText().toString();
               String second = EditText2.getText().toString();
               String third = EditText3.getText().toString();
                Intent intent = new Intent(SharedPrefarances2Activity.this,ShredDataPass2.class);


               intent.putExtra("Name",first);
               intent.putExtra("S_name",second);
               intent.putExtra("T_Name",third);
                startActivity(intent);
            }
        });
    }
}