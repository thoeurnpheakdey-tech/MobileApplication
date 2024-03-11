package com.example.msitaeuapp.currencyconverter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.msitaeuapp.R;

public class EnConvertKh extends AppCompatActivity {
    private EditText editTextEN;
    private Button buttonConvert;
    private TextView textViewKHR;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_en_convert_kh);

        editTextEN = findViewById(R.id.edt_text);
        buttonConvert = findViewById(R.id.btn_eu_kh);
        textViewKHR = findViewById(R.id.txt_result);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCurrency();
            }
        });

    }
    private void convertCurrency() {
        String enText = editTextEN.getText().toString();

        // Convert text to numeric value (assuming input is numeric)
        double amountKHR = Double.parseDouble(enText);

        // Convert EUR to KHR using your conversion method
        double amountEN = convertEURToKHR(amountKHR);

        // Display the result in TextView
        textViewKHR.setText(String.format("%.2f", amountEN));
    }
    // Method to convert EN to KHR
    private double convertEURToKHR(double amountEN) {
        // Perform currency conversion calculation
        // For simplicity, using a fixed exchange rate
        double EXCHANGE_RATE_EUR_TO_KHR = 4700.0;
        return amountEN * EXCHANGE_RATE_EUR_TO_KHR;
    }




}