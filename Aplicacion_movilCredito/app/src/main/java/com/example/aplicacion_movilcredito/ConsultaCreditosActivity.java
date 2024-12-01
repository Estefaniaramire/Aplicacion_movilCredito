package com.example.aplicacion_movilcredito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.appcredito.R;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ConsultaCreditosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultacreditos_);

        // Inicializar los botones
        Button btnMenu = findViewById(R.id.btnMenu);

        // Configurar acción para el botón "Volver al Menú"
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cerrar la actividad actual y volver a la anterior
                finish();
            }
        });


    }
}
