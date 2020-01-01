package com.example.vibhor.savedinstanceappdemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    int counter =0;

    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addOnClickListener();




    }

    public void addOnClickListener()
    {
        button= (Button) findViewById(R.id.submit);
        editText= (EditText) findViewById(R.id.edit_text);

        String s=editText.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        counter++;

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);



        outState.putInt("COUNTER", counter);
        Log.d("Vibhor", "onSaveInstanceState: " + counter + "was saved");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        counter = savedInstanceState.getInt("COUNTER");
        Log.d("Vibhor", "onRestoreInstanceState: " + counter + "was restored");

        
    }
}
