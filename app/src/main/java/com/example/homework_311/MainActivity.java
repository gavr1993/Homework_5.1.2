package com.example.homework_311;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ConstraintTableLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnPnt;
    private TextView resTxt;
    private Button btnDiv;
    private Button btnMlt;
    private Button btnSum;
    private Button btnMin;
    private Button btnRes;
    private Button btnC;
    private Button btnPm;
    private Button btnPrc;
    private Button btnSetSimple;
    private Button btnSetIng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);
        Button btnPnt = findViewById(R.id.btnPnt);
        Button btnDiv = findViewById(R. id. btnDiv);
        Button btnMlt = findViewById(R. id. btnMlt);
        Button btnSum = findViewById(R. id. btnSum);
        Button btnMin = findViewById(R. id. btnMin);
        Button btnRes = findViewById(R. id. btnRes);
        Button btnC = findViewById(R. id. btnC);
        Button btnPm = findViewById(R. id. btnPm);
        Button btnPrc = findViewById(R. id. btnPrc);
        Button btnSetSimle = findViewById(R. id. btnSetSimple);
        Button btnSetIng = findViewById(R. id. btnSetIng);
        final TextView resTxt = findViewById(R.id.resTxt);
        final LinearLayout simple = findViewById(R. id. simple);
        final ConstraintLayout ingeneering = findViewById(R. id. ingeneering);

        btnSetSimle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simple.setVisibility(View.VISIBLE);
                ingeneering.setVisibility(View.GONE);
            }
        });

        btnSetIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simple.setVisibility(View.GONE);
                ingeneering.setVisibility(View.VISIBLE);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + "0");
            }
        });
        btnPnt.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                resTxt.setText(resTxt.getText() + ".");
                v.setClickable(false);
            }
        });
    }
}
