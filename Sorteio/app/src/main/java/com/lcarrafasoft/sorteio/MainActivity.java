package com.lcarrafasoft.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {

        String msg = "O número sorteado foi: ";

        TextView numeroSorteado = findViewById(R.id.textNumeroSorteado);

        int numero = new Random().nextInt(101);

        numeroSorteado.setText(msg + numero);

    }
}
