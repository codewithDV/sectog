package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.sectog.R
import com.example.sectog.databinding.FragmentFiltertBinding


class fragment_filtert : Fragment() {

    private var binding: FragmentFiltertBinding? = null

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
        binding = FragmentFiltertBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.Dsign4?.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment_filtert_to_filter2_frame)
        }

    }

}