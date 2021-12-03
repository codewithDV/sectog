package com.example.sectog.frame
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sectog.adapter.AdapterCatProduct
import com.example.sectog.databinding.FragmentMenu2Binding


class menuFragment : Fragment() {
   // private var recyclerviewProducts: RecyclerView? = null
   private var binding: FragmentMenu2Binding? = null  // bind com.example.sectog.frame layoutfile


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenu2Binding.inflate(inflater, container, false)
        //binding

        return binding?.root


    }

//            adapterset in fragment
//        val rootView = inflater.inflate(R.layout.fragment_menu2, container, false)
//       recyclerviewProducts = rootView.findViewById(R.id.RvProduct1) as RecyclerView // Add this
//       recyclerviewProducts!!.layoutManager = LinearLayoutManager(activity)
//        recyclerviewProducts!!.adapter = AdapterCatProduct()
//        return rootView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


     //   binding?.subCatRv?.layoutManager = GridLayoutManager(globalContext, 2)    // grid recyclerview
     //   binding?.subCatRv?.adapter = SubCatAdapter()
        binding?.RvProduct1?.layoutManager= LinearLayoutManager(activity)     // binding
        binding?.RvProduct1?.adapter= AdapterCatProduct()



    }
}












