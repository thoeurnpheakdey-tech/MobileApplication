package com.example.msitaeuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.msitaeuapp.currencyconverter.EnConvertKh;
import com.example.msitaeuapp.currencyconverter.SelectConvert;

public class MenuApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_app);

        Button btnmenu = (Button)findViewById(R.id.btnmenu1);
        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuApp.this, SelectConvert.class));
            }
        });

        Button btnmenu2 = (Button)findViewById(R.id.btnmenu2);
        btnmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuApp.this, Item.class));
            }
        });
    }
}