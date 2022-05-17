package com.example.boundservice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnStart, mBtnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initItem();
        
        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickStart();
            }
        });
        
        mBtnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickStop();
            }
        });
    }

    private void onClickStop() {
    }

    private void onClickStart() {
    }

    private void initItem() {
        mBtnStart=findViewById(R.id.btnStartBoundService);
        mBtnStop=findViewById(R.id.btnStopBoundService);
    }
}