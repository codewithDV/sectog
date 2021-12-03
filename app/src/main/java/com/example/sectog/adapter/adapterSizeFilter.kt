package com.example.sectog.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.databinding.SizechartusBinding

class adapterSizeFilter: RecyclerView.Adapter<adapterSizeFilter.ViewHolder>() {

    // pass context
    private var context: Context? = null

    private val name =
        arrayOf("5", "5.5", "6", "6.5", "7", "7.5", "8","8.5","9","9.5","10","10.5")


    // binding

    inner class ViewHolder(val binding: SizechartusBinding) : RecyclerView.ViewHolder(binding.root),
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
        val binding = SizechartusBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNumS.text = name[position]



    }
}

