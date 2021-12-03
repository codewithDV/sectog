package com.example.sectog.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.CommentdesignBinding

class AdapterCom : RecyclerView.Adapter<AdapterCom.ViewHolder>() {
    private val Imageprofile = arrayOf<Int>(
        R.drawable.avtar2, R.drawable.avtar2, R.drawable.avtar2,
        R.drawable.avtar2, R.drawable.avtar2, R.drawable.avtar2, R.drawable.avtar2
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
        "15.03.2020 at 15:33",
        "15.03.2020 at 15:33",
        "15.03.2020 at 15:33",
        "15.03.2020 at 15:33",
        "15.03.2020 at 15:33",
        "15.03.2020 at 15:33",
        "15.03.2020 at 15:33"
    )
    private val textOutfiter = arrayListOf<String>(
        "Good width as I have wide feet and find it hard to get comfortable shoes.",
        "Good width as I have wide feet and find it hard to get comfortable shoes.",
        "Good width as I have wide feet and find it hard to get comfortable shoes.",
        "Good width as I have wide feet and find it hard to get comfortable shoes.",
        "Good width as I have wide feet and find it hard to get comfortable shoes.",
        "Good width as I have wide feet and find it hard to get comfortable shoes.",
        "Good width as I have wide feet and find it hard to get comfortable shoes."
    )


    inner class ViewHolder(val binding: CommentdesignBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //   val v = LayoutInflater.from(parent.context).inflate(R.layout.clothingdesign, parent, false)
        //   return ViewHolder(v)

        val binding = CommentdesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return Imageprofile.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.ivUserProfile.setImageResource(Imageprofile[position])
        holder.binding.tvUserName.text=textName[position]
        holder.binding.textdate.text=textOutfit[position]
        holder.binding.tvComment.text=textOutfiter[position]


    }
}