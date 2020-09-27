package com.example.lidm;

public class SoalPilihanGanda {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Apakah nama kelompok unsur yang unsur-unsur di dalamnya memiliki kekurangan 1 buah elektron untuk bisa seimbang?",
            "Bagaimana konfigurasi elektron dari unsur sesium-55?",
            "Reaksi berikut yang merupakan pembentukan dari asam klorida dari unsur pembentuknya adalah ...",
            "Disebut apakah aturan keseimbangan 8 elektron?",
            "Aku memiliki konfigurasi elektron [Ne]3s^1. Siapakah aku?",
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Alkali", "Gas Mulia", "Halogen"},
            {"[Ne]3s^1", "[Xe]6s^1", "[Kr]5s^1"},
            {"Cl(g) + H(g) → HCl(g)", "Cl2(g) + H2(g) → 2 HCl(g)", "Cl2(s) + H2(l) → 2 HCl(aq)"},
            {"Oktet", "Duplet", "Kuartet"},
            {"Kalsium", "Berilium", "Natrium"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "Halogen",
            "[Xe]6s^1",
            "Cl2(g) + H2(g) → 2 HCl(g)",
            "Oktet",
            "Natrium",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }

}
