package com.roma.kalkulatorpersen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Script;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    View Form1;
    EditText Jumlah, Persen, Hasil;
    Button Hitung, Mode1, Mode2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mode1 = findViewById(R.id.Frm_Btn_Mode1);
        Mode2 = findViewById(R.id.Frm_Btn_Mode2);

        Form1 = findViewById(R.id.Frm_Persen1);
        Jumlah = findViewById(R.id.Frm_Input_Jumlah);
        Persen = findViewById(R.id.Frm_Input_Persen);
        Hasil = findViewById(R.id.Frm_Input_Hasil);
        Hitung = findViewById(R.id.Frm_Btn_Hitung);


        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1 = Jumlah.getText().toString();
                String input2 = Persen.getText().toString();

                if (input1.length() == 0) {
                    Toast.makeText(MainActivity.this, "Jumlah Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (input2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Persen Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    int jumlah  = Integer.parseInt(input1);
                    int persen  = Integer.parseInt(input2);

                    int hasil = jumlah * persen / 100;

                    Hasil.setText(String.valueOf(hasil));
                    Log.d( "Hasilnya: ", String.valueOf(hasil));
                }

            }
        });

        Mode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Frm_Include).setVisibility(View.GONE);
            }
        });
    }


}