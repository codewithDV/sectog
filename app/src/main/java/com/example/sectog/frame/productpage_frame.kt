package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sectog.adapter.AdapterCom
import com.example.sectog.adapter.MayLike_Adapter
import com.example.sectog.databinding.FragmentProductpageFrameBinding

class productpage_frame : Fragment() {

    private var binding: FragmentProductpageFrameBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductpageFrameBinding.inflate(inflater, container, false) //binding
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //direct adapt call in xml
        binding?.apply {
            rvc.adapter = AdapterCom()
        }

        // adpter 2
        binding?.rvClassic?.layoutManager = LinearLayoutManager(activity) // binding
        binding?.rvClassic?.layoutManager = LinearLayoutManager(
            activity,
            LinearLayoutManager.HORIZONTAL,
            true
        )
        binding?.rvClassic?.adapter = MayLike_Adapter()
    }


}