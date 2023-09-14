package com.felipe.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = (Button)findViewById(R.id.btnIngresar);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Funcionalidad aun no desarrollada",Toast.LENGTH_LONG).show();
            }
        });

        Toast.makeText(getApplicationContext(),"!Bienvenido¡",Toast.LENGTH_LONG).show();
    }

    public void registroOnClick(View v){
        Intent form = new Intent(MainActivity.this,Formulario.class);
        startActivity(form);
    }
    public void AdvertenciaOnClick(View v){
        Intent adv = new Intent(MainActivity.this, Sobremi.class);
        startActivity(adv);
    }


}