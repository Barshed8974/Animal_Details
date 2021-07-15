package com.example.animal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Holder> {
    private ArrayList<Animal> modellist=new ArrayList<>();
    private ItemClickListner itemClickListner;
    public Adapter(ArrayList<Animal>animalList,ItemClickListner itemClickListner) {
        this.modellist = animalList;
        this.itemClickListner=itemClickListner;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new Holder(view,itemClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull  Holder holder, int position) {
        Animal model=modellist.get(position);
        holder.setdata(model);
    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }
}
