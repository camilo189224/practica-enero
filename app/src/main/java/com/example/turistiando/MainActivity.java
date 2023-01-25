package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Atributos


    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //cargar el menu xml creado prviamente
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return  true;

    }

    //Dar funcionamiento al menu



    public boolean onOptionsItemSelected(MenuItem item) {


        //observamos a que item del menu le damos click
        int itemSelecconado=item.getItemId();

        switch (itemSelecconado){

            case (R.id.opcion1):
                Toast.makeText(this, "seleccionaste opcion1", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion2):
                Toast.makeText(this, "seleccionaste opcion2", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion3):
                Toast.makeText(this, "seleccionaste opcion3", Toast.LENGTH_SHORT).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}