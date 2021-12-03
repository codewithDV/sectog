package com.example.sectog.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.ColordgridBinding

class AdapterColor : RecyclerView.Adapter<AdapterColor.ViewHolder>() {

    // pass context
    private var context: Context? = null

    private val name = arrayListOf<Int>(
        R.drawable.color1,
        R.drawable.color2,
        R.drawable.color4,
        R.drawable.color5,
        R.drawable.color6,
        R.drawable.color8,
        R.drawable.color10,
        R.drawable.color1,
        R.drawable.color2,
        R.drawable.color1,
        R.drawable.color2,
        R.drawable.color4,
        R.drawable.color5,
        R.drawable.color6,
        R.drawable.color8,)

    // binding

    inner class ViewHolder(val binding: ColordgridBinding) : RecyclerView.ViewHolder(binding.root),
        View.OnClickListener {


        override fun onClick(v: View?) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // context
        context = parent.context
        // val v = LayoutInflater.from(parent.context).inflate(R.layout.catproductdesign, parent, false)
        // return ViewHolder(v)

        // binding for id
        val binding = ColordgridBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.ibRedDesign.setImageResource(name[position])
        holder.binding.ibRedDesign.setOnClickListener {

        }


    }
}

