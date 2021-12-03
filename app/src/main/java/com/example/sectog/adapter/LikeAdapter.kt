package com.example.sectog.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.WishlistrvdesignBinding


class LikeAdapter : RecyclerView.Adapter<LikeAdapter.ViewHolder>() {

    class Model(
        var image: Int,
        var name: String,
        var textOutfit: String,
        var price: String
    )  // class model

    private val arrayListOutFit =
        arrayListOf(Model(R.drawable.ivwishlist, "Jensons Blue", "Urban Outfitters","51"),
            Model(R.drawable.ivwishlist, "Jensons Blue", "Urban Outfitters","51"),
            Model(R.drawable.ivwishlist, "Jensons Blue", "Urban Outfitters","51"),
            Model(R.drawable.ivwishlist, "Jensons Blue", "Urban Outfitters","51"),
            Model(R.drawable.ivwishlist, "Jensons Blue", "Urban Outfitters","51"),
            Model(R.drawable.ivwishlist, "Jensons Blue", "Urban Outfitters","51"),
            Model(R.drawable.ivwishlist, "Jensons Blue", "Urban Outfitters","51"))
    private val Imageprofile = arrayOf<Int>(
        R.drawable.ivwishlist, R.drawable.ivwishlist, R.drawable.ivwishlist,
        R.drawable.ivwishlist, R.drawable.ivwishlist, R.drawable.ivwishlist, R.drawable.ivwishlist
    )
    private val imageWlike = arrayListOf<Int>(
        R.drawable.ivwishsign, R.drawable.ivwishsign, R.drawable.ivwishsign,
        R.drawable.ivwishsign, R.drawable.ivwishsign, R.drawable.ivwishsign, R.drawable.ivwishsign
    )
    private val imageWlike2 = arrayListOf<Int>(
        R.drawable.ivwishgreen,
        R.drawable.ivwishgreen,
        R.drawable.ivwishgreen,
        R.drawable.ivwishgreen,
        R.drawable.ivwishgreen,
        R.drawable.ivwishgreen,
        R.drawable.ivwishgreen
    )

    private val textName = arrayListOf<String>(
        "Jensons Blue",
        "Kylie Cropped",
        "Jensons Blue",
        "Kylie Cropped",
        "Jensons Blue",
        "Kylie Cropped",
        "Jensons Blue"
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


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // val v = LayoutInflater.from(parent.context).inflate(R.layout.wishlistrvdesign, parent, false)
        // return ViewHolder(v)

        val binding =
            WishlistrvdesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return arrayListOutFit.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBindView(arrayListOutFit[position])
    }

    inner class ViewHolder(val binding: WishlistrvdesignBinding) :    // inner class down
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "hello item", Toast.LENGTH_SHORT).show()
            }
            binding.ivWsign.setOnClickListener {
                binding.ivWsign2.visibility = View.VISIBLE
            }
            binding.ivWsign2.setOnClickListener {
                binding.ivWsign2.visibility = View.INVISIBLE
            }
        }

        fun onBindView(item: Model) = with(binding) {
            item.apply {
                ivCloth.setImageResource(image)
                //ivWsign.setImageResource(image)
                //ivWsign2.setImageResource(image)
                tvWname.text = name
                tvWbrandName.text = textOutfit
                tvWrate.text = itemView.context.getString(R.string.lbl_price,price)
                tvWratez.text = itemView.context.getString(R.string.lbl_price,price)
            }


        }

    }


}