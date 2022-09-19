package com.example.teste1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{

    private EditText edPeso, edAltura;
    private RadioGroup rg1;
    private Button btCalcular, btLimpar;
    private String peso, altura, limpa="";
    private double imc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        edPeso = findViewById(R.id.editTextPeso);
        edAltura = findViewById(R.id.editTextAltura);
        rg1 = findViewById(R.id.radioGrupo);
        btCalcular = findViewById(R.id.buttonCalcular);
        btLimpar = findViewById(R.id.buttonLimpar);

        btCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (verificado()) {

            peso = edPeso.getText().toString();
            altura = edAltura.getText().toString();

            switch (rg1.getCheckedRadioButtonId()) {
                case R.id.radiobuttonMasculino:

                    float p = Float.parseFloat(peso);
                    float a = Float.parseFloat(altura);

                    imc = p/(a*a);

                    String resultado = String.format("%.2f", imc);

                    if(imc < 20){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nAbaixo do Peso");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 20 && imc <= 24.99){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nPeso Normal");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 25 && imc <= 29.99){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nExcesso de Peso");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 30 && imc <= 34.99){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nObesidade Classe I");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 35 && imc <= 39.99){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nObesidade Classe II");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 40){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nObesidade Classe III");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    break;

                case R.id.radiobuttonFeminino:

                    p = Float.parseFloat(peso);
                    a = Float.parseFloat(altura);

                    imc = p/(a*a);

                    resultado = String.format("%.2f", imc);

                    if(imc < 19){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nAbaixo do Peso");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 19 && imc <= 23.99){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nPeso Normal");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 24 && imc <= 28.99){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nExcesso de Peso");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 29 && imc <= 33.99){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nObesidade Classe I");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 34 && imc <= 38.99){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nObesidade Classe II");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    if(imc >= 39){
                        AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity4.this);

                        janela.setTitle("IMC");
                        janela.setMessage("O valor do IMC é igual a: "+ resultado + "\nObesidade Classe III");

                        janela.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        janela.show();
                    }
                    break;
            }
        }
    }

    private boolean verificado() {
        boolean retorno = true;
        if (edPeso.getText().toString().length() == 0){
            edPeso.setError("digite seu peso");
            retorno = false;
        }
        if (edAltura.getText().toString().length() == 0){
            edAltura.setError("digite sua altura");
            retorno = false;
        }
        return retorno;
    }
}