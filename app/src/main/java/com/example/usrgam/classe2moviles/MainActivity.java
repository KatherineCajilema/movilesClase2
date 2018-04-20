package com.example.usrgam.classe2moviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;

import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;

import modelo.Persona;

public class MainActivity extends AppCompatActivity {
    EditText escribir;
    ListView lista;
    //lista daptador datos
    ArrayAdapter<Persona>adapter;
    Persona [] datos;
    Button botonmensaje;
    //Button botoncambio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonmensaje = (Button)findViewById(R.id.buttonMensaje);
      //  botoncambio = (Button)findViewById(R.id.button2);
        escribir = (EditText)findViewById(R.id.editTextEscribir);

        lista = (ListView) findViewById(R.id.listaP);
        cargarlista();
        adapter= new ArrayAdapter<Persona>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,datos);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Toast.makeText(getApplicationContext(),datos[i].toString(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class); // Obtengo el activity General getApplicationContext()
                intent.putExtra("idTexto",escribir.getText().toString());
                intent.putExtra("IDpersona", (Serializable) datos[i]);
                //intent.putExtra()

                startActivity(intent);
            }
        });


        botonmensaje.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast mensaje = Toast.makeText(getApplicationContext() ,escribir.getText().toString(), Toast.LENGTH_LONG);
                mensaje.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                mensaje.show();
            }
        });


    }

    private void cargarlista(){
       // datos=new Persona[]{"dato1","dato2","dato3","dato3","dato4","dato5","dato6","dato7","dato8","dato9","dato10"};
        datos=  new Persona[]{new Persona ("kath","Cc","kathe @k.com","1754828694"),
                new Persona ("kath1","Cc","kathe @k.com","1754828694"),
                new Persona ("kath2","Cc","kathe @k.com","1754828694"),
                new Persona ("kath3","Cc","kathe @k.com","1754828694")};
    }
    public void abrirpantalla2(View view){
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class); // Obtengo el activity General getApplicationContext()
        intent.putExtra("idTexto",escribir.getText().toString());
        intent.putExtra("IDpersona", (Serializable) new Persona ("kath","Cc","kathe @k.com","1754828694"));
    //intent.putExtra()

        startActivity(intent);

    }
}