package com.teamDev.docuflow;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Al presionar "Iniciar Sesión" → ir al Dashboard
        Button boton_iniciar_sesion = findViewById(R.id.boton_iniciar_sesion);
        boton_iniciar_sesion.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Dashboard.class);
            startActivity(intent);
            finish(); // Cierra el Login para que no vuelva atrás
        });

    }
}