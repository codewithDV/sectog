package com.example.sectog.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.NewariivalsdesignBinding


class NewArrivalsAdapter : RecyclerView.Adapter<NewArrivalsAdapter.ViewHolder>() {
    //  var Visible:Boolean = false
    var context: Context? = null


    private val Imageprofile = arrayOf<Int>(
        R.drawable.subclothing,
        R.drawable.subclothing,
        R.drawable.subclothing,
        R.drawable.subclothing,
        R.drawable.subclothing,
        R.drawable.subclothing,
        R.drawable.subclothing
    )
    private val imageWatchlike = arrayListOf<Int>(
        R.drawable.subclolikered,
        R.drawable.subclolikered,
      R.drawable.subclolikered,
        R.drawable.subclolikered,
        R.drawable.subclolikered,
        R.drawable.subclolikered,
        R.drawable.subclolikered
    )
    private val imageRlike = arrayListOf<Int>(
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike,
        R.drawable.subclohlike
    )
    private val textName = arrayListOf<String>(
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped",
        "Kylie Cropped"
    )
    private val textOutfit = arrayListOf<String>(
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfitters",
        "Urban Outfittersd"
    )
    private val textPrice = arrayListOf<Int>(51, 50, 50, 50, 50, 50, 50)
    private val textPricy = arrayListOf<Int>(51, 50, 50, 50, 50, 50, 50)


    inner class ViewHolder(val binding: NewariivalsdesignBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "hello item", Toast.LENGTH_SHORT).show()

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

//        val v = LayoutInflater.from(parent.context).inflate(R.layout.newariivalsdesign, parent, false)
//        return ViewHolder(v)

        context = parent.context

        val binding =
            NewariivalsdesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.ivSubClothingHistory.setImageResource(Imageprofile[position])
        holder.binding.ivLikeWhiteHistory.setImageResource(imageRlike[position])
        holder.binding.ivLikeRedHistory.setImageResource(imageWatchlike[position])
        holder.binding.tvSubNameHistory.text = textName[position]
        holder.binding.tvSubProductNamevHistory.text = textOutfit[position]
        holder.binding.tvSubPriceHistory.text = "$" + textPrice[position].toString()
        holder.binding.tvSubPrice2History.text = "$" + textPrice[position].toString()


      holder.binding.ivLikeWhiteHistory.setOnClickListener {
       holder.binding.ivLikeRedHistory.visibility = View.VISIBLE
          Toast.makeText(context, "Sucessful Added", Toast.LENGTH_SHORT).show()


      }



        holder.binding.ivLikeRedHistory.setOnClickListener {
            holder.binding.ivLikeRedHistory.visibility = View.INVISIBLE


        }
        holder.binding.ivSubClothingHistory.setOnClickListener {
            holder.itemView.findNavController().navigate(R.id.action_homeFragment_to_productpage_frame)
        }


    }

}





