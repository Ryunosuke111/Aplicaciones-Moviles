package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button bt1;
    EditText usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.btn1);
        usuario = findViewById(R.id.usuario);

        bt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(this,"oli", Toast.LENGTH_SHORT);
                Intent enviar = new Intent(this, Main2Activity.class);
                enviar.addFlags(enviar.FLAG_ACTIVITY_CLEAR_TASK | enviar.FLAG_ACTIVITY_CLEAR_TOP);
                Bundle datos = new Bundle();
                datos.putString("usuario",usuario.getText().toString());
                enviar.putExtras(datos);
                startActivity(enviar);
                break;
        }
    }
}
