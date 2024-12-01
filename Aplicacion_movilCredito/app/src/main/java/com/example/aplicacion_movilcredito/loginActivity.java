package com.example.aplicacion_movilcredito;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.example.appcredito.R;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    EditText etUsernameLogin, etPasswordLogin;
    Button btnLogin;
    TextView tvGoToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        etUsernameLogin = findViewById(R.id.etUsernameLogin);
        etPasswordLogin = findViewById(R.id.etPasswordLogin);
        btnLogin = findViewById(R.id.btnLogin);
        tvGoToRegister = findViewById(R.id.tvGoToRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsernameLogin.getText().toString();
                String password = etPasswordLogin.getText().toString();

                SharedPreferences prefs = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                String savedUsername = prefs.getString("username", null);
                String savedPassword = prefs.getString("password", null);

                if (username.equals(savedUsername) && password.equals(savedPassword)) {
                    Toast.makeText(loginActivity.this, "Inicio de sesión correcta, bienvenido.", Toast.LENGTH_SHORT).show();

                    // Redirigir a MenuActivity
                    startActivity(new Intent(loginActivity.this, MenuActivity.class));
                } else {
                    Toast.makeText(loginActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loginActivity.this, registroActivity.class));
            }
        });
    }
}