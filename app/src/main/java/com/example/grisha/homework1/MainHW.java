package com.example.grisha.homework1;

import android.content.Intent;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;



public class MainHW extends AppCompatActivity {

    Fragment firstFrag ;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hw);
        if (savedInstanceState != null) {
            return;
        }
        intent = new Intent(this, Begineer.class);
        Button beginQuiz = (Button) findViewById(R.id.startButton);
        beginQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);
            }
        });



    }

       /* public void startQuiz(View view){
            Intent intent = new Intent(this,Start.class);
            startActivity(intent);

        }*/
    }


