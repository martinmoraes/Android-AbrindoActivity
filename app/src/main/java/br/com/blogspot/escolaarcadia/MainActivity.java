package br.com.blogspot.escolaarcadia;

/*
prof. Martin Morães
http://lattes.cnpq.br/2746554350570335
http://escolaarcadia.blogspot.com.br/
https://github.com/martinmoraes

Este código está disponível em: https://github.com/martinmoraes/Android-AbrindoActivity

Até a release 2 o enfoque é a abertura de activity. Apartir da release 2 o enfoque é passagem de parâmetros entre as activity.
 */


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.escolaarcadia.android_abrindoactivity.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirSegundaActivity(View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("menssagem", getString(R.string.segunda));
        intent.putExtra("data", "20/set/1900");
        startActivity(intent);

    }

    public void abrirNavegador(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.br"));
        startActivity(intent);
    }
}
