package com.example.usrgam.classe2moviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;

import modelo.Persona;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView texthola;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //texthola = (TextView) findViewById(R.id.textViewHola);

        Toast mensaje= Toast.makeText(getApplicationContext(),getIntent().getExtras().getString("idTexto"),Toast.LENGTH_LONG);
        mensaje.show();

        //texthola.setText(getIntent().getExtras().getString("idTexto"));

        Persona persona = (Persona)getIntent().getExtras().getSerializable("IDpersona");
        ((TextView)findViewById(R.id.nombre)).setText(persona.getNombre());
        ((TextView)findViewById(R.id.apellido)).setText(persona.getApellido());
        ((TextView)findViewById(R.id.correo)).setText(persona.getCorreo());
        ((TextView)findViewById(R.id.cedula)).setText(persona.getCedula());
    }

}