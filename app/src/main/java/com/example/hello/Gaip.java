package com.example.hello;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class Gaip extends AppCompatActivity {
    Button join_btn;
    Button exit_btn;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gaip);

        join_btn = (Button) findViewById(R.id.join_button);
        exit_btn = (Button) findViewById(R.id.exit_button);
        join_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gaip.this, page_main.class);
                startActivity(intent);
            }
        });
        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gaip.this, click_main.class);
                startActivity(intent);
            }
        });
    }
}