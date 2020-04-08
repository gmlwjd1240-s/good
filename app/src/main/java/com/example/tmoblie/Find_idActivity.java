package com.example.tmoblie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Find_idActivity extends AppCompatActivity {
    EditText input_email; EditText input_name; EditText input_phone;
    Button id_cancel; Button id_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);

        id_cancel = findViewById(R.id.id_cancel);
        id_ok = findViewById(R.id.id_ok);

        id_cancel.setOnClickListener(new View.OnClickListener() { //취소 버튼을 터치했을 때 로그인 화면 띄우기
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FindActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }

}
