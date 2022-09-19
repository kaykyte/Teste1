package com.example.teste1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.EditText;
        import android.widget.RadioGroup;
        import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity{

    private EditText ed1, ed2;
    private RadioGroup rd1;
    private TextView tv1;
    private double n1, n2, res = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ed1 = findViewById(R.id.editTextPeso);
        ed2 = findViewById(R.id.editTextAltura);
        rd1 = findViewById(R.id.radioGrupo);
        tv1 = findViewById(R.id.textViewImc);

        rd1.setOnCheckedChangeListener(ouvinte);
    }

    RadioGroup.OnCheckedChangeListener ouvinte = new RadioGroup.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (verificado()){
                n1 = Double.parseDouble(ed1.getText().toString());
                n2 = Double.parseDouble(ed2.getText().toString());

                switch (i){
                    case R.id.radiobuttonSomar:
                        res = n1 + n2;
                        break;
                    case R.id.radiobuttonSubtrair:
                        res = n1 - n2;
                        break;
                    case R.id.radiobuttonMultiplicar:
                        res = n1 * n2;
                        break;
                    case R.id.radiobuttonDividir:
                        res = n1 / n2;
                        break;
                }
                tv1.setText("O resultado e: " + String.format("%.2f", res));
            }
        }
    };

    private boolean verificado() {
        boolean retorno = true;
        if (ed1.getText().toString().length() == 0){
            ed1.setError("digite um numero");
            retorno = false;
        }
        if (ed2.getText().toString().length() == 0){
            ed2.setError("digite um numero");
            retorno = false;
        }
        return retorno;
    }


}