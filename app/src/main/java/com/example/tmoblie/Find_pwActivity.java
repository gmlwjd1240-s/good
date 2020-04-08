package com.example.tmoblie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Find_pwActivity extends AppCompatActivity {
    EditText input_id; EditText input_email; EditText input_name; EditText input_phone;
    Button pw_cancel; Button pw_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);

        pw_cancel = findViewById(R.id.id_cancel);
        pw_ok = findViewById(R.id.id_ok);

        pw_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FindActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }
}
