package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sectog.adapter.*
import com.example.sectog.databinding.FragmentCategories2Binding

class Categories2 : Fragment() {
    //  private var recyclerviewClothing: RecyclerView? = null
    private var binding: FragmentCategories2Binding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategories2Binding.inflate(inflater, container, false)    //binding
        return binding?.root

    }
//        // adapter 1
//        recyclerviewClothing = rootView.findViewById(R.id.rvClothing1) as RecyclerView
//        recyclerviewClothing!!.layoutManager = LinearLayoutManager(activity)
//        recyclerviewClothing!!.setLayoutManager(
//            LinearLayoutManager(
//                activity,
//                LinearLayoutManager.HORIZONTAL,
//                true
//            )
//        )
//        recyclerviewClothing!!.adapter = AdapterClothing()
//
//
//        // adapter 2
//
//
//        recyclerviewClothing = rootView.findViewById(R.id.rvShoes) as RecyclerView
//        recyclerviewClothing!!.layoutManager = LinearLayoutManager(activity)
//        recyclerviewClothing!!.setLayoutManager(
//            LinearLayoutManager(
//                activity,
//                LinearLayoutManager.HORIZONTAL,
//                true
//            )
//        )
//        recyclerviewClothing!!.adapter = AdapterShoes()
//
//        // adapter 3
//
//
//        recyclerviewClothing = rootView.findViewById(R.id.rvAcc) as RecyclerView
//        recyclerviewClothing!!.layoutManager = LinearLayoutManager(activity)
//        recyclerviewClothing!!.setLayoutManager(
//            LinearLayoutManager(
//                activity,
//                LinearLayoutManager.HORIZONTAL,
//                true
//            )
//        )
//        recyclerviewClothing!!.adapter = AdapterAcc()
//
//
//
//
//
//        return rootView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //adapter 1
        binding?.rvClothing1?.layoutManager = LinearLayoutManager(activity) // binding
        binding?.rvClothing1?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            true
        )
        binding?.rvClothing1?.adapter = AdapterClothing()

        // adapter 2
        binding?.rvShoes?.layoutManager = LinearLayoutManager(activity) // binding
        binding?.rvShoes?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            true
        )
        binding?.rvShoes?.adapter = AdapterShoes()

        // adapter 3
        binding?.rvAcc?.layoutManager = LinearLayoutManager(activity) // binding
        binding?.rvAcc?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            true
        )
        binding?.rvAcc?.adapter = AdapterAcc()
    }
}








