package com.example.andoirdproject.Prac11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.andoirdproject.R;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnplus,btnmin,btnmul,btndiv ,btnans,btndot,btnclear;
    EditText editText;
    float a,b;
    boolean add,min,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText = findViewById(R.id.edittext1);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnplus = findViewById(R.id.btnplus);
        btnmin = findViewById(R.id.btnmin);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);

        btnans = findViewById(R.id.btnans);
        btndot = findViewById(R.id.btndot);
        btnclear = findViewById(R.id.btnclear);



        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        btnmin.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnans.setOnClickListener(this);
        btndot.setOnClickListener(this);
        btnclear.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
                editText.setText(editText.getText()+"0");
             break;
            case R.id.btn1:
                editText.setText(editText.getText()+"1");
                break;
            case R.id.btn2:
                editText.setText(editText.getText()+"2");
                break;
            case R.id.btn3:
                editText.setText(editText.getText()+"3");
                break;
            case R.id.btn4:
                editText.setText(editText.getText()+"4");
                break;
            case R.id.btn5:
                editText.setText(editText.getText()+"5");
                break;
            case R.id.btn6:
                editText.setText(editText.getText()+"6");
                break;
            case R.id.btn7:
                editText.setText(editText.getText()+"7");
                break;
            case R.id.btn8:
                editText.setText(editText.getText()+"8");
                break;
            case R.id.btn9:
                editText.setText(editText.getText()+"9");
                break;
            case R.id.btndot:
                editText.setText(editText.getText()+".");
                break;
            case R.id.btnplus:
                if(editText == null)
                {
                    editText.setText("");
                }
                else {
                    a = Float.parseFloat(editText.getText()+"");
                    add= true;
                    editText.setText(null);

                }
                break;
            case R.id.btnmin:
                if(editText == null)
                {
                    editText.setText("");
                }
                else {
                    a = Float.parseFloat(editText.getText()+"");
                    min= true;
                    editText.setText(null);

                }
                break;
            case R.id.btnmul:
                if(editText == null)
                {
                    editText.setText("");
                }
                else {
                    a = Float.parseFloat(editText.getText()+"");
                    mul= true;
                    editText.setText(null);

                }
                break;
            case R.id.btndiv:
                if(editText == null)
                {
                    editText.setText("");
                }
                else {
                    a = Float.parseFloat(editText.getText()+"");
                    div= true;
                    editText.setText(null);

                }
                break;
            case R.id.btnclear:
                editText.setText("");
                break;
            case R.id.btnans:
                b= Float.parseFloat(editText.getText()+"");
                if(add){
                    editText.setText(a+b+"");
                    add=false;
                }
                else if(min){
                    editText.setText(a-b+"");
                    min=false;
                }
                else if(mul){
                    editText.setText(a*b+"");
                    mul=false;
                }
                else if(div){
                    editText.setText(a/b+"");
                    div=false;
                }
                break;



        }

    }

}
