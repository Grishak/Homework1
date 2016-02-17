package com.example.grisha.homework1;

/**
 * Created by Grisha on 2/14/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstQuestionFragment extends Fragment {

        private EditText firstAnswer ;
        private Button nextQuestion ;
        public boolean correct ;



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null ;
        view =  inflater.inflate(R.layout.First_Question_Fragment, container, false);
        //instantiate widgets
        nextQuestion = (Button)view.findViewById(R.id.firstQuestionButton);
        firstAnswer = (EditText) view.findViewById(R.id.first_question_answer);

        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


               public void OnClick(View v){

        Intent nextIntent = new Intent(getActivity(),SecondQuestion.class);
        if(firstAnswer.equals(3)){
            correct = true ;
            startActivity(nextIntent);
        }
        else{
            correct = false ;
            startActivity(nextIntent);
        }

    }



        }




    public boolean firstAnswer(){
        return correct ;
    }

}
