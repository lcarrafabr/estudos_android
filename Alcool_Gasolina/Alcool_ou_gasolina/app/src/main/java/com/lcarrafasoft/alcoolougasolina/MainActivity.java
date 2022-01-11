package com.lcarrafasoft.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool;
    private TextInputEditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view) {

        String precoAlcool = editPrecoAlcool.getText().toString().replaceAll(",",".");
        String precoGasolina = editPrecoGasolina.getText().toString().replaceAll(",",".");
        String msg = "";

        String retorno = validarCampos(precoAlcool, precoGasolina);

        if(retorno.equals("OK")) {

            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            /**Faze o calculo de menor preço
             * Se (valor alcool / valor gasolina) >= 0.7*/

            Double resultado = (valorAlcool / valorGasolina);

            if(resultado >= 0.7) {

                msg = "Melhor usar GASOLINA";
            } else {
                msg = "Melhor usar ÁLCOOL";
            }

            textResultado.setText(msg);


        } else {

            textResultado.setText(retorno);
        }

    }


    public String validarCampos(String alcool, String gasolina) {

        Boolean validarCampos = true;
        String msg = "OK";

        if(alcool == null || alcool.equals("")) {
            validarCampos = false;
            msg = "O campo Álcool é obrigatório!";
        }
        if(gasolina == null || gasolina.equals("")) {
            validarCampos = false;
            msg = "O campo Gasolina é obrigatório!";
        }

        return  msg;
    }
}
