package com.example.prolo.Producer;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.prolo.MainActivity;
import com.example.prolo.R;

public class RegisterProducerActivity extends AppCompatActivity {
    Button buttonRegister;
    EditText editTextFirstName, editTextLastName;
    EditText editTextUsername, editTextPassword;
    TextView textViewRegister;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Toolbar tbar = findViewById(R.id.toolbar);
        setSupportActionBar(tbar);
        getSupportActionBar().setTitle(null);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        tbar.setNavigationIcon(R.drawable.logo);
        tbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do whatever you want to do here
            }
        });

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

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.pencilItem:
                break;

            case R.id.gearItem:
                Intent goToSettings = new Intent(RegisterActivity.this, com.example.prolo.Producer.RegisterActivity.class);
                startActivity(goToSettings);
                break;

        }

        return true;
    }


}