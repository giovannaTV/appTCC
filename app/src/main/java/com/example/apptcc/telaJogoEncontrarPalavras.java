package com.example.apptcc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class telaJogoEncontrarPalavras extends AppCompatActivity {

    private Button botaoVoltarTelaInicial;

    RadioGroup group1;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9,radioButton10,radioButton11,radioButton12;

    private static String [] arrayPalavras = {"Poços de Caldas", "Caldas", "Mogi das Cruzes","Machado","Muzambinho","Guaxupe"};

    //Array para guardas as palavras embaralhadas
    String [] arrayTemporarioPalavrasEmbaralhadas = new String[6];

    //Variável para guardar a 1 e 2 palavra selecionada
    String primeiraPalavra, segundaPalavra;

    //Variável para controlar os radioButtons selecionado
      int primeiroSelecionado, segundoSelecionado;

    //Variável para controlar a vez da palavra selecionada
    int cardNumber = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_encontrar_palavras);


        botaoVoltarTelaInicial = (Button) findViewById(R.id.buttonVoltarTelaInicial);

        botaoVoltarTelaInicial.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), telaJogos.class);
                startActivity(intent);
            }
        });

        //Lincando as variáveis com os radioButtons
        radioButton1 = findViewById(R.id.RadioButton1);
        radioButton2 = findViewById(R.id.RadioButton2);
        radioButton3 = findViewById(R.id.RadioButton3);
        radioButton4 = findViewById(R.id.RadioButton4);
        radioButton5 = findViewById(R.id.RadioButton5);
        radioButton6 = findViewById(R.id.RadioButton6);
        radioButton7 = findViewById(R.id.RadioButton7);
        radioButton8 = findViewById(R.id.RadioButton8);
        radioButton9 = findViewById(R.id.RadioButton9);
        radioButton10 = findViewById(R.id.RadioButton10);
        radioButton11 = findViewById(R.id.RadioButton11);
        radioButton12 = findViewById(R.id.RadioButton12);

        //Setando as tags dos radioButtons para controle de qual foi selecionado
        radioButton1.setTag("0");
        radioButton2.setTag("1");
        radioButton3.setTag("2");
        radioButton4.setTag("3");
        radioButton5.setTag("4");
        radioButton6.setTag("5");
        radioButton7.setTag("6");
        radioButton8.setTag("7");
        radioButton9.setTag("8");
        radioButton10.setTag("9");
        radioButton11.setTag("10");
        radioButton12.setTag("11");


        //Embaralhando as palavras
        Collections.shuffle(Arrays.asList(arrayPalavras));

        //Função para colocar as palavras corretas na 1 coluna de radioButtons
        carregandoAsPalavras();


        //Embaralhando novamente as palavras
        Collections.shuffle(Arrays.asList(arrayPalavras));

        //Adicionando as palavras do arrayPalavras que são embaralhadas na função embaralharAsPalavras no arrayTemporarioPalavrasEmbaralhadas
        for(int i = 0; i<6; i++) {
            arrayTemporarioPalavrasEmbaralhadas[i] = embaralharAsPalavras(arrayPalavras[i]);
        }

        //função para colocar as palavras do arrayTemporarioPalavrasEmbaralhadas nos radioButtons da segunda coluna
        carregandoAsPalavrasEmbaralhadas();

        //Função para monitorar click do RadioButton1
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
                radioButton5.setEnabled(false);
                radioButton6.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton1, theCard);
            }
        });
        //Função para monitorar click do RadioButton2
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
                radioButton5.setEnabled(false);
                radioButton6.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton2, theCard);
            }
        });
        //Função para monitorar click do RadioButton3
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton4.setEnabled(false);
                radioButton5.setEnabled(false);
                radioButton6.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton3, theCard);
            }
        });
        //Função para monitorar click do RadioButton4
        radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton5.setEnabled(false);
                radioButton6.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton4, theCard);
            }
        });
        //Função para monitorar click do RadioButton5
        radioButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
                radioButton6.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton5, theCard);
            }
        });
        //Função para monitorar click do RadioButton6
        radioButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
                radioButton5.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton6,theCard);
            }
        });
        //Função para monitorar click do RadioButton7
        radioButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton8.setEnabled(false);
                radioButton9.setEnabled(false);
                radioButton10.setEnabled(false);
                radioButton11.setEnabled(false);
                radioButton12.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton7,theCard);
            }
        });
        //Função para monitorar click do RadioButton8
        radioButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton7.setEnabled(false);
                radioButton9.setEnabled(false);
                radioButton10.setEnabled(false);
                radioButton11.setEnabled(false);
                radioButton12.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton8, theCard);
            }
        });
        //Função para monitorar click do RadioButton9
        radioButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton7.setEnabled(false);
                radioButton8.setEnabled(false);
                radioButton10.setEnabled(false);
                radioButton11.setEnabled(false);
                radioButton12.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton9,theCard);
            }
        });
        //Função para monitorar click do RadioButton10
        radioButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton7.setEnabled(false);
                radioButton8.setEnabled(false);
                radioButton9.setEnabled(false);
                radioButton11.setEnabled(false);
                radioButton12.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton10, theCard);
            }
        });
        //Função para monitorar click do RadioButton11
        radioButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton7.setEnabled(false);
                radioButton8.setEnabled(false);
                radioButton9.setEnabled(false);
                radioButton10.setEnabled(false);
                radioButton12.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton11, theCard);
            }
        });
        //Função para monitorar click do RadioButton12
        radioButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton7.setEnabled(false);
                radioButton8.setEnabled(false);
                radioButton9.setEnabled(false);
                radioButton10.setEnabled(false);
                radioButton11.setEnabled(false);
                int theCard = Integer.parseInt((String) view.getTag());
                guardarPalarasSelecionadas(radioButton12, theCard);
            }
        });
    }
    private void guardarPalarasSelecionadas(RadioButton rButton, int card) {
        //checando qual palavra foi selecionada e salvando em variável temporária
        if (cardNumber == 1) {
            primeiraPalavra = rButton.getText().toString().toLowerCase().replace(" ","");
            cardNumber = 2;
            primeiroSelecionado = card;
            rButton.setEnabled(false);
        } else if (cardNumber == 2) {
            segundaPalavra = rButton.getText().toString().toLowerCase().replace(" ","");
            cardNumber = 1;
            segundoSelecionado = card;

            //Desabilita todos os Buttons para comparar as palavras
            radioButton1.setEnabled(false);
            radioButton2.setEnabled(false);
            radioButton3.setEnabled(false);
            radioButton4.setEnabled(false);
            radioButton5.setEnabled(false);
            radioButton6.setEnabled(false);
            radioButton7.setEnabled(false);
            radioButton8.setEnabled(false);
            radioButton9.setEnabled(false);
            radioButton10.setEnabled(false);
            radioButton11.setEnabled(false);
            radioButton11.setEnabled(false);

            Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //checando se as palavras selecionadas são correspondentes
                    calculate(primeiraPalavra,segundaPalavra);
                }
            }, 100);
        }
    }

    private void calculate(String palavra1,String palavra2) {
        //se as palavras são iguais, remova elas
        boolean igual = compararPalavras(palavra1,palavra2);
        if(igual == true) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(telaJogoEncontrarPalavras.this);
                alertDialogBuilder
                        .setMessage("PARABÉNS! VOCÊ ENCONTROU UM PAR DE PALAVRAS!")
                        .setCancelable(false);
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //checando se as palavras selecionadas são correspondentes
                        if(alertDialog.isShowing())
                        {
                            alertDialog.dismiss();
                        }
                    }
                }, 7000);
                if(primeiroSelecionado == 0){
                    radioButton1.setVisibility(View.INVISIBLE);
                    if(segundoSelecionado == 6){
                        radioButton7.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 7){
                        radioButton8.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 8){
                        radioButton9.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 9){
                        radioButton10.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 10){
                        radioButton11.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 11){
                        radioButton12.setVisibility(View.INVISIBLE);
                    }
                }
                if(primeiroSelecionado == 1){
                    radioButton2.setVisibility(View.INVISIBLE);
                    if(segundoSelecionado == 6){
                        radioButton7.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 7){
                        radioButton8.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 8){
                        radioButton9.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 9){
                        radioButton10.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 10){
                        radioButton11.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 11){
                        radioButton12.setVisibility(View.INVISIBLE);
                    }
                }
                if(primeiroSelecionado == 2){
                    radioButton3.setVisibility(View.INVISIBLE);
                    if(segundoSelecionado == 6){
                        radioButton7.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 7){
                        radioButton8.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 8){
                        radioButton9.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 9){
                        radioButton10.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 10){
                        radioButton11.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 11){
                        radioButton12.setVisibility(View.INVISIBLE);
                    }
                }
                if(primeiroSelecionado == 3){
                    radioButton4.setVisibility(View.INVISIBLE);
                    if(segundoSelecionado == 6){
                        radioButton7.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 7){
                        radioButton8.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 8){
                        radioButton9.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 9){
                        radioButton10.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 10){
                        radioButton11.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 11){
                        radioButton12.setVisibility(View.INVISIBLE);
                    }
                }
                if(primeiroSelecionado == 4){
                    radioButton5.setVisibility(View.INVISIBLE);
                    if(segundoSelecionado == 6){
                        radioButton7.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 7){
                        radioButton8.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 8){
                        radioButton9.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 9){
                        radioButton10.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 10){
                        radioButton11.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 11){
                        radioButton12.setVisibility(View.INVISIBLE);
                    }
                }
                if(primeiroSelecionado == 5){
                    radioButton6.setVisibility(View.INVISIBLE);
                    if(segundoSelecionado == 6){
                        radioButton7.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 7){
                        radioButton8.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 8){
                        radioButton9.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 9){
                        radioButton10.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 10){
                        radioButton11.setVisibility(View.INVISIBLE);
                    }
                    if(segundoSelecionado == 11){
                        radioButton12.setVisibility(View.INVISIBLE);
                    }
                }
            if(primeiroSelecionado == 6){
                radioButton7.setVisibility(View.INVISIBLE);
                if(segundoSelecionado == 0){
                    radioButton1.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 1){
                    radioButton2.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 2){
                    radioButton3.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 3){
                    radioButton4.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 4){
                    radioButton5.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 5){
                    radioButton6.setVisibility(View.INVISIBLE);
                }
            }
            if(primeiroSelecionado == 7){
                radioButton8.setVisibility(View.INVISIBLE);
                if(segundoSelecionado == 0){
                    radioButton1.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 1){
                    radioButton2.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 2){
                    radioButton3.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 3){
                    radioButton4.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 4){
                    radioButton5.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 5){
                    radioButton6.setVisibility(View.INVISIBLE);
                }
            } if(primeiroSelecionado == 8){
                radioButton9.setVisibility(View.INVISIBLE);
                if(segundoSelecionado == 0){
                    radioButton1.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 1){
                    radioButton2.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 2){
                    radioButton3.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 3){
                    radioButton4.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 4){
                    radioButton5.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 5){
                    radioButton6.setVisibility(View.INVISIBLE);
                }
            } if(primeiroSelecionado == 9){
                radioButton10.setVisibility(View.INVISIBLE);
                if(segundoSelecionado == 0){
                    radioButton1.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 1){
                    radioButton2.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 2){
                    radioButton3.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 3){
                    radioButton4.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 4){
                    radioButton5.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 5){
                    radioButton6.setVisibility(View.INVISIBLE);
                }
            }
            if(primeiroSelecionado == 10){
                radioButton11.setVisibility(View.INVISIBLE);
                if(segundoSelecionado == 0){
                    radioButton1.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 1){
                    radioButton2.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 2){
                    radioButton3.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 3){
                    radioButton4.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 4){
                    radioButton5.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 5){
                    radioButton6.setVisibility(View.INVISIBLE);
                }
            }
            if(primeiroSelecionado == 11){
                radioButton12.setVisibility(View.INVISIBLE);
                if(segundoSelecionado == 0){
                    radioButton1.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 1){
                    radioButton2.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 2){
                    radioButton3.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 3){
                    radioButton4.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 4){
                    radioButton5.setVisibility(View.INVISIBLE);
                }
                if(segundoSelecionado == 5){
                    radioButton6.setVisibility(View.INVISIBLE);
                }
            }
        }else{
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(telaJogoEncontrarPalavras.this);
                alertDialogBuilder
                        .setMessage("NÃO FOI DESSA VEZ! MAS VOCÊ ESTÁ INDO MUITO BEM, CONTINUE TENTANDO!")
                        .setCancelable(false);
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                Handler handler = new Handler();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //checando se as palavras selecionadas são correspondentes
                        if(alertDialog.isShowing())
                        {
                            alertDialog.dismiss();
                        }
                    }
                }, 7000);
                radioButton1.setChecked(false);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                radioButton4.setChecked(false);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                radioButton7.setChecked(false);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                radioButton10.setChecked(false);
                radioButton11.setChecked(false);
                radioButton12.setChecked(false);
            }
        radioButton1.setEnabled(true);
        radioButton2.setEnabled(true);
        radioButton3.setEnabled(true);
        radioButton4.setEnabled(true);
        radioButton5.setEnabled(true);
        radioButton6.setEnabled(true);
        radioButton7.setEnabled(true);
        radioButton8.setEnabled(true);
        radioButton9.setEnabled(true);
        radioButton10.setEnabled(true);
        radioButton11.setEnabled(true);
        radioButton12.setEnabled(true);
        //função para verificar se o jogo acabou
        checkEnd();
    }

    private void checkEnd(){
        if(radioButton1.getVisibility() == View.INVISIBLE &&
                radioButton2.getVisibility() == View.INVISIBLE &&
                radioButton3.getVisibility() == View.INVISIBLE &&
                radioButton4.getVisibility() == View.INVISIBLE &&
                radioButton5.getVisibility() == View.INVISIBLE &&
                radioButton6.getVisibility() == View.INVISIBLE &&
                radioButton7.getVisibility() == View.INVISIBLE &&
                radioButton8.getVisibility() == View.INVISIBLE &&
                radioButton9.getVisibility() == View.INVISIBLE &&
                radioButton10.getVisibility() == View.INVISIBLE &&
                radioButton11.getVisibility() == View.INVISIBLE &&
                radioButton12.getVisibility() == View.INVISIBLE){


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(telaJogoEncontrarPalavras.this);
            alertDialogBuilder
                    .setMessage("PARABÉNS! VOCÊ ENCONTROU TODOS OS PARES DE PALAVRAS! O JOGO TERMINOU.")
                    .setCancelable(false)
                    .setPositiveButton("JOGAR NOVAMENTE", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), telaJogoEncontrarPalavras.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("VOLTAR PARA MENU DE JOGOS", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

            Button buttonbackground = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE);
            buttonbackground.setTextColor(Color.BLACK);
            buttonbackground.setBackgroundColor(Color.WHITE);

            Button buttonbackground1 = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
            buttonbackground1.setTextColor(Color.BLACK);
            buttonbackground1.setBackgroundColor(Color.WHITE);
        }
    }

    private void carregandoAsPalavras(){
        radioButton1.setText(arrayPalavras[0]);
        radioButton2.setText(arrayPalavras[1]);
        radioButton3.setText(arrayPalavras[2]);
        radioButton4.setText(arrayPalavras[3]);
        radioButton5.setText(arrayPalavras[4]);
        radioButton6.setText(arrayPalavras[5]);
    }

    public static String embaralharAsPalavras(String s) {
        List<String> letters = Arrays.asList(s.split(""));
        Collections.shuffle(letters);
        StringBuilder t = new StringBuilder(s.length());
        for (String k : letters) {
            t.append(k);
        }
        return t.toString().toLowerCase().replace(" ","");
    }

    private void carregandoAsPalavrasEmbaralhadas(){
        radioButton7.setText(arrayTemporarioPalavrasEmbaralhadas[0]);
        radioButton8.setText(arrayTemporarioPalavrasEmbaralhadas[1]);
        radioButton9.setText(arrayTemporarioPalavrasEmbaralhadas[2]);
        radioButton10.setText(arrayTemporarioPalavrasEmbaralhadas[3]);
        radioButton11.setText(arrayTemporarioPalavrasEmbaralhadas[4]);
        radioButton12.setText(arrayTemporarioPalavrasEmbaralhadas[5]);
    }

    private boolean compararPalavras(String p1, String p2){
        boolean result = false;
        int valor1 = 0;
        int valor2 = 0;
        if(p1.length() != p2.length())
        {
            return result;
        }else{
            for(int i = 0; i < p1.length(); i++) {
                valor1 += p1.charAt(i);
                valor2 +=p2.charAt(i);
            }
            result = (valor1 == valor2);
        }
        return result;
    }
}
