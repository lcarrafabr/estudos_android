package com.lcarrafasoft.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //Recuperar Dados
        Bundle dados = getIntent().getExtras();

        int numero = dados.getInt("numero");

        caraOuCoroa(numero);


        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }


    public void caraOuCoroa(int numero) {

        if(numero == 0) {//Cara

            imageResultado.setImageResource(R.drawable.moeda_cara);
        }else {//Coroa

            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }
    }
}
