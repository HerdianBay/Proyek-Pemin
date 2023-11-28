package com.example.proyekakhir;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private Button btn_print, btn_tambahData;
    private TextView headTanggal, headKet, headMasuk, headKeluar, dataTanggal, dataKet, dataMasuk, dataKeluar;
    private TableLayout tableAnggaran;
    private TableRow tableHead, tableData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btn_print = findViewById(R.id.printButton);
        btn_tambahData = findViewById(R.id.addDataButton);
        headTanggal = findViewById(R.id.tableheadtanggal);
        headKet = findViewById(R.id.tableheadket);
        headMasuk = findViewById(R.id.tableheadmasuk);
        headKeluar = findViewById(R.id.tableheadkeluar);
        dataTanggal = findViewById(R.id.datatanggal);
        dataKet = findViewById(R.id.dataket);
        dataMasuk = findViewById(R.id.datamasuk);
        dataKeluar = findViewById(R.id.datakeluar);
        tableAnggaran = findViewById(R.id.tableanggaran);
        tableHead = findViewById(R.id.tablehead);
        tableData = findViewById(R.id.tabledata);

        btn_tambahData.setOnClickListener(v -> startActivity(new Intent(DetailActivity.this, InputAnggaranActivity.class)));
    }

}
