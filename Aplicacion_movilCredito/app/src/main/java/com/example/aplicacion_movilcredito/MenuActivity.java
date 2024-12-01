package com.example.aplicacion_movilcredito;

import com.example.appcredito.R;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnVolverConsultarCompras = findViewById(R.id.btnVolverConsultarCompras);
        Button btnVolverPagos = findViewById(R.id.btnVolverPagos);
        Button btnVolverlogin = findViewById(R.id.btnVolverlogin);
        Button btnCredito = findViewById(R.id.btnCredito);
        Button btnSolicitar = findViewById(R.id.btnSolicitar);

        // Lógica para cerrar sesión
        btnVolverlogin.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, loginActivity.class);
            startActivity(intent);
            finish();
        });

        btnVolverConsultarCompras.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, ConsultaComprasActivity.class);
            startActivity(intent);
        });

        btnVolverPagos.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, PagarActivity.class);
            startActivity(intent);
        });

        btnCredito.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, ConsultaCreditosActivity.class);
            startActivity(intent);
        });

        btnSolicitar.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, AumentoCreditoActivity.class);
            startActivity(intent);
        });
    }
}
