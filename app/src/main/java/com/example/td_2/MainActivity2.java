package com.example.td_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button_rejwe);

        View.OnClickListener bClick = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent gameIntent = new Intent(MainActivity2.this,
                                        GameActivity.class);

                startActivity(gameIntent);
            }
        };

        mButton.setOnClickListener(bClick);
    }

//    @Override
//    protected onClick(View v){
//
//    }
}