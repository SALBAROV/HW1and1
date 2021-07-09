package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtValue;
    EditText etValue;
    Button btnChange, btnBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValue = findViewById(R.id.txt_value);
        etValue = findViewById(R.id.et_value);
        btnChange = findViewById(R.id.btn_change);
        btnBut = findViewById(R.id.button);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = etValue.getText().toString();
                if (value.isEmpty()){
                    etValue.setError("ведите текст");
                    Toast.makeText(MainActivity.this, "ведите текст", Toast.LENGTH_SHORT).show();
                }else {
                    txtValue.setText(value);
                }

            }
        });

        btnBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ведите текст", Toast.LENGTH_LONG).show();
            }
        });

    }
}