package com.example.proyekakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class InputAnggaranActivity extends AppCompatActivity {

    private EditText tanggal, keterangan;
    private Button simpan;
    private RadioGroup jenis;
    private RadioButton pemasukan, pengeluaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_anggaran);

        tanggal = findViewById(R.id.tanggalEditText);
        keterangan = findViewById(R.id.keteranganEditText);
        jenis = findViewById(R.id.jenisRadioGroup);
        pemasukan = findViewById(R.id.pemasukkanRadioButton);
        pengeluaran = findViewById(R.id.pengeluaranRadioButton);
        simpan = findViewById(R.id.simpanButton);
    }
}