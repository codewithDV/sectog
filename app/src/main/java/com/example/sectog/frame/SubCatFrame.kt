package com.example.sectog.frame

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sectog.adapter.SubCatAdapter
import com.example.sectog.databinding.FragmentSubCatFrameBinding


class SubCatFrame : Fragment() {
    //global private context
    private var globalContext: Context? = null

    // binding for fragment
    private var binding: FragmentSubCatFrameBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        //globalcontext
        globalContext = this.activity

        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSubCatFrameBinding.inflate(inflater, container, false)
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
//        val ob = SubCatAdapter()
//        ob.ViewHolder(SubcatdesigngridBinding.bind(view))
//        view.findViewById<ImageView>(R.id.ivSubClothingSubCat)


        binding?.ivGrid3?.setOnClickListener {
            // view.findNavController().navigate(R.id.action_subCatFrame_to_brandPageOe)
            binding?.subCatRv?.layoutManager =
                GridLayoutManager(globalContext, 1)    // grid recyclerview
            val mAdapter=SubCatAdapter()
            binding?.subCatRv?.adapter =mAdapter
            mAdapter.isSingleImageDimension(false)
            //  binding?.ivGrid3?.getLayoutParams()!!.width = 500

        }
        binding?.ivGrid2?.setOnClickListener {
            binding?.subCatRv?.layoutManager =
                GridLayoutManager(globalContext, 1)    // grid recyclerview
            val mAdapter=SubCatAdapter()
            binding?.subCatRv?.adapter =mAdapter
            mAdapter.isSingleImageDimension(true)
        }

        binding?.ivGrid?.setOnClickListener {
            binding?.subCatRv?.layoutManager =
                GridLayoutManager(globalContext, 2)    // grid recyclerview
            binding?.subCatRv?.adapter = SubCatAdapter()
        }
//            binding?.info?.setVisibility(View.INVISIBLE);
        // on click navigate
        //navController!!.navigate(R.id.action_subCatFrame_to_brandpage1)

//        binding?.ivGrid3?.setOnClickListener {
//            binding?.ivGrid3?.setImageResource(R.drawable.avtar2)
//        }

        // Inflate the layout for this fragment
        // val rootViewSub = inflater.inflate(R.layout.fragment_sub_cat_frame, container, false)
        //   recyclerviewSubCat!!.layoutManager = LinearLayoutManager(activity)
        //grid recycler view code
        //grid requried global context
        binding?.subCatRv?.layoutManager =
            GridLayoutManager(globalContext, 2)    // grid recyclerview
        binding?.subCatRv?.adapter = SubCatAdapter()




    }

}
