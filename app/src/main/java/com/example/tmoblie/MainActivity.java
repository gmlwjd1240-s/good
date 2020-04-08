package com.example.tmoblie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input_id;   EditText input_pw;
    Button login; Button find; Button join;

    DBHelper dbHelper;
    SQLiteDatabase db = null;
    Cursor sursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플을 실행했을 때 처음으로 실행되는 생명주기
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_id = findViewById(R.id.input_id);
        input_pw = findViewById(R.id.input_pw);
        login = findViewById(R.id.login);
        find = findViewById(R.id.find);
        join = findViewById(R.id.join);

        dbHelper = new DBHelper(this, 3);
        db = dbHelper.getWritableDatabase();

        //엔터를 치면 다음 텍스트 뷰로 넘어감
        input_id.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if((event.getAction() == KeyEvent.ACTION_DOWN) && keyCode == KeyEvent.KEYCODE_ENTER) {
                    EditText editText = findViewById(R.id.input_pw);
                    input_pw.requestFocus();
                    return true;
                }
                return false;
            }
        });

        login.setOnClickListener(new View.OnClickListener() { //login 버튼을 터치했을 때 앱 실행화면 띄우기
            @Override
            public void onClick(View v) {

            }
        });

        find.setOnClickListener(new View.OnClickListener() { //find 버튼을 터치했을 때 아이디/비번 찾기 화면 띄우기
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FindActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });

        join.setOnClickListener(new View.OnClickListener() { //join 버튼을 터치했을 때 회원가입 화면 띄우기
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });


        }



}




