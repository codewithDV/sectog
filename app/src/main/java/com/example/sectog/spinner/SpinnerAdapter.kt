package com.example.sectog.spinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.sectog.R
import com.example.sectog.databinding.DesignforspinnerBinding
import com.example.sectog.databinding.SubcatdesigngridBinding

class SpinnerAdapter (context: Context, countryList: List<Country>) : ArrayAdapter<Country>(context, 0, countryList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View {

        val country = getItem(position)

        //val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.designforspinner, parent, false)


        val binding = DesignforspinnerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        binding.ivBlueChooser.setImageResource(country!!.image)
        return binding.root
    }
}
