package com.example.imageslider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*


class ViewPagerAdapter (val images: List<Int>): RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>()
{
    inner class ViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currImage = images[position]
        holder.itemView.ivIm
    }

    override fun getItemCount(): Int {
        return images.size
    }
}