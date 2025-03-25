package com.example.tipsforeveryday

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(private val tips: List<Tip>) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    inner class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayIndicator: TextView = itemView.findViewById(R.id.dayIndicator)
        val tipTitle: TextView = itemView.findViewById(R.id.tipTitle)
        val tipImage: ImageView = itemView.findViewById(R.id.tipImage)
        val tipDescription: TextView = itemView.findViewById(R.id.tipDescription)

        init {
            itemView.setOnClickListener {
                if (tipDescription.visibility == View.GONE) {
                    tipDescription.visibility = View.VISIBLE
                } else {
                    tipDescription.visibility = View.GONE
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]
        holder.dayIndicator.text = tip.day
        holder.tipTitle.text = tip.title
        holder.tipImage.setImageResource(tip.imageResId)
        holder.tipDescription.text = tip.description
    }

    override fun getItemCount(): Int = tips.size
}

