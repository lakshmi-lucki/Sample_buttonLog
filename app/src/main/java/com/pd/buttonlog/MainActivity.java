package com.pd.buttonlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void myClick_Fun(View view){
        
        Log.i("info","Message");

    }

    public void myClickFun1(View view) {
        Log.e("Info","The error is....");
        Toast.makeText(this, "the error is.....", Toast.LENGTH_SHORT).show();

    }
    public void myClickFun2(View view) {

        Log.v("Info","The Debug message is....");
    }

}