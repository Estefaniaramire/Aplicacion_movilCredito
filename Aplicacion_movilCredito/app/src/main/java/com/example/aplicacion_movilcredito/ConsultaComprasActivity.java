package com.example.aplicacion_movilcredito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.appcredito.R;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ConsultaComprasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultacompras_);

        // Inicializar los botones
        Button btnMenu = findViewById(R.id.btnMenu);
        Button btnCarrito = findViewById(R.id.btnConfirmar);

        // Configurar acción para el botón "Volver al Menú"
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cerrar la actividad actual y volver a la anterior
                finish();
            }
        });

        // Configurar acción para el botón "Confirmar"
        btnCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mostrar un mensaje de confirmación
                Toast.makeText(ConsultaComprasActivity.this, "Historial de compras actualizada", Toast.LENGTH_SHORT).show();
            }
        });
    }
}