package com.example.a26148269.aula02;

import android.content.DialogInterface;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextInputEditText mEdit1;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Create", Toast.LENGTH_LONG).show();

        mEdit1 = findViewById(R.id.idValor);
        resultado = findViewById(R.id.idResultado);

    }



    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Resume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Destroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Pause", Toast.LENGTH_LONG).show();
    }

    public void btCalcular(View view) {

        double myNum1 = Double.parseDouble(mEdit1.getText().toString());
        double res;
        res = (myNum1*0.1);

        resultado.setText("O valor da conta é: " +String.valueOf(res));



    }

    public void calcularValor(View v) {


    }
}
