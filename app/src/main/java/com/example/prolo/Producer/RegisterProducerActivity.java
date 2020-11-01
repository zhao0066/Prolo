package com.example.prolo.Producer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.prolo.R;

public class RegisterProducerActivity extends AppCompatActivity {
    Button buttonRegister;
    EditText editTextFirstName, editTextLastName;
    EditText editTextUsername, editTextPassword;
    TextView textViewRegister;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextUsername = findViewById(R.id.editTextRegisterUsername);
        editTextPassword = findViewById(R.id.editTextRegisterPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(v -> {
            // TO DO - user info will not be saved for prototype 1 yet
            startActivity(new Intent(RegisterProducerActivity.this, LoginActivity.class));
        });

        Toolbar toolbar = findViewById(R.id.toolbarRegister);
        setSupportActionBar(toolbar);
    }
}