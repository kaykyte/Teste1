package com.example.teste1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edNome;
    private Button bt1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNome = findViewById(R.id.editTextNome);
        tv1 = findViewById(R.id.textViewNome);
        bt1 = findViewById(R.id.buttonRecuperaNome);
    }

    public void funcaoJava(View v) {
        String nomeDigitado = edNome.getText().toString();
        tv1.setText("O nome e: " + nomeDigitado);
    }
}