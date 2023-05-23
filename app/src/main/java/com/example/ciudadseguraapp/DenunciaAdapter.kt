package com.example.ciudadseguraapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class DenunciaAdapter (private val list: List<Denuncia>) : RecyclerView.Adapter<DenunciaViewHolder>(){

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DenunciaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DenunciaViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: DenunciaViewHolder, position: Int) {
        val book: Denuncia = list[position]
        holder.bind(book)
    }
}