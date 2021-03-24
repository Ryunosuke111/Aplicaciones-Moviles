package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    Button volver, bt5;
    TextView recibir;
    CheckBox ch1, ch2, ch3, ch4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        volver = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        recibir = findViewById(R.id.recibir);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);

        Bundle datosRecibidos = getIntent().getExtras();
        String dato = datosRecibidos.getString("usuario").toString();
        recibir.setText(dato);
    }


    public void enviar(View view){
        Intent enviar = new Intent(this, Main3Activity.class);
        enviar.addFlags(enviar.FLAG_ACTIVITY_CLEAR_TASK | enviar.FLAG_ACTIVITY_CLEAR_TOP);
        Bundle datos = new Bundle();
        String mensajes = "seleccionado: \n";
        if(ch1.isChecked() == true){
            mensajes+="Football \n";

        }
        if(ch2.isChecked() == true){
            mensajes+="Basketball \n";
        }
        if(ch3.isChecked() == true){
            mensajes+="Natacion \n";
        }
        if(ch4.isChecked() == true){
            mensajes+="Vouleyball \n";
        }
        Toast.makeText(getApplicationContext(),mensajes,Toast.LENGTH_SHORT).show();

        datos.putString("mensajes",mensajes);
        enviar.putExtras(datos);
        startActivity(enviar);

    }
    public void  volver(View v){
        Intent ir = new Intent(this,MainActivity.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(ir);
    }
}
