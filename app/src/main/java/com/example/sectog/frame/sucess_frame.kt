package com.example.sectog.frame
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sectog.databinding.FragmentSucessFrameBinding

class sucess_frame : Fragment() {
   private var binding: FragmentSucessFrameBinding? = null


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
        binding = FragmentSucessFrameBinding.inflate(inflater, container, false)
        return binding?.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }


}