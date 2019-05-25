package com.example.android_lab_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
    }


    public void clickDisplayCorrectToast(View view){

        Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
    }

public void clickDisplayIncorrectToast(View view){
    Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();

}


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart () called");


    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause() called");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop() called");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy() called");
    }
}
