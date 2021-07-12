package com.example.apptcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaJogos extends AppCompatActivity {

    private Button botaoIrParaTelaJogoDaMemoria;
    private Button botaoIrParaTelaJogoAdivinharPalavras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogos);

        botaoIrParaTelaJogoDaMemoria = (Button) findViewById(R.id.buttonJogoMemoria);
        botaoIrParaTelaJogoAdivinharPalavras = (Button) findViewById(R.id.buttonJogoAdivinharPalavras);

        botaoIrParaTelaJogoDaMemoria.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), telaJogoDaMemoria.class);
                startActivity(intent);
            }
        });

        botaoIrParaTelaJogoAdivinharPalavras.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), telaJogoAdivinharPalavras.class);
                startActivity(intent);
            }
        });
    }
}