package com.example.lidm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DeckAdapter extends RecyclerView.Adapter<DeckAdapter.DeckHolder> {
    private ArrayList<Element> elements;
    Context context;
    public DeckAdapter(Context context, ArrayList<Element> elements) {
        this.context = context;
        this.elements = elements;
    }

    @Override
    public DeckHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.deck_recycler, parent, false);
        return new DeckHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(final DeckHolder holder, final int position) {
        holder.deck_number.setText(String.valueOf(elements.get(position).getAtomicNumber()));
        holder.deck_name.setText(elements.get(position).getName());
        //in some cases, it will prevent unwanted situations
        holder.deck_check.setOnCheckedChangeListener(null);
        //if true, your checkbox will be selected, else unselected
        holder.deck_check.setChecked(elements.get(position).getAdded());

        if (elements.get(position).getGroupBlock().equals("Nonlogam")){
            holder.deck_name.setTextColor(Color.parseColor("#79C59E"));
        }
        if (elements.get(position).getGroupBlock().equals("Gas Mulia")){
            holder.deck_name.setTextColor(Color.parseColor("#E86A91"));
        }
        if (elements.get(position).getGroupBlock().equals("Logam Alkali")){
            holder.deck_name.setTextColor(Color.parseColor("#8560C5"));
        }
        if (elements.get(position).getGroupBlock().equals("Logam Alkali Tanah")){
            holder.deck_name.setTextColor(Color.parseColor("#E24681"));
        }
        if (elements.get(position).getGroupBlock().equals("Metaloid")){
            holder.deck_name.setTextColor(Color.parseColor("#94B8DB"));
        }
        if (elements.get(position).getGroupBlock().equals("Halogen")){
            holder.deck_name.setTextColor(Color.parseColor("#D0A29D"));
        }
        if (elements.get(position).getGroupBlock().equals("Logam Transisi")){
            holder.deck_name.setTextColor(Color.parseColor("#D2BACF"));
        }
        if (elements.get(position).getGroupBlock().equals("Belum Diketahui")){
            holder.deck_name.setTextColor(Color.parseColor("#DFDFDF"));
        }
        if (elements.get(position).getGroupBlock().equals("Logam Pascatransisi")){
            holder.deck_name.setTextColor(Color.parseColor("#FADF63"));
        }
        if (elements.get(position).getGroupBlock().equals("Aktinida")){
            holder.deck_name.setTextColor(Color.parseColor("#5267DC"));
        }
        if (elements.get(position).getGroupBlock().equals("Lantanida")){ ;
            holder.deck_name.setTextColor(Color.parseColor("#3BB1F4"));
        }
        holder.deck_check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    elements.get(position).added = true;
                    StringBuilder a = new StringBuilder();
                    a.append("Kartu ");
                    a.append(elements.get(position).getName());
                    a.append(" telah ditambahkan.");
                    Toast.makeText(context,a,Toast.LENGTH_SHORT).show();
                } else {
                    elements.get(position).added = false;
                    StringBuilder a = new StringBuilder();
                    a.append("Kartu ");
                    a.append(elements.get(position).getName());
                    a.append(" telah dihapus.");
                    Toast.makeText(context,a,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return (elements != null) ? elements.size() : 0;
    }

    public class DeckHolder extends RecyclerView.ViewHolder{
        private TextView deck_number, deck_name;
        private CheckBox deck_check;
        public DeckHolder(View itemView) {
            super(itemView);
            deck_number = (TextView) itemView.findViewById(R.id.list_number);
            deck_name = (TextView) itemView.findViewById(R.id.list_name);
            deck_check = (CheckBox) itemView.findViewById(R.id.list_check);
        }
    }

    void setFilter(ArrayList<Element> filterList){
        elements = new ArrayList<>();
        elements.addAll(filterList);
        notifyDataSetChanged();
    }
}