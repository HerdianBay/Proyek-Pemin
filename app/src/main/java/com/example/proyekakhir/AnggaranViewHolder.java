package com.example.proyekakhir;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class AnggaranViewHolder extends RecyclerView.ViewHolder {
    TextView namaAnggaranView, totalMasukView, totalKeluarView, sisaAnggaranView;
    CardView cardView;
    public AnggaranViewHolder(@NonNull View itemView) {
        super(itemView);
        namaAnggaranView = itemView.findViewById(R.id.tv_namaAnggaran);
        totalMasukView = itemView.findViewById(R.id.tv_totalAnggaranMasuk);
        totalKeluarView = itemView.findViewById(R.id.tv_totalAnggaranKeluar);
        sisaAnggaranView = itemView.findViewById(R.id.tv_sisaAnggaran);
        cardView = itemView.findViewById(R.id.card_item);
    }
}
