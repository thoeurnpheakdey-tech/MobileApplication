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

public class KhConvertEn extends AppCompatActivity {
    private EditText editTextKHR;
    private Button buttonConvert;
    private TextView textViewEN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kh_convert_en);

        editTextKHR = findViewById(R.id.edt_text);
        buttonConvert = findViewById(R.id.btn_kh_en);
        textViewEN = findViewById(R.id.txt_result);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCurrency();
            }
        });
    }
    private void convertCurrency() {
        String khrText = editTextKHR.getText().toString();

        // Convert text to numeric value (assuming input is numeric)
        double amountKHR = Double.parseDouble(khrText);

        // Convert KHR to EUR using your conversion method
        double amountEUR = convertKHRToEUR(amountKHR);

        // Display the result in TextView
        textViewEN.setText(String.format("%.2f", amountEUR));
    }
    // Method to convert KHR to EUR
    private double convertKHRToEUR(double amountKHR) {
        // Perform currency conversion calculation
        // For simplicity, using a fixed exchange rate
        double EXCHANGE_RATE_KHR_TO_EUR = 0.00021;
        return amountKHR * EXCHANGE_RATE_KHR_TO_EUR;
    }

}