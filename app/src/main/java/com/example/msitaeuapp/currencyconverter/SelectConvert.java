package com.example.msitaeuapp.currencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.msitaeuapp.R;

public class SelectConvert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_select_convert);

        Button btnkhusd = (Button)findViewById(R.id.convertRielToUSD);
        btnkhusd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectConvert.this, KhConvertUsd.class));
            }
        });

        Button btnusdkh = (Button)findViewById(R.id.btn_usd_kh);
        btnusdkh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectConvert.this, UsdConvertKh.class));
            }
        });

        Button btneurokh = (Button)findViewById(R.id.btn_eu_kh);
        btneurokh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectConvert.this, EnConvertKh.class));
            }
        });

        Button btnkheuro = (Button)findViewById(R.id.btn_kh_eu);
        btnkheuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectConvert.this, EnConvertKh.class));
            }
        });


    }

}