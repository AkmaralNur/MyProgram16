package com.example.myprogram16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button button;
    TextView sname, name, patr, agesss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_send); // Исправлено на правильный идентификатор кнопки
        sname = findViewById(R.id.et_surname); // Исправлено на правильный идентификатор TextView
        name = findViewById(R.id.et_name); // Исправлено на правильный идентификатор TextView
        patr = findViewById(R.id.et_patronymic); // Исправлено на правильный идентификатор TextView
        agesss = findViewById(R.id.et_age); // Исправлено на правильный идентификатор TextView

        Intent intent = getIntent();
        String surname = intent.getStringExtra("s");
        String n = intent.getStringExtra("n");
        String patron = intent.getStringExtra("p");
        String age = intent.getStringExtra("a");

        sname.setText(surname);
        name.setText(n);
        patr.setText(patron);
        agesss.setText(age);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
