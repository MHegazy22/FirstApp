package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button colorButton , textButton;
    private TextView myText ;
    private EditText inputText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorButton = (Button) findViewById(R.id.colorButton);
        textButton = (Button) findViewById(R.id.textButton);
        myText = (TextView) findViewById(R.id.myText);
        inputText = (EditText) findViewById(R.id.inputText);

        //colorButton.setText(R.string.colorButton);
        //myButton.setTextColor(Color.RED);

        colorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeColor (myText);
            }
        });

        textButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                changeText (myText , inputText);
            }
        });
    }
    public void changeText (TextView myText , EditText inputText){
        String input = inputText.getText().toString();
        myText.setText(input);
    }

    public void changeColor (TextView myText){
        if (myText.getCurrentTextColor()==Color.RED)
            myText.setTextColor(Color.BLUE);
        else
            myText.setTextColor(Color.RED);
    }

}
