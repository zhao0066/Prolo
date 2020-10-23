package com.example.prolo.Producer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.prolo.R;

public class LoginActivity extends AppCompatActivity {
    Button buttonLogin;
    EditText editTextUsernname, editTextPassword;
    TextView textViewRegister;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editTextUsernname = findViewById(R.id.editTextLoginUsername);
        editTextPassword = findViewById(R.id.editTextLoginPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewRegister = findViewById(R.id.textViewRegisterLink);

        buttonLogin.setOnClickListener(v -> {
            // TO DO - no authentication code for prototype 1 yet
            startActivity(new Intent(LoginActivity.this, ProductGroupListActivity.class));
        });

        textViewRegister.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });
    }
}