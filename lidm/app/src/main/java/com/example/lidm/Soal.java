package com.example.lidm;

import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;

import java.util.ArrayList;

public class Soal {
    private String pertanyaan;
    private ArrayList<String> jawaban = new ArrayList<>();
    private String jawaban1;
    private String jawaban2;
    private String jawaban3;
    private String benar;
    private String pembahasan;


    public Soal() {
    }

    public Soal(String pertanyaan, String jawaban1, String jawaban2, String jawaban3, String benar, String pembahasan) {
        this.pertanyaan = pertanyaan;
        this.jawaban.add(jawaban1);
        this.jawaban.add(jawaban2);
        this.jawaban.add(jawaban3);
        this.benar = benar;
        this.pembahasan = pembahasan;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }
    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getJawaban1() {
        return jawaban.get(0);
    }
    public void setJawaban1(String jawaban1) {
        this.jawaban.set(0,jawaban1);
    }
    public String getJawaban2() {
        return jawaban.get(1);
    }
    public void setJawaban2(String jawaban2) {
        this.jawaban.set(1,jawaban2);
    }
    public String getJawaban3() {
        return jawaban.get(2);
    }
    public void setJawaban3(String jawaban3) {
        this.jawaban.set(2,jawaban3);
    }

    public ArrayList<String> getjawaban() {
        return jawaban;
    }


    public String getBenar() {
        return benar;
    }
    public void setBenar(String benar) {
        this.benar = benar;
    }

    public String getPembahasan() {
        return pembahasan;
    }
    public void setPembahasan(String pembahasan) {
        this.pembahasan = pembahasan;
    }
}

