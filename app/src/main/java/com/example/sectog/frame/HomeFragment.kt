package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sectog.R
import com.example.sectog.adapter.*
import com.example.sectog.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
//    private var recyclerviewProducts: RecyclerView? = null
//    private var recyclerviewnewarrivals: RecyclerView? = null
//    private var recyclerViewSecond: RecyclerView? = null
//    private var recyclerViewShowAll: RecyclerView? = null
//    private var recycleHistory: RecyclerView? = null

    private var binding: FragmentHomeBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {

        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        binding = fragment_filtert.inflate(layoutInflater)
//        mergeBinding=LayoutToolbarBackBinding.bind(binding.root)
        binding = FragmentHomeBinding.inflate(inflater, container, false) //binding
        return binding?.root

    }

//    recyclerviewProducts = rootView.findViewById(R.id.rvNewcoll) as RecyclerView // Add this
//    recyclerviewProducts!!.layoutManager = LinearLayoutManager(activity)
//    // recycle for horizontal view
//    recyclerviewProducts!!.setLayoutManager(
//    LinearLayoutManager(
//    activity,
//    LinearLayoutManager.HORIZONTAL,
//    true
//    )
//    )
//    recyclerviewProducts!!.adapter = WelcomeAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding?.rvNewcoll?.layoutManager = LinearLayoutManager(activity) // binding
        binding?.rvNewcoll?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            true
        )
        binding?.rvNewcoll?.adapter = WelcomeAdapter()
        // recycleview 2

        binding?.rvnewar1?.layoutManager = LinearLayoutManager(activity) // binding
        binding?.rvnewar1?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            true
        )
        binding?.rvnewar1?.adapter = NewArrivalsAdapter()
        //recyclerview 3
        binding?.rvnewar2?.layoutManager = LinearLayoutManager(activity) // binding
        binding?.rvnewar2?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            true
        )
        binding?.rvnewar2?.adapter = NewArrivalSecondAdapter()
        //  recycle view 4

//        recyclerViewShowAll = rootView.findViewById(R.id.rvnewar3) as RecyclerView // Add this
//         recyclerViewShowAll!!.layoutManager = LinearLayoutManager(activity)
//      recyclerViewShowAll!!.adapter = WelcomeShowAadapter()


        binding?.rvnewar3?.layoutManager = LinearLayoutManager(activity)
        binding?.rvnewar3?.adapter = WelcomeShowAadapter()
        // recucle view 5

        binding?.rvnewar4?.layoutManager = LinearLayoutManager(activity) // binding
        binding?.rvnewar4?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            true
        )
        binding?.rvnewar4?.adapter = HistoryAdapter()


        // click to navigate other frame

        binding?.include2?.ivLikw?.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_fragment_filtert)
        }
        binding?.include2?.tvBack?.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_search_frame)
        }


    }

}


//        //recyclerview 3
//
//        recyclerViewSecond = rootView.findViewById(R.id.rvnewar2) as RecyclerView
//        recyclerViewSecond!!.layoutManager = LinearLayoutManager(activity)
//        recyclerViewSecond!!.setLayoutManager(
//            LinearLayoutManager(
//                activity,
//                LinearLayoutManager.HORIZONTAL,
//                true
//            )
//        )
//        recyclerViewSecond!!.adapter = NewArrivalSecondAdapter()
//
//
//        //  recycle view 4
//
//        recyclerViewShowAll = rootView.findViewById(R.id.rvnewar3) as RecyclerView // Add this
//        recyclerViewShowAll!!.layoutManager = LinearLayoutManager(activity)
//        recyclerViewShowAll!!.adapter = WelcomeShowAadapter()
//
//      return rootView




