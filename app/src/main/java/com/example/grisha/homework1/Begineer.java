package com.example.grisha.homework1;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Grisha on 2/19/2016.
 */
public class Begineer extends AppCompatActivity {


    Fragment firstFrag;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        //TA implementation
        firstFrag = new FirstQuestionFragment() ;
        this.getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, firstFrag)
                .addToBackStack(null)
                .commit();

    }





}
