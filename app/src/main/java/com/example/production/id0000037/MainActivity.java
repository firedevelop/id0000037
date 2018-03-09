package com.example.production.id0000037;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private EditText userInput;
    private Button button;
    private TextView textResult;
    private int numTimesClicked=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput=(EditText)findViewById(R.id.userInput);
        button=(Button)findViewById(R.id.button);
        textResult=(TextView)findViewById(R.id.textResult);

        textResult.setText(""); //allow to start with the textView empty other way will appear some text in the TextView
        textResult.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener ourOnClickListener=new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numTimesClicked=numTimesClicked+1;
                String result="The button got tapped " + numTimesClicked + " time";
                if(numTimesClicked !=1){
                    result +="s";
                }
                result=result + "\n";
                textResult.append(result);
            }
        };
        button.setOnClickListener(ourOnClickListener);
    }
}