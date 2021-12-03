package com.example.sectog.frame

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.sectog.R
import com.example.sectog.databinding.FragmentBrandPageOeBinding
import com.example.sectog.databinding.FragmentCartBinding
import com.example.sectog.databinding.FragmentSplashFrameBinding
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging

class splash_frame : Fragment() {
    private var binding: FragmentSplashFrameBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getFcm()
        arguments?.let {

        }
    }

    private fun getFcm() {
        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w(TAG, "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result

            // Log and toast
            Log.d(TAG, "activity here")
            Toast.makeText(context, TAG, Toast.LENGTH_SHORT).show()
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashFrameBinding.inflate(inflater, container, false)    //binding
        return binding?.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        android.os.Handler().postDelayed({
            view.findNavController().navigate(R.id.action_splash_frame_to_signin_frame)
        }, 1000)

    }

}



