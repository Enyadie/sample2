package com.example.sample2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView  Title;
Button btn;
EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = findViewById(R.id.editText);
        btn =  findViewById(R.id.button);
        Title= findViewById(R.id.Title);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =  edittext.getText().toString();
                Toast.makeText(MainActivity.this,"you like "+name+" that great.", Toast.LENGTH_SHORT).show();
            }

        });

    }
}