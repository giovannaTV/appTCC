package com.example.apptcc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class telaJogoDaMemoria extends AppCompatActivity {

    private Button botaoVoltarTelaInicial2;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_15, iv_16, iv_17, iv_18, iv_19, iv_20, iv_21, iv_22;

    //Array para as imagens
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    //imagens atuais
    int image101, image102, image103, image104, image105, image106, image201, image202, image203, image204, image205, image206;

    //Variável para 1 card e 2 card selecionado
    int firstCard, secondCard;

    //Variável para controlar primeira e segunda imagem seleciona
    int clickedFirst, clickedSecond;

    int cardNumber = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_da_memoria);


        botaoVoltarTelaInicial2 = (Button) findViewById(R.id.buttonVoltarTelaInicial2);

        botaoVoltarTelaInicial2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        iv_11 = findViewById(R.id.iv_11);
        iv_12 = findViewById(R.id.iv_12);
        iv_13 = findViewById(R.id.iv_13);
        iv_14 = findViewById(R.id.iv_14);
        iv_15 = findViewById(R.id.iv_15);
        iv_16 = findViewById(R.id.iv_16);
        iv_17 = findViewById(R.id.iv_17);
        iv_18 = findViewById(R.id.iv_18);
        iv_19 = findViewById(R.id.iv_19);
        iv_20 = findViewById(R.id.iv_20);
        iv_21 = findViewById(R.id.iv_21);
        iv_22 = findViewById(R.id.iv_22);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_15.setTag("4");
        iv_16.setTag("5");
        iv_17.setTag("6");
        iv_18.setTag("7");
        iv_19.setTag("8");
        iv_20.setTag("9");
        iv_21.setTag("10");
        iv_22.setTag("11");

        //Carregando as imagens
        frontOfCardsResources();

        //Embaralhando as imagens
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);

            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, theCard);
            }
        });
        iv_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_15, theCard);
            }
        });
        iv_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_16, theCard);
            }
        });
        iv_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_17, theCard);
            }
        });
        iv_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_18, theCard);
            }
        });
        iv_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_19, theCard);
            }
        });
        iv_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_20, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, theCard);
            }
        });
    }

    private void doStuff(ImageView iv, int card) {
        //setando as imagens no ImageView
        if (cardsArray[card] == 101) {
            iv.setImageResource(image101);
        } else if (cardsArray[card] == 102) {
            iv.setImageResource(image102);
        } else if (cardsArray[card] == 103) {
            iv.setImageResource(image103);
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(image104);
        } else if (cardsArray[card] == 105) {
            iv.setImageResource(image105);
        } else if (cardsArray[card] == 106) {
            iv.setImageResource(image106);
        } else if (cardsArray[card] == 201) {
            iv.setImageResource(image201);
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(image202);
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(image203);
        } else if (cardsArray[card] == 204) {
            iv.setImageResource(image204);
        } else if (cardsArray[card] == 205) {
            iv.setImageResource(image205);
        } else if (cardsArray[card] == 206) {
            iv.setImageResource(image206);
        }
        //checando qual imagem foi selecionada e salvando em variável temporária
        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;
            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_15.setEnabled(false);
            iv_16.setEnabled(false);
            iv_17.setEnabled(false);
            iv_18.setEnabled(false);
            iv_19.setEnabled(false);
            iv_20.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);

            Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //checando se as imagens selecionadas são iguais
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate() {
        //se as imagens são iguais, remova elas e apresente uma mensagem de estímulo
        if(firstCard == secondCard){
            if(clickedFirst == 0){
                iv_11.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 1){
                iv_12.setVisibility(View.INVISIBLE);
            } else  if(clickedFirst == 2){
                iv_13.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 3){
                iv_14.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 4){
                iv_15.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 5){
                iv_16.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 6){
                iv_17.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 7){
                iv_18.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 8){
                iv_19.setVisibility(View.INVISIBLE);
            } else  if(clickedFirst == 9){
                iv_20.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 10){
                iv_21.setVisibility(View.INVISIBLE);
            } else  if(clickedFirst == 11){
                iv_22.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond == 0){
                iv_11.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 1){
                iv_12.setVisibility(View.INVISIBLE);
            } else  if(clickedSecond == 2){
                iv_13.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 3){
                iv_14.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 4){
                iv_15.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 5){
                iv_16.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 6){
                iv_17.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 7){
                iv_18.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 8){
                iv_19.setVisibility(View.INVISIBLE);
            } else  if(clickedSecond == 9){
                iv_20.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 10){
                iv_21.setVisibility(View.INVISIBLE);
            } else  if(clickedSecond == 11){
                iv_22.setVisibility(View.INVISIBLE);
            }
            //Toast toast = Toast.makeText(contexto, texto,duracao);
            //toast.show();
        } else {
            iv_11.setImageResource(R.drawable.ic_back);
            iv_12.setImageResource(R.drawable.ic_back);
            iv_13.setImageResource(R.drawable.ic_back);
            iv_14.setImageResource(R.drawable.ic_back);
            iv_15.setImageResource(R.drawable.ic_back);
            iv_16.setImageResource(R.drawable.ic_back);
            iv_17.setImageResource(R.drawable.ic_back);
            iv_18.setImageResource(R.drawable.ic_back);
            iv_19.setImageResource(R.drawable.ic_back);
            iv_20.setImageResource(R.drawable.ic_back);
            iv_21.setImageResource(R.drawable.ic_back);
            iv_22.setImageResource(R.drawable.ic_back);
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_15.setEnabled(true);
        iv_16.setEnabled(true);
        iv_17.setEnabled(true);
        iv_18.setEnabled(true);
        iv_19.setEnabled(true);
        iv_20.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);

        //função para verificar se o jogo acabou
        checkEnd();
    }

    private void checkEnd(){
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_15.getVisibility() == View.INVISIBLE &&
                iv_16.getVisibility() == View.INVISIBLE &&
                iv_17.getVisibility() == View.INVISIBLE &&
                iv_18.getVisibility() == View.INVISIBLE &&
                iv_19.getVisibility() == View.INVISIBLE &&
                iv_20.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(telaJogoDaMemoria.this);
            alertDialogBuilder
                    .setMessage("PARABÉNS! VOCÊ ENCONTROU TODOS OS PARES! O JOGO TERMINOU. ")
                    .setCancelable(false)
                    .setPositiveButton("JOGAR NOVAMENTE", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), telaJogoDaMemoria.class);
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
        }
    }

    private void frontOfCardsResources() {
        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_image205;
        image206 = R.drawable.ic_image206;
    }
}
