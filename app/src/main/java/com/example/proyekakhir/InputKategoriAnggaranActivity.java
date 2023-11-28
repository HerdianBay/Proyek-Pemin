package com.example.proyekakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class InputKategoriAnggaranActivity extends AppCompatActivity {

    private EditText judulAnggaran, keterangan;
    private Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_kategori_anggaran);

        judulAnggaran = findViewById(R.id.judulAnggaranEditText);
        keterangan = findViewById(R.id.keteranganEditText);
        simpan = findViewById(R.id.simpanButton);
    }
}