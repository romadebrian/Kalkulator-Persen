package com.roma.kalkulatorpersen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Script;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    View Form1;
    EditText Jumlah, Persen, Hasil;
    Button Hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Form1 = findViewById(R.id.Frm_Persen1);
        Jumlah = findViewById(R.id.Frm_Input_Jumlah);
        Persen = findViewById(R.id.Frm_Input_Persen);
        Hasil = findViewById(R.id.Frm_Input_Hasil);
        Hitung = findViewById(R.id.Frm_Btn_Hitung);


        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlahString = Jumlah.getText().toString();
                String persenString       = Persen.getText().toString();

                int jumlah  = Integer.parseInt(jumlahString);
                int persen  = Integer.parseInt(persenString);
                int hasil   = jumlah + persen;

                Hasil.setText("hasil");
            }
        });
    }
}