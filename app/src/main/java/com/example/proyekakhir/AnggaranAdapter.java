package com.example.proyekakhir;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AnggaranAdapter extends RecyclerView.Adapter<AnggaranViewHolder> {

    Context context;
    List<ModelAnggaran> mList;

    public AnggaranAdapter(Context context, List<ModelAnggaran> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public AnggaranViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View viewItem = inflater.inflate(R.layout.layout_item_anggaran, parent, false);
        return new AnggaranViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull AnggaranViewHolder holder, int position) {
        final ModelAnggaran data = mList.get(position);
        holder.namaAnggaranView.setText( data.getNamaAnggaran());
        holder.totalMasukView.setText("Total Masuk: Rp." + data.getTotalAnggaranMasuk());
        holder.totalKeluarView.setText("Total Keluar: Rp." + data.getTotalAnggaranKeluar());
        holder.sisaAnggaranView.setText("Sisa: Rp." + data.getSisaAngaran());

        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.anim_item));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setFilteredList(List<ModelAnggaran> filteredList) {
        this.mList = filteredList;
        notifyDataSetChanged();
    }


}
