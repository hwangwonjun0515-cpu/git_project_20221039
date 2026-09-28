package com.recipe.mondayclass; // 본인 프로젝트의 패키지명으로 바꾸세요

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 단 범위: 10단 ~ 13단
    private static final int MIN_DAN = 10;
    private static final int MAX_DAN = 13;

    // 곱하는 수 범위: 5부터 시작 (끝 숫자는 필요하면 바꾸세요)
    private static final int START_MUL = 5;
    private static final int END_MUL = 9;

    private int currentDan = MIN_DAN;
    private TextView tvTitle;
    private TextView tvResult;
    private Button btnPrev;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tvTitle);
        tvResult = findViewById(R.id.tvResult);
        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);

        btnPrev.setOnClickListener(v -> {
            if (currentDan > MIN_DAN) {
                currentDan--;
                showDan();
            }
        });

        btnNext.setOnClickListener(v -> {
            if (currentDan < MAX_DAN) {
                currentDan++;
                showDan();
            }
        });

        showDan();
    }

    private void showDan() {
        tvTitle.setText(currentDan + "단");

        StringBuilder sb = new StringBuilder();
        for (int i = START_MUL; i <= END_MUL; i++) {
            sb.append(currentDan).append(" x ").append(i)
                    .append(" = ").append(currentDan * i).append("\n");
        }
        tvResult.setText(sb.toString());

        btnPrev.setEnabled(currentDan > MIN_DAN);
        btnNext.setEnabled(currentDan < MAX_DAN);
    }
}