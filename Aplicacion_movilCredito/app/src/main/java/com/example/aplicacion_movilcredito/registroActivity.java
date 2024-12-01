package com.example.aplicacion_movilcredito;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.example.appcredito.R;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class registroActivity extends AppCompatActivity {
    EditText etUsernameRegister, etPasswordRegister;
    Button btnRegister, btnRegister2; // Declara ambos botones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_);

        // Inicializa los EditText y botones
        etUsernameRegister = findViewById(R.id.etUsernameRegister);
        etPasswordRegister = findViewById(R.id.etPasswordRegister);
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister2 = findViewById(R.id.btnRegister2); // Inicializa btnRegister2

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsernameRegister.getText().toString();
                String password = etPasswordRegister.getText().toString();

                SharedPreferences prefs = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();

                editor.putString("username", username);
                editor.putString("password", password);
                editor.apply();

                Toast.makeText(registroActivity.this, "El registro es correcto.", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(registroActivity.this, loginActivity.class));
            }
        });

        // Agrega el listener para btnRegister2
        btnRegister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(registroActivity.this, registro2Activity.class));
            }
        });
    }
}
