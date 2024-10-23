// pacote que organiza as classes relacionadas ao projeto
package com.example.myapplication;
//Importa a classe AppCompatActivity, que é uma subclasse de Activity e oferece compatibilidade
//com versões mais antigas do Android
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//Importa a classe Bundle, que permite passar dados entre atividades ou salvar o estado da atividade
//quando ela é interrompida (ex: rotação de tela).


//Declaração da classe MainActivity, que pe a classe principal do aplicativo
//Essa classe herda (extends) de AppCompatActivity para garantir a compatibilidade
//com versões mais antigas do Android e para ter acesso a funcionalidades modernas
public class MainActivity extends AppCompatActivity {

    //Método onCreate, chamado quando a atividade é criada
    //É o ponto de entrada da atividade e onde voce define o Layout e inicializa componentes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Chama o método da superclasse (AppCompatActivity) para garantir que o comportamento
        //padrão seja executado antes de adiconar funcionalidade  personalizadas
        super.onCreate(savedInstanceState);

        //Define o Layout da interface do usuário (UI) da atividade
        //O layout é definido no arquivo XML (activity_main.xml) dentro da pasta res/Layout
        setContentView(R.layout.activity_main);
        }
    }