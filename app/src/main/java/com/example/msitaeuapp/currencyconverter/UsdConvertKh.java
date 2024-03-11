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

public class UsdConvertKh extends AppCompatActivity {
    private EditText editTextKHR;
    private Button buttonConvert;
    private TextView textViewUSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usd_convert_kh);
        editTextKHR = findViewById(R.id.edt_text);
        buttonConvert = findViewById(R.id.btn_usd_kh);
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

        double amountUSD = convertUSDToKHR(amountKHR);

        // Display the result in TextView
        textViewUSD.setText(String.format("%.2f", amountUSD));
    }
    // Method to convert USD to KHR
    private double convertUSDToKHR(double amountKHR) {

        double EXCHANGE_RATE_USD_TO_KHR = 4100.0;
        return amountKHR * EXCHANGE_RATE_USD_TO_KHR;
    }

}