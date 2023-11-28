package com.example.proyekakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ModelAnggaran> listAnggaran = new ArrayList<ModelAnggaran>();
    RecyclerView recyclerView;
    SearchView searchView;
    AnggaranAdapter anggaranAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_anggaran);
        anggaranAdapter = new AnggaranAdapter(getApplicationContext(), listAnggaran);

        listAnggaran.add(new ModelAnggaran("Titanium Horizon Oilfield Development", "1,000,000,000", "800,000,000", "200,000,000"));
        listAnggaran.add(new ModelAnggaran("Arctic Star Energy Endeavor", "1,500,000,000", "1,000,000,000", "500,000,000"));
        listAnggaran.add(new ModelAnggaran("Sunset Plains Reservoir Project", "2,000,000,000", "1,500,000,000", "500,000,000"));
        listAnggaran.add(new ModelAnggaran("Manajemen Risiko Operasional", "1,200,000,000", "900,000,000", "300,000,000"));
        listAnggaran.add(new ModelAnggaran("GoldenDunes Petroleum Venture", "1,000,000,000", "800,000,000", "200,000,000"));
        listAnggaran.add(new ModelAnggaran("Proyek Eksplorasi Minyak Bumi", "1,500,000,000", "1,000,000,000", "500,000,000"));
        listAnggaran.add(new ModelAnggaran("Pengembangan Lapangan Minyak Baru", "2,000,000,000", "1500,000,000", "500,000,000"));
        listAnggaran.add(new ModelAnggaran("PrimeGulf Oil Sands Initiative", "1,200,000,000", "900,000,000", "300,000,000"));

        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);
        recyclerView.setAdapter(anggaranAdapter);


        searchView = findViewById(R.id.search_anggaran);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                fileList(newText);
                return true;
            }
        });


    }

    private void fileList(String text) {
        List<ModelAnggaran> filteredList = new ArrayList<>();
        for (ModelAnggaran item : listAnggaran){
            if (item.getNamaAnggaran().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }

        if(filteredList.isEmpty()){
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
        }else {
            anggaranAdapter.setFilteredList(filteredList);
        }
    }
}