package com.example.grisha.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainHW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hw);
        if (savedInstanceState != null) {
            return;
        }
    }

        public void startQuiz(View view){
            Intent intent = new Intent(this,FirstQuestionFragment.class);
            startActivity(intent);
            finish();
        }
    }

}
