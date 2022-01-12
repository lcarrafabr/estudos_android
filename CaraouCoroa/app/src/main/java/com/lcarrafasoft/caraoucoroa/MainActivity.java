package com.lcarrafasoft.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //Passar dados para proxima tela apenas para praticar a passagem de dados entre telas
                //O melhor seria fzer isso na outra tela mesmo.

                int numero = new Random().nextInt(2); //0 1

                intent.putExtra("numero", numero);

                startActivity(intent);

            }
        });
    }
}
