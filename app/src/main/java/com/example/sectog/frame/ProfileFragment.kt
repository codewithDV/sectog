package com.example.sectog.frame
import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.sectog.R
import com.example.sectog.databinding.FragmentProfileBinding

class profileFragment : Fragment() {
    private var binding: FragmentProfileBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileBinding.inflate(inflater, container, false) //binding
        return binding?.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.ivCardInag?.setOnClickListener {
            view.findNavController().navigate(R.id.action_profileFragment_to_payment_frame)
        }
        binding?.ivPersonName?.setOnClickListener {
            view.findNavController().navigate(R.id.action_profileFragment_to_fragLikeNav)
        }
        binding?.ivTperson?.setOnClickListener {
            view.findNavController().navigate(R.id.action_profileFragment_to_cartFragment)
        }
       binding?.ivBackProfile?.setOnClickListener {
           dialogCall()
       }
    }

    private fun dialogCall() {
        val builder = AlertDialog.Builder(activity)
        //set title for alert dialog
        builder.setTitle("SectoG")
        //set message for alert dialog
        builder.setMessage("Do you want Exit ?")
        builder.setIcon(android.R.drawable.ic_dialog_alert)

        //performing positive action
        builder.setPositiveButton("Yes"){dialogInterface, which ->
            activity?.finish()
            System.exit(0)
        }
        //performing cancel action
        builder.setNeutralButton("Cancel"){dialogInterface , which ->
            Toast.makeText(activity,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
        }
        //performing negative action
        builder.setNegativeButton("No"){dialogInterface, which ->
            Toast.makeText(activity,"clicked No",Toast.LENGTH_LONG).show()
        }
        // Create the AlertDialog
        val alertDialog: AlertDialog = builder.create()
        // Set other dialog properties
        alertDialog.setCancelable(false)
        alertDialog.show()
    }

}




