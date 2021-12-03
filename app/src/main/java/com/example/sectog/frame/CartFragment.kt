package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sectog.R
import com.example.sectog.adapter.AdapterCart
import com.example.sectog.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    // private var recyclerviewProdu: RecyclerView? = null
    private var binding: FragmentCartBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater, container, false)    //binding
        return binding?.root

    }

//
//        recyclerviewProdu = rootView.findViewById(R.id.recycle) as RecyclerView
//
//        recyclerviewProdu!!.layoutManager = LinearLayoutManager(activity)
//
//
//
//        recyclerviewProdu!!.adapter = AdapterCart()
//
//        return rootView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.recycle?.layoutManager = LinearLayoutManager(activity)     // binding
        binding?.recycle?.adapter = AdapterCart()
        binding?.button4?.setOnClickListener {
            view.findNavController().navigate(R.id.action_cartFragment_to_placeOrder_frame)
        }


    }


}