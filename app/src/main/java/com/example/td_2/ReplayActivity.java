package com.example.td_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replay);

        Button m = findViewById(R.id.button_rejwe);

        View.OnClickListener mo = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bi = new Intent(ReplayActivity.this,GameActivity.class);
                startActivity(bi);
            }
        };

        m.setOnClickListener(mo);
    }
}