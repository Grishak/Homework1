package com.example.grisha.homework1;

/**
 * Created by Grisha on 2/14/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstQuestionFragment extends Fragment {

        public EditText firstAnswer ;
        private Button nextQuestion ;
        Fragment secFrag;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null ;
        view =  inflater.inflate(R.layout.first_question_fragment, container, false);
        //instantiate widgets

        firstAnswer = (EditText) view.findViewById(R.id.first_question_answer);

        nextQuestion = (Button)view.findViewById(R.id.firstQuestionButton);
        nextQuestion.setOnClickListener(

                 new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         firstQuestion(v);
                     }
                 }

         );

        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    public void firstQuestion(View view){
        secFrag = (Fragment) new SecondQuestion();
               System.out.println(String.valueOf(firstAnswer));
        if(firstAnswer.getText().toString().equals("3") ){

            MainHW.firstCorrect = true; ;

                getActivity().getFragmentManager(   )
                        .beginTransaction()
                        .replace(R.id.main_fragment_container, secFrag)
                         .addToBackStack(null)
                        .commit();
            }

            else{
             MainHW.firstCorrect = false;

                getActivity().getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_fragment_container, secFrag)
                        .addToBackStack(null)
                        .commit();
            }


        }

}
