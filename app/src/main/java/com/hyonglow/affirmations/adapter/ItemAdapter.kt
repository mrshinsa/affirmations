package com.hyonglow.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hyonglow.affirmations.Affirmation
import com.hyonglow.affirmations.R

class ItemAdapter(val context: Context, val dataList: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewholder>() {

    class ItemViewholder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.tvItemTitle)
        val imageView: ImageView = view.findViewById(R.id.item_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ItemViewholder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    override fun onBindViewHolder(holder: ItemViewholder, position: Int) {
        val item = dataList[position]
        holder.titleTextView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }


}