package com.example.proyekakhir;

public class ModelAnggaran {
    private String namaAnggaran, totalAnggaranMasuk, totalAnggaranKeluar, sisaAngaran;

    public ModelAnggaran(String namaAnggaran, String totalAnggaranMasuk, String totalAnggaranKeluar, String sisaAngaran) {
        this.namaAnggaran = namaAnggaran;
        this.totalAnggaranMasuk = totalAnggaranMasuk;
        this.totalAnggaranKeluar = totalAnggaranKeluar;
        this.sisaAngaran = sisaAngaran;
    }

    public String getNamaAnggaran() {
        return namaAnggaran;
    }

    public void setNamaAnggaran(String namaAnggaran) {
        this.namaAnggaran = namaAnggaran;
    }

    public String getTotalAnggaranMasuk() {
        return totalAnggaranMasuk;
    }

    public void setTotalAnggaranMasuk(String totalAnggaranMasuk) {
        this.totalAnggaranMasuk = totalAnggaranMasuk;
    }

    public String getTotalAnggaranKeluar() {
        return totalAnggaranKeluar;
    }

    public void setTotalAnggaranKeluar(String totalAnggaranKeluar) {
        this.totalAnggaranKeluar = totalAnggaranKeluar;
    }

    public String getSisaAngaran() {
        return sisaAngaran;
    }

    public void setSisaAngaran(String sisaAngaran) {
        this.sisaAngaran = sisaAngaran;
    }
}
