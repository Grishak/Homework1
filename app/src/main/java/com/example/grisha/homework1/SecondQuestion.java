package com.example.grisha.homework1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * Created by Grisha on 2/14/2016.
 */
public class SecondQuestion extends Fragment {
    private boolean Ellen  ;
    FirstQuestionFragment firstQuestAnswer ;
    private Button submit;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null;
        view = inflater.inflate(R.layout.second_question_fragment, container, false);

        submit = (Button) view.findViewById(R.id.finishButton);
        btnEllen = (RadioButton) view.findViewById(R.id.EllenButton);
        Toast.makeText(getActivity(), submit.toString(), Toast.LENGTH_SHORT);
        Log.d("Debugging submit", submit.toString());
         submit.setOnClickListener(
                 new View.OnClickListener(){
                     @Override
                     public void onClick(View v) {
                        finish(v);
                     }
                 }
         );


        return view;
    }
    private RadioButton btnEllen;


    public void finish(View view) {
        boolean checked = btnEllen.isChecked();


        if(checked== true){
            Ellen = true;
        }
        else {
            Ellen = false ;
        }
        displayGrade(Ellen, MainHW.firstCorrect);

    }


    public void displayGrade(boolean Ellen,boolean firstQuestion) {
        String grade;
        if (Ellen && firstQuestion == true) {
            grade = "100%";

        } else if (Ellen || firstQuestion == true) {
            grade = "50%";
        } else {

            grade = "0%" ;
        }

        new AlertDialog.Builder(getActivity())
            .setCancelable(true)
            .setTitle("You Score is ")
            .setMessage(grade)
            .setPositiveButton("Retry", new DialogInterface.OnClickListener() {


                public void onClick(DialogInterface dialog, int which) {
                    getFragmentManager().popBackStack();
                }
            }

            )
            .setNegativeButton("Quit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    getActivity().finish();
                }
            })
                .show();
    }



}














