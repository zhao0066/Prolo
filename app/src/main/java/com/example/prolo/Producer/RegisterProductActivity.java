package com.example.prolo.Producer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.prolo.R;

public class RegisterProductActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_product_item);

        Toolbar toolbar = findViewById(R.id.toolbarCreateProduct);
        setSupportActionBar(toolbar);
    }
}