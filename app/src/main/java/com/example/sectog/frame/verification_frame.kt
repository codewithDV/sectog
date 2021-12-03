package com.example.sectog.frame
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sectog.databinding.FragmentVerificationFrameBinding
import android.content.Intent
import com.example.sectog.MainActivity


class verification_frame : Fragment() {
    private var binding: FragmentVerificationFrameBinding? = null

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
        binding = FragmentVerificationFrameBinding.inflate(inflater, container, false)
        return binding?.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.donebut?.setOnClickListener {
            val i = Intent(context, MainActivity::class.java)   // fragment to activity
            startActivity(i)
            requireActivity().finish()  // it will call activity in which fragment consist and kill it after sucess



        }


    }


}