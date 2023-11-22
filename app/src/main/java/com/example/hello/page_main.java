package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class page_main extends AppCompatActivity {
    LinearLayout teamInfo, teamRecord, teamSchedule, playerRecord, gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page_layout);

        teamInfo = findViewById(R.id.teamInfo);
        teamRecord = findViewById(R.id.teamRecord);
        teamSchedule = findViewById(R.id.teamSchedule);
        playerRecord = findViewById(R.id.player_record);
        gallery = findViewById(R.id.gallery);

        teamInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_main.this, teamInformation.class);
                startActivity(intent);
            }
        });

        teamRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_main.this, TeamRecord.class);
                startActivity(intent);
            }
        });

        teamSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_main.this, TeamSchedule.class);
                startActivity(intent);
            }
        });

        playerRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_main.this, PlayerRecord.class);
                startActivity(intent);
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_main.this, Gallery.class);
                startActivity(intent);
            }
        });

    }
}


