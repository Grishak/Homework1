package com.example.grisha.homework1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by Grisha on 2/14/2016.
 */
public class SecondQuestion extends Fragment {
    private boolean Ellen = true ;
    FirstQuestionFragment firstQuestAnswer ;
    Button submit ;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null;
        view = inflater.inflate(R.layout.First_Question_Fragment, container, false);


        return view;
    }
    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked() ;
        switch (view.getId()){
            case R.id.EllenButton:
                if(checked){
                    Ellen = true;
                break;
                }
            case R.id.JesseButton:
                if (checked){
                    Ellen = false;
                break;
                }
            case R.id.DJButton:
                if (checked){
                    Ellen = false;
                break;
                }

            case R.id.JoeyButton:
                if (checked){
                    Ellen = false;
                break;
                }
        }




    public String displayGrade(boolean Ellen,boolean firstQuestion) {
        String grade;
        if (Ellen && firstQuestion == true) {
            grade = "100%";
        } else if (Ellen || firstQuestion == true) {
            grade = "50%";
        } else (
                grade = "0%"
        )
        new AlertDialog.Builder()

        return grade ;

    }







    }




}

