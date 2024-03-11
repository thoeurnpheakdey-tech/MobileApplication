package com.example.msitaeuapp.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.msitaeuapp.R;

public class KhConvertUsd extends AppCompatActivity {

    private EditText editTextKHR;
    private Button buttonConvert;
    private TextView textViewUSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kh_convert_usd);

        editTextKHR = findViewById(R.id.edt_text);
        buttonConvert = findViewById(R.id.btn_kh_usd);
        textViewUSD = findViewById(R.id.txt_result);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCurrency();
            }
        });

    }
    private void convertCurrency() {
        // Get text from EditText
        String khrText = editTextKHR.getText().toString();

        // Convert text to numeric value (assuming input is numeric)
        double amountKHR = Double.parseDouble(khrText);

        // Convert KHR to USD using your conversion method
        double amountUSD = convertKHRtoUSD(amountKHR);

        // Display the result in TextView
        textViewUSD.setText(String.format("%.2f", amountUSD));
    }
    // Method to convert KHR to USD
    private double convertKHRtoUSD(double amountKHR) {
        // Perform currency conversion calculation
        // For simplicity, using a fixed exchange rate
        double exchangeRate = 0.00024632;
        return amountKHR * exchangeRate;
    }


}