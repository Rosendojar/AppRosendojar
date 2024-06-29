package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button buttonIngresar = findViewById(R.id.buttonIngresar);
        EditText TxtUsuario = findViewById(R.id.TxtUsuario);
        EditText TxtPassword = findViewById(R.id.TxtPassword);



        buttonIngresar.setOnClickListener(v -> {
            if(TxtUsuario.getText().toString().isEmpty()){

                Toast.makeText(this, "Debe introducir un usuario", Toast.LENGTH_SHORT).show();

            }else if (TxtPassword.getText().toString().isEmpty()){

                Toast.makeText(this, "Debe introducir un password", Toast.LENGTH_SHORT).show();

            }else{

                Intent VentanaPrincipal = new Intent(this, MainActivity.class);

                startActivity(VentanaPrincipal);
            }



        });







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.buttonCancelar), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}