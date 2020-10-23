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

public class LoginActivity extends AppCompatActivity {
    Button buttonLogin;
    EditText editTextUsernname, editTextPassword;
    TextView textViewRegister;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

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
                Intent goToSettings = new Intent(LoginActivity.this, com.example.prolo.Producer.LoginActivity.class);
                startActivity(goToSettings);
                break;

        }

        return true;
    }



}