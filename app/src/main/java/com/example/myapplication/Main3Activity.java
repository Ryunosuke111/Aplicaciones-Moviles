package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {
    TextView recibir;
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recibir = findViewById(R.id.recibir);
        volver = findViewById(R.id.bt6);

        Bundle datosRecibidos = getIntent().getExtras();
        String dato = datosRecibidos.getString("mensajes").toString();
        recibir.setText(dato);
    }
    public void  volver1(View v){
        Intent ir = new Intent(this,Main2Activity.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TASK | ir.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(ir);
    }

}
