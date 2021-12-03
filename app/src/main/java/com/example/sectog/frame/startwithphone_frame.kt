package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.sectog.R
import com.example.sectog.databinding.FragmentSigninFrameBinding
import com.example.sectog.databinding.FragmentStartwithphoneFrameBinding
import com.example.sectog.databinding.FragmentWalkthrughFrameBinding


class startwithphone_frame : Fragment() {
    private var binding: FragmentStartwithphoneFrameBinding? = null


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
        binding = FragmentStartwithphoneFrameBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.donebut?.setOnClickListener {
            view.findNavController().navigate(R.id.action_startwithphone_frame_to_verification_frame)
        }


    }
}