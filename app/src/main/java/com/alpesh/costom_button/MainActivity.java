package com.alpesh.costom_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView txtSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSubmit = findViewById(R.id.textSubmit);

        Toast.makeText(this, "Submit Complete", Toast.LENGTH_SHORT).show();
    }
}