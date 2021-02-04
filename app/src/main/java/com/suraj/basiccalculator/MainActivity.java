package com.suraj.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.Math.*;

public class MainActivity extends AppCompatActivity {

    Button clear;
    Button calculate;
    Editable firstText;
    double firstNumber;
    Editable secondText;
    double secondNumber;
    double result;
    Spinner objspinner;
    String value;
    EditText first;
    EditText second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear=(Button)findViewById(R.id.Clear);
        calculate=(Button)findViewById(R.id.Calculate);
        objspinner=(Spinner)findViewById(R.id.spinner);


    }

    public void clearclicking(View view)
    {
        first.setText(null);
        second.setText(null);

    }

    public void calculateclicking(View view)
    {
        first=(EditText)findViewById(R.id.editText);
        if(first.getText().toString().length()==0) {
            firstNumber=0;
        }
        else
        {
            firstText=first.getEditableText();
            firstNumber=Double.parseDouble(firstText.toString()); //toString()
        }


        second=(EditText)findViewById(R.id.editText2);
        if(second.getText().toString().length()==0) {
            secondNumber=0;
        }
        else
        {
            secondText=second.getEditableText();
            secondNumber=Double.parseDouble(secondText.toString()); //toString()
        }
        
 

        value=String.valueOf(objspinner.getSelectedItem());

        switch (value)
        {
            case "Add":
                result=firstNumber+secondNumber;
                Toast.makeText(getApplicationContext(), firstNumber+"+"+secondNumber+" = "+result,Toast.LENGTH_LONG).show();
                break;
            case "Subtract":
                result=firstNumber-secondNumber;
                Toast.makeText(getApplicationContext(), firstNumber+"-"+secondNumber+" = "+result,Toast.LENGTH_LONG).show();
                break;
            case "Multiplication":
                result=firstNumber*secondNumber;
                Toast.makeText(getApplicationContext(), firstNumber+"*"+secondNumber+" = "+result,Toast.LENGTH_LONG).show();
                break;
            case "Division":
                result=firstNumber/secondNumber;
                Toast.makeText(getApplicationContext(), firstNumber+"/"+secondNumber+" = "+result,Toast.LENGTH_LONG).show();
                break;
            case "Power":
                result=Math.pow(firstNumber,secondNumber);
                Toast.makeText(getApplicationContext(), firstNumber+"^"+secondNumber+" = "+result,Toast.LENGTH_LONG).show();
                break;

        }

        Toast.makeText(getApplicationContext(), firstNumber+"+"+secondNumber+" = "+result,Toast.LENGTH_LONG).show();
        first.setText(Double.toString(result));
        second.setText(null);







    }


}
