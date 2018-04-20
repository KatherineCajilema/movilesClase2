package com.example.usrgam.classe2moviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

import modelo.Persona;

public class MainActivity extends AppCompatActivity {
    EditText escribir;
    Button botonmensaje;
    Button botoncambio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonmensaje = (Button)findViewById(R.id.buttonMensaje);
      //  botoncambio = (Button)findViewById(R.id.button2);
        escribir = (EditText)findViewById(R.id.editTextEscribir);



        botonmensaje.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast mensaje = Toast.makeText(getApplicationContext() ,escribir.getText().toString(), Toast.LENGTH_LONG);
                mensaje.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                mensaje.show();
            }
        });


    }
    public void abrirpantalla2(View view){
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class); // Obtengo el activity General getApplicationContext()
        intent.putExtra("idTexto",escribir.getText().toString());
        intent.putExtra("IDpersona", (Serializable) new Persona ("kath","Cc","kathe @k.com","1754828694"));


        startActivity(intent);

    }
}