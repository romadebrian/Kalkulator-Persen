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
    EditText Jumlah, Persen, Hasil, Jumlah2, Berapa, Hasil2;
    Button Hitung, Hitung2, Mode1, Mode2;


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

        Jumlah2 = findViewById(R.id.Frm_Input_Jumlah2);
        Berapa  = findViewById(R.id.Frm_Input_Berapa);
        Hasil2  = findViewById(R.id.Frm_Input_Hasil2);
        Hitung2 = findViewById(R.id.Frm_Btn_Hitung2);



//        Hitung.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String input1 = Jumlah.getText().toString();
//                String input2 = Persen.getText().toString();
//
//                if (input1.length() == 0) {
//                    Toast.makeText(MainActivity.this, "Jumlah Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                else if (input2.length() == 0) {
//                    Toast.makeText(MainActivity.this, "Persen Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                else {
//                    int jumlah  = Integer.parseInt(input1);
//                    int persen  = Integer.parseInt(input2);
//
//                    int hasil = jumlah * persen / 100;
//
//                    Hasil.setText(String.valueOf(hasil));
//                    Log.d( "Hasilnya: ", String.valueOf(hasil));
//                }
//
//            }
//        });

        Hitung2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = Jumlah2.getText().toString();
                String input2 = Berapa.getText().toString();

                if (input1.length() == 0 && input2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
                else {
                    double jumlah   = Integer.parseInt(input1);
                    double berapa   = Integer.parseInt(input2);

                    double hasil    = jumlah / berapa * 100 ;

                    int convert  = (int) hasil;

                    String output   = convert + "%";

                    Hasil2.setText(String.valueOf(output));
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