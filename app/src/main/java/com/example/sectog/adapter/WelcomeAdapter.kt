package com.example.sectog.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.DesigncardmainBinding



class WelcomeAdapter:RecyclerView.Adapter<WelcomeAdapter.ViewHolder>() {
    private   val Image = arrayOf<Int>(
        R.drawable.slidecard,R.drawable.slidecard, R.drawable.slidecard,
        R.drawable.slidecard, R.drawable.slidecard, R.drawable.slidecard, R.drawable.slidecard
    )
    private val name = arrayListOf<String>(
        "New collectio","New collectio","New collectio","New collectio","New collectio","New collectio","New collectio"
    )


    inner  class ViewHolder(val binding: DesigncardmainBinding):RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context,"hello item", Toast.LENGTH_SHORT).show()

            }
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val v = LayoutInflater.from(parent.context)
//            .inflate(R.layout.designcardmain    ,parent,false)
//        return ViewHolder(v)
        val binding = DesigncardmainBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return Image.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.ivCard.setImageResource(Image[position])
        holder.binding.TvCard.text=name[position]

    }
}