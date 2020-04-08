package com.example.tmoblie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindActivity extends AppCompatActivity {

    Button find_id;  Button find_pw; Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        find_id = findViewById(R.id.find_id);
        find_pw = findViewById(R.id.find_pw);
        cancel = findViewById(R.id.cancel);

        find_id.setOnClickListener(new View.OnClickListener() { //취소 버튼을 터치했을 때 로그인 화면 띄우기
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Find_idActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });

        find_pw.setOnClickListener(new View.OnClickListener() { //취소 버튼을 터치했을 때 로그인 화면 띄우기
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Find_pwActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() { //취소 버튼을 터치했을 때 로그인 화면 띄우기
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });

    }
}
