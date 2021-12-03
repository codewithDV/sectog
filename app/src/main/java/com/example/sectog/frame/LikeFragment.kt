package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sectog.adapter.LikeAdapter
import com.example.sectog.databinding.FragmentLikeBinding

class LikeFragment : Fragment() {
    //private var recycleLike: RecyclerView? = null
    private var binding:FragmentLikeBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLikeBinding.inflate(inflater, container, false)    //binding
        return binding?.root

    }

//        val rootView = inflater.inflate(R.layout.fragment_like, container, false)
//
//        recycleLike = rootView.findViewById(R.id.rvWishList) as RecyclerView // Add this
//        recycleLike!!.layoutManager = LinearLayoutManager(activity)
//        recycleLike!!.adapter = LikeAdapter()
//
//        return rootView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.rvWishList?.layoutManager= LinearLayoutManager(activity)     // binding
        binding?.rvWishList?.adapter= LikeAdapter()


    }
}





