package com.example.sectog.frame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sectog.adapter.*
import com.example.sectog.databinding.FragmentFilter2FrameBinding

class filter2_frame : Fragment() {

    private var binding: FragmentFilter2FrameBinding? = null
    var seekBar: SeekBar? = null
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
        binding = FragmentFilter2FrameBinding.inflate(inflater, container, false)    //binding
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        /*    binding?.recycyclesize?.addItemDecoration(
                DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL))  */      //HOORIZONTAL decoration

        // recycle 1
        binding?.recycyclesize?.layoutManager =
            GridLayoutManager(activity, 5)    // grid recyclerview
        binding?.recycyclesize?.adapter = adapterSizeFilter()


        // recycle 1
        binding?.recycyclecolor?.layoutManager =
            GridLayoutManager(activity, 5)    // grid recyclerview
        binding?.recycyclecolor?.adapter = AdapterColor()

        // seekbar
        binding?.seekBar?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                Toast.makeText(activity, "seekbar progress: $progress", Toast.LENGTH_SHORT).show()
                binding?.seekResult?.text = "${progress}"

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })


    }


}
