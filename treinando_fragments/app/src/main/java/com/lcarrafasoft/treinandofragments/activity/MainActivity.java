package com.lcarrafasoft.treinandofragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lcarrafasoft.treinandofragments.R;
import com.lcarrafasoft.treinandofragments.fragment.ContatosFragment;
import com.lcarrafasoft.treinandofragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversa;
    private Button buttonContato;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.buttonContato);
        buttonConversa = findViewById(R.id.buttonConversa);

        //Remover sombra da ActionBar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        //Configura o objeto para o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();

       buttonContato.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               contatosFragment = new ContatosFragment();

               FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
               transaction.replace(R.id.frameConteudo, contatosFragment);
               transaction.commit();
           }
       });

       buttonConversa.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               conversasFragment = new ConversasFragment();

               FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
               transaction.replace(R.id.frameConteudo, conversasFragment);
               transaction.commit();

           }
       });

    }
}
