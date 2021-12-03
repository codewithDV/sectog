package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.sectog.R
import com.example.sectog.databinding.FragmentSigninFrameBinding

class signin_frame : Fragment() {
    private var binding: FragmentSigninFrameBinding? = null


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
        binding = FragmentSigninFrameBinding.inflate(inflater, container, false)
        return binding?.root           }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.btSignup?.setOnClickListener {
            view.findNavController().navigate(R.id.action_signin_frame_to_signup_frame)
        }

    }


}