package com.example.sectog.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.ActivityAdaptermybagBinding
import com.example.sectog.spinner.Countries
import com.example.sectog.spinner.SpinnerAdapter


class AdapterCart : RecyclerView.Adapter<AdapterCart.ViewHolder>() {
    private var context: Context? = null

    private val Imageprofile = arrayOf<Int>(
        R.drawable.img_7, R.drawable.img_7, R.drawable.img_7,
        R.drawable.img_7, R.drawable.img_7, R.drawable.img_7, R.drawable.img_7
    )

    //    private val imageWlike = arrayListOf<Int>(
//        R.drawable.subclolikered, R.drawable.subclolikered, R.drawable.subclolikered,
//        R.drawable.subclolikered, R.drawable.subclolikered, R.drawable.subclolikered, R.drawable.subclolikered
//    )
//    private val imageRlike = arrayListOf<Int>(
//        R.drawable.subclohlike, R.drawable.subclohlike, R.drawable.subclohlike,
//        R.drawable.subclohlike, R.drawable.subclohlike, R.drawable.subclohlike, R.drawable.subclohlike
//    )
    private val NameCloth = arrayListOf<String>(
        "3-strips shirt",
        "3-strips shirt",
        "3-strips shirt",
        "3-strips shirt",
        "3-strips shirt",
        "3-strips shirt",
        "3-strips shirt"
    )
    private val textBrand = arrayListOf<String>(
        "Adidas originals",
        "Adidas originals",
        "Adidas originals",
        "Adidas originals",
        "Adidas originals",
        "Adidas originals",
        "Adidas originals"
    )
    private val clothPriceOne = arrayListOf<Int>(51, 50, 50, 50, 50, 50, 50)
    private val clothPriceTwo = arrayListOf<Int>(51, 50, 50, 50, 50, 50, 50)

    inner class ViewHolder(val binding: ActivityAdaptermybagBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "hello item", Toast.LENGTH_SHORT).show()

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //  val vh = ViewHolder(v)
        // set the Context here
        // set the Context here
        context = parent.context
        val binding = ActivityAdaptermybagBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.imageView21.setImageResource(Imageprofile[position])
        holder.binding.textView24.text = NameCloth[position]
        holder.binding.textView21.text = textBrand[position]
        holder.binding.textView30.text = "$" + clothPriceOne[position].toString()
        holder.binding.textView27.text = "$" + clothPriceTwo[position].toString()


        // adapter set for spinner

        val adapter = SpinnerAdapter(context!!, Countries.list!!)
        holder.binding.spinnercolor.adapter = adapter



    }
}