package com.example.lidm;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ElementHolder> {

    private ArrayList<Element> elements;
    public CardAdapter(ArrayList<Element> elements) {
        this.elements = elements;
    }

    @Override
    public ElementHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_recycler, parent, false);
        return new ElementHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(final ElementHolder holder, final int position) {
        holder.cf_simbol.setText(elements.get(position).getSymbol());
        holder.cb_kategori.setText(elements.get(position).getGroupBlock());
        holder.cb_nomor.setText(String.valueOf(elements.get(position).getAtomicNumber()));
        holder.cb_simbol.setText(elements.get(position).getSymbol());
        holder.cb_massa.setText(elements.get(position).getAtomicMass());
        holder.cb_nama.setText(elements.get(position).getName());
        holder.cb_konfigurasi.setText(elements.get(position).getElectronicConfiguration());
        if (elements.get(position).getGroupBlock().equals("Nonlogam")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#79C59E"));
            holder.cb_nomor.setTextColor(Color.parseColor("#79C59E"));
            holder.cb_nama.setTextColor(Color.parseColor("#79C59E"));
        }
        if (elements.get(position).getGroupBlock().equals("Gas Mulia")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#E86A91"));
            holder.cb_nomor.setTextColor(Color.parseColor("#E86A91"));
            holder.cb_nama.setTextColor(Color.parseColor("#E86A91"));
        }
        if (elements.get(position).getGroupBlock().equals("Logam Alkali")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#8560C5"));
            holder.cb_nomor.setTextColor(Color.parseColor("#8560C5"));
            holder.cb_nama.setTextColor(Color.parseColor("#8560C5"));
        }
        if (elements.get(position).getGroupBlock().equals("Logam Alkali Tanah")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#E24681"));
            holder.cb_nomor.setTextColor(Color.parseColor("#E24681"));
            holder.cb_nama.setTextColor(Color.parseColor("#E24681"));
        }
        if (elements.get(position).getGroupBlock().equals("Metaloid")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#94B8DB"));
            holder.cb_nomor.setTextColor(Color.parseColor("#94B8DB"));
            holder.cb_nama.setTextColor(Color.parseColor("#94B8DB"));
        }
        if (elements.get(position).getGroupBlock().equals("Halogen")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#D0A29D"));
            holder.cb_nomor.setTextColor(Color.parseColor("#D0A29D"));
            holder.cb_nama.setTextColor(Color.parseColor("#D0A29D"));
        }
        if (elements.get(position).getGroupBlock().equals("Logam Transisi")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#D2BACF"));
            holder.cb_nomor.setTextColor(Color.parseColor("#D2BACF"));
            holder.cb_nama.setTextColor(Color.parseColor("#D2BACF"));
        }
        if (elements.get(position).getGroupBlock().equals("Belum Diketahui")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#DFDFDF"));
            holder.cb_nomor.setTextColor(Color.parseColor("#DFDFDF"));
            holder.cb_nama.setTextColor(Color.parseColor("#DFDFDF"));
        }
        if (elements.get(position).getGroupBlock().equals("Logam Pascatransisi")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#FADF63"));
            holder.cb_nomor.setTextColor(Color.parseColor("#FADF63"));
            holder.cb_nama.setTextColor(Color.parseColor("#FADF63"));
        }
        if (elements.get(position).getGroupBlock().equals("Aktinida")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#5267DC"));
            holder.cb_nomor.setTextColor(Color.parseColor("#5267DC"));
            holder.cb_nama.setTextColor(Color.parseColor("#5267DC"));
        }
        if (elements.get(position).getGroupBlock().equals("Lantanida")){
            holder.kartudb.setCardBackgroundColor(Color.parseColor("#3BB1F4"));
            holder.cb_nomor.setTextColor(Color.parseColor("#3BB1F4"));
            holder.cb_nama.setTextColor(Color.parseColor("#3BB1F4"));
        }

        if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.FRONT_SIDE && elements.get(
                position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
        } else if (holder.flipView.getCurrentFlipState() == EasyFlipView.FlipState.BACK_SIDE
                && !elements.get(position).isFlipped) {
            holder.flipView.setFlipDuration(0);
            holder.flipView.flipTheView();
        }
        holder.flipView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (elements.get(position).isFlipped) {
                    elements.get(position).isFlipped = false;
                } else {
                    elements.get(position).isFlipped = true;
                }
                holder.flipView.setFlipDuration(700);
                holder.flipView.flipTheView();
            }
        });
    }

    @Override
    public int getItemCount() {
        return (elements != null) ? elements.size() : 0;
    }

    public class ElementHolder extends RecyclerView.ViewHolder{
        private TextView cf_simbol,cb_kategori, cb_nomor, cb_simbol, cb_massa, cb_nama, cb_konfigurasi;
        private CardView kartudb;
        EasyFlipView flipView;
        public ElementHolder(View itemView) {
            super(itemView);
            flipView = (EasyFlipView) itemView.findViewById(R.id.flipView);
            kartudb = (CardView) itemView.findViewById(R.id.kartu);
            cf_simbol = (TextView) itemView.findViewById(R.id.cardf_simbol);
            cb_kategori = (TextView) itemView.findViewById(R.id.cardb_kategori);
            cb_nomor = (TextView) itemView.findViewById(R.id.cardb_nomor);
            cb_simbol = (TextView) itemView.findViewById(R.id.cardb_simbol);
            cb_massa = (TextView) itemView.findViewById(R.id.cardb_massa);
            cb_nama = (TextView) itemView.findViewById(R.id.cardb_nama);
            cb_konfigurasi = (TextView) itemView.findViewById(R.id.cardb_konfigurasi);
        }
    }
}