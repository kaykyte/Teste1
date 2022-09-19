package com.example.teste1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btSomar, btSubtrair, btMultiplicar, btDividir;
    private EditText edN1, edN2;
    private TextView tvResultado;
    private double num1;
    private double num2;
    private double resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //button
        btSomar = findViewById(R.id.radiobuttonSomar);
        btSubtrair = findViewById(R.id.radiobuttonSubtrair);
        btMultiplicar = findViewById(R.id.radiobuttonMultiplicar);
        btDividir = findViewById(R.id.radiobuttonDividir);
        //editText
        edN1 = findViewById(R.id.editTextPeso);
        edN2 = findViewById(R.id.editTextAltura);
        //text view
        tvResultado = findViewById(R.id.textViewImc);

        // ouvinte dos botoes
        btSomar.setOnClickListener(this);
        btSubtrair.setOnClickListener(this);
        btMultiplicar.setOnClickListener(this);
        btDividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (edN2.getText().toString().length() == 0){
            edN2.setError("Digite um numero");

        }
        if (edN1.getText().toString().length() == 0){
            edN1.setError("Digite um numero");

        } else {
            num1 = Double.parseDouble(edN1.getText().toString());
            num2 = Double.parseDouble(edN2.getText().toString());

            switch (view.getId()) {
                case R.id.radiobuttonSomar:
                    resultado = num1 + num2;
                    break;
                case R.id.radiobuttonSubtrair:
                    resultado = num1 - num2;
                    break;
                case R.id.radiobuttonMultiplicar:
                    resultado = num1 * num2;
                    break;
                case R.id.radiobuttonDividir:
                    resultado = num1 / num2;
                    break;
            }
        }
        tvResultado.setText("O resultado e: " + String.format("%.2f", resultado));
    }
}