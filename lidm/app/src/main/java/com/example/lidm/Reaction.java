package com.example.lidm;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class Reaction {
    private String react_nama;
    private String react_simbol;
    private String react_massa;
    private String react_reaction;
    private String react_ikatan;
    private int react_gambar;



    public Reaction() {
    }

    public Reaction(String react_simbol, String react_nama, String react_massa, String react_reaction, int react_gambar, String react_ikatan ) {
        this.react_simbol = react_simbol;
        this.react_nama = react_nama;
        this.react_massa = react_massa;
        this.react_reaction = react_reaction;
        this.react_ikatan = react_ikatan;
        this.react_gambar = react_gambar;
    }

    public String getReact_ikatan() {
        return react_ikatan;
    }

    public void setReact_ikatan(String react_ikatan) {
        this.react_ikatan = react_ikatan;
    }

    public void setReact_gambar(int react_gambar) {
        this.react_gambar = react_gambar;
    }
    public int getReact_gambar() {
        return react_gambar;
    }

    public String getReact_simbol() {
        return react_simbol;
    }
    public void setReact_simbol(String react_simbol) {
        this.react_simbol = react_simbol;
    }

    public String getReact_nama() {
        return react_nama;
    }
    public void setReact_nama(String react_nama) {
        this.react_nama = react_nama;
    }

    public String getReact_massa() {
        return react_massa;
    }
    public void setReact_massa(String react_massa) {
        this.react_massa = react_massa;
    }

    public String getReact_reaction() {
        return react_reaction;
    }
    public void setReact_reaction(String react_reaction) {
        this.react_reaction = react_reaction;
    }
}

