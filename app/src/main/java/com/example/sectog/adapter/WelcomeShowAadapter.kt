package com.example.sectog.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.WelcomedesignBinding


class WelcomeShowAadapter : RecyclerView.Adapter<WelcomeShowAadapter.ViewHolder>() {
    private val Imageprofile = arrayOf<Int>(
        R.drawable.avtar2, R.drawable.avtar2, R.drawable.avtar2,

    )

    private val textName = arrayListOf<String>(
        "VFA Boost",
        "VFA Boost",
        "VFA Boost",

    )
    private val textOutfit = arrayListOf<String>(
        "Backpacks",
        "Backpacks",
        "Backpacks",

    )
    private val textPrice = arrayListOf<Int>(51, 50, 50)


    inner class ViewHolder(val binding: WelcomedesignBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "hello item", Toast.LENGTH_SHORT).show()

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val v = LayoutInflater.from(parent.context)
//            .inflate(R.layout.welcomedesign, parent, false)
//        return ViewHolder(v)

        val binding = WelcomedesignBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.ivWAvtar.setImageResource(Imageprofile[position])
        holder.binding.tvVfaboost.text = textName[position]
        holder.binding.tvBackPakets.text = textOutfit[position]
        holder.binding.btnDprice.text = "$" + textPrice[position].toString()


    }
}