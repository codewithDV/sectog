package com.example.sectog.adapter
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.sectog.R
import com.example.sectog.databinding.CatproductdesignBinding


class AdapterCatProduct : RecyclerView.Adapter<AdapterCatProduct.ViewHolder>() {

    // pass context
    private var context: Context? = null

    private val name =
        arrayOf("Clothing", "Clothing", "Clothing", "Clothing", "Clothing", "Clothing", "Clothing")
    private val text = arrayOf<String>(
        "5287 items",
        "5287 items",
        "5287 items",
        "5287 items",
        "5287 items",
        "5287 items",
        "5287 items"
    )
    private val Image = arrayOf<Int>(
        R.drawable.clothingcat, R.drawable.bag, R.drawable.watch,
        R.drawable.clothingcat, R.drawable.bag, R.drawable.watch, R.drawable.watch
    )


    // binding

    inner class ViewHolder(val binding:CatproductdesignBinding) : RecyclerView.ViewHolder(binding.root),
        View.OnClickListener {
        private val ivUserProfilePicture = itemView.findViewById<ImageView>(R.id.ivClothCat1)
        private val tvUserName = itemView.findViewById<TextView>(R.id.tvClothing1)
        private val ivcatnext = itemView.findViewById<ImageView>(R.id.ivcatnext)

        // on click inside init//


        init {
            ivcatnext.setOnClickListener {
                val navController = Navigation.findNavController(itemView)
                navController.navigate(R.id.action_menuFragment_to_categories2)
            }

            tvUserName.setOnClickListener {
                Log.e("AdapterCatProduct", "User Name Clicked...")
            }
        }

        override fun onClick(v: View?) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // context
        context = parent.context
       // val v = LayoutInflater.from(parent.context).inflate(R.layout.catproductdesign, parent, false)
       // return ViewHolder(v)
        // binding for id
        val binding = CatproductdesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvClothing1.text = name[position]
        holder.binding.tvCloItems2.text = text[position]
        holder.binding.ivClothCat1.setImageResource(Image[position])


    }
}
