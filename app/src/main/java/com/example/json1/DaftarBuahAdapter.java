package com.example.json1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DaftarBuahAdapter extends RecyclerView.Adapter<DaftarBuahAdapter.DaftarBuahHolder> {
    List<Buah> buahbuahan;
    Activity activity;

    public DaftarBuahAdapter(List<Buah> buahbuahan, Activity activity) {
        this.buahbuahan = buahbuahan;
        this.activity = activity;
    }

    @NonNull
    @Override
    public DaftarBuahHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.rv_item,parent,false);
        return new DaftarBuahHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DaftarBuahHolder holder, int position) {
        holder.txtNama.setText(buahbuahan.get(position).getNama());
        holder.txtLatin.setText(buahbuahan.get(position).getLatin());
        holder.txtRasa.setText(buahbuahan.get(position).getRasa());

    }

    @Override
    public int getItemCount() {
        return buahbuahan.size();
    }

    static class DaftarBuahHolder extends RecyclerView.ViewHolder{
        TextView txtNama,txtLatin,txtRasa;

        public DaftarBuahHolder(@NonNull View itemView) {
            super(itemView);
            txtNama=(TextView)itemView.findViewById(R.id.txt_nama);
            txtLatin=(TextView) itemView.findViewById(R.id.txt_latin);
            txtRasa=(TextView) itemView.findViewById(R.id.txt_rasa);
        }
    }
}
