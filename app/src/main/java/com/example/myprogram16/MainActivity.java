package com.example.myprogram16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText surnames, names, patronymic, ages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn_send); // Исправлено на btn_send
        surnames = findViewById(R.id.et_surname); // Исправлено на et_surname
        names = findViewById(R.id.et_name); // Исправлено на et_name
        patronymic = findViewById(R.id.et_patronymic); // Исправлено на et_patronymic
        ages = findViewById(R.id.et_age); // Исправлено на et_age
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = surnames.getText().toString();
                String name = names.getText().toString();
                String patron = patronymic.getText().toString();
                String age = ages.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("s", surname);
                intent.putExtra("n", name);
                intent.putExtra("p", patron);
                intent.putExtra("a", age);
                startActivity(intent);
            }
        });
    }
}
