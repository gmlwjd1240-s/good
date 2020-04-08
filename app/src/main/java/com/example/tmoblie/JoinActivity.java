package com.example.tmoblie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JoinActivity extends AppCompatActivity {

    EditText Input_name; EditText input_eamil;
    EditText input_id; EditText input_pw;
    Button dcheck1; Button dcheck2; Button join_cancel; Button join_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

//        input_name = findViewById(R.id.input_name);
//        input_email = findViewById(R.id.input_email);
        input_id = findViewById(R.id.input_id);
        input_pw = findViewById(R.id.input_pw);
        dcheck1 = findViewById(R.id.dcheck1);
        dcheck2 = findViewById(R.id.dcheck2);
        join_cancel = findViewById(R.id.join_cancel);
        join_ok = findViewById(R.id.join_ok);

        join_cancel.setOnClickListener(new View.OnClickListener() { //취소 버튼을 터치했을 때 로그인 화면 띄우기
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }
}
