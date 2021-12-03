package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.sectog.R
import com.example.sectog.databinding.FragmentSigninFrameBinding
import com.example.sectog.databinding.FragmentWalkthrughFrameBinding


class walkthrugh_frame : Fragment() {
    private var binding: FragmentWalkthrughFrameBinding? = null


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
        binding = FragmentWalkthrughFrameBinding.inflate(inflater, container, false)
        return binding?.root      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.skipbut?.setOnClickListener {
            view.findNavController().navigate(R.id.action_walkthrugh_frame_to_startwithphone_frame)
        }

    }


}