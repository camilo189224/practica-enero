package com.example.turistiando;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    //atributos
    MediaPlayer cancion;


    //metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //oculte el action bar
        ActionBar barra = getSupportActionBar();
        barra.hide();

        //Lanzar la cancion
        cancion = MediaPlayer.create(this,R.raw.audio);
        cancion.start();


        //Temporizar la durecion del splash
        TimerTask inicioapp = new TimerTask() {
            @Override
            public void run() {

                //Lanzar una nueva actividad
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioapp,10000);
    }
}