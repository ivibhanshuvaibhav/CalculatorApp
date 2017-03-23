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
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.one)));
            }
        });

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.two)));
            }
        });

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.three)));
            }
        });

        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.four)));
            }
        });

        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.five)));
            }
        });

        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.six)));
            }
        });

        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.seven)));
            }
        });

        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.eight)));
            }
        });

        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.nine)));
            }
        });

        b0 = (Button) findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.zero)));
            }
        });

        bDot = (Button) findViewById(R.id.button_dot);
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.dot)));
            }
        });

        bAdd = (Button) findViewById(R.id.button_add);
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.add)));
                add = true;
            }
        });

        bSub = (Button) findViewById(R.id.button_sub);
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.sub)));
                sub = true;
            }
        });

        bMul = (Button) findViewById(R.id.button_mul);
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.mul)));
                mul = true;
            }
        });

        bDiv = (Button) findViewById(R.id.button_div);
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerField.setText(String.format(getString(R.string.values), answerField.getText(), getString(R.string.div)));
                div = true;
            }
        });

        bEq = (Button) findViewById(R.id.button_eq);
        bEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add){
                    String values[] = answerField.getText().toString().split("\\+");
                    val1 = Float.parseFloat(values[0]);
                    val2 = Float.parseFloat(values[1]);
                    answer = val1 + val2;
                    answerField.setText(String.format(getString(R.string.answer), answer));
                } else if (sub){
                    String values[] = answerField.getText().toString().split("-");
                    val1 = Float.parseFloat(values[0]);
                    val2 = Float.parseFloat(values[1]);
                    answer = val1 - val2;
                    answerField.setText(String.format(getString(R.string.answer), answer));
                } else if (mul){
                    String values[] = answerField.getText().toString().split("\\*");
                    val1 = Float.parseFloat(values[0]);
                    val2 = Float.parseFloat(values[1]);
                    answer = val1 * val2;
                    answerField.setText(String.format(getString(R.string.answer), answer));
                } else if (div){
                    String values[] = answerField.getText().toString().split("/");
                    val1 = Float.parseFloat(values[0]);
                    val2 = Float.parseFloat(values[1]);
                    answer = val1 / val2;
                    answerField.setText(String.format(getString(R.string.answer), answer));
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
