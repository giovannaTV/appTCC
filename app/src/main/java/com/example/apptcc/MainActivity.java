package com.example.apptcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoIrParaTelaJogos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoIrParaTelaJogos = (Button) findViewById(R.id.buttonVoltarTelaInicial);

        botaoIrParaTelaJogos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), telaJogos.class);
                startActivity(intent);
            }
        });
    }
}