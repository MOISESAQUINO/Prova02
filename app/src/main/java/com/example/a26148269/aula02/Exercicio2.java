package com.example.a26148269.aula02;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Exercicio2 extends AppCompatActivity {

    TextInputEditText raio,altura;
    TextView resultado;
    double volume = 3.141559;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2);

        raio = findViewById(R.id.idRaio);
        altura = findViewById(R.id.idAltura);

        resultado = findViewById(R.id.idResultado);




    }

    public void calcularArea(View view) {

        double valorRaio = Double.parseDouble(raio.getText().toString());
        double valorAltura = Double.parseDouble(altura.getText().toString());
        double res;
        res = volume * (valorRaio*valorRaio) * valorAltura;

        resultado.setText("O Volume da lata é: " +String.valueOf(res));


    }
}
