package com.example.apptcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaJogoAdivinharPalavras extends AppCompatActivity {

    private Button botaoVoltarTelaInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_adivinhar_palavras);


        botaoVoltarTelaInicial = (Button) findViewById(R.id.buttonVoltarTelaInicial);

        botaoVoltarTelaInicial.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}