package com.example.lidm;

class DeckSearchFilter {

    private String nama;
    private int nomor;

    DeckSearchFilter(String nama, int nomor){
        this.nama = nama;
        this.nomor = nomor;
    }

    String getNama() {
        return nama;
    }

    int getNomor() {
        return nomor;
    }
}