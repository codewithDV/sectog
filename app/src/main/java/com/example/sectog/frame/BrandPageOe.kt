package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sectog.R
import com.example.sectog.databinding.FragmentBrandPageOeBinding


class BrandPageOe : Fragment() {

    private var binding: FragmentBrandPageOeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBrandPageOeBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*ivGrid3.setOnClickListener {
            val navController = Navigation.findNavController(rootViewSub)
            navController.navigate(R.id.action_subCatFrame_to_brandpage1)
            //Navigation.findNavController(rootViewSub).navigate(R.id.action_categories2_to_subCatFrame)

        }*/

        //on click one act to other
        binding?.ivGrid3?.setOnClickListener {
//          view.findViewById<ImageView>(R.id.ivGrid3).setImageResource(R.drawable.griddd)
            //  view.findNavController().navigate(R.id.action_subCatFrame_to_brandPageOe)
            binding?.ivGrid3?.setImageResource(R.drawable.griddd)




        }


    }
}
