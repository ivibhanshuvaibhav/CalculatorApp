package com.example.vibhanshu.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bDot, bAdd, bSub, bMul, bDiv, bEq, bClear, bClearAll;
    private EditText answerField;
    private float val1, val2, answer;
    private boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerField = (EditText) findViewById(R.id.answer_field);

        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "1");
            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "2");
            }
        });

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "3");
            }
        });

        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "4");
            }
        });

        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "5");
            }
        });

        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "6");
            }
        });

        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "7");
            }
        });

        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "8");
            }
        });

        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "9");
            }
        });

        b0 = (Button) findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + "0");
            }
        });

        bDot = (Button) findViewById(R.id.button_dot);
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(answerField.getText() + ".");
            }
        });

        bAdd = (Button) findViewById(R.id.button_add);
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(answerField.getText() + "");
                answerField.setText(null);
                add = true;
            }
        });

        bSub = (Button) findViewById(R.id.button_sub);
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(answerField.getText() + "");
                answerField.setText(null);
                sub = true;
            }
        });

        bMul = (Button) findViewById(R.id.button_mul);
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(answerField.getText() + "");
                answerField.setText(null);
                mul = true;
            }
        });

        bDiv = (Button) findViewById(R.id.button_div);
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(answerField.getText() + "");
                answerField.setText(null);
                div = true;
            }
        });

        bEq = (Button) findViewById(R.id.button_eq);
        bEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add == true){
                    val2 = Float.parseFloat(answerField.getText() + "");
                    answer = val1 + val2;
                    answerField.setText("Result: " + answer);
                } else if (sub == true){
                    val2 = Float.parseFloat(answerField.getText() + "");
                    answer = val1 - val2;
                    answerField.setText("Result: " + answer);
                } else if (mul == true){
                    val2 = Float.parseFloat(answerField.getText() + "");
                    answer = val1 * val2;
                    answerField.setText("Result: " + answer);
                } else if (div == true){
                    val2 = Float.parseFloat(answerField.getText() + "");
                    answer = val1 / val2;
                    answerField.setText("Result: " + answer);
                }

            }
        });

        bClear = (Button) findViewById(R.id.button_clear);
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = answerField.getText().length();
                answerField.setText(answerField.getText().subSequence(0, length - 1));
            }
        });

        bClearAll = (Button) findViewById(R.id.button_clearAll);
        bClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(null);
            }
        });

    }
}
