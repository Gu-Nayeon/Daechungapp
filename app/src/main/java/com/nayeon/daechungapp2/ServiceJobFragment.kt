package com.nayeon.daechungapp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ServiceJobFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_service_job, container, false)

        val service_support_btn: Button = view.findViewById(R.id.service_support_btn)
        val service_plan_btn: Button = view.findViewById(R.id.service_plan_btn)


        service_support_btn.setOnClickListener {


            findNavController().navigate(R.id.service_support_fragment)
        }

        service_plan_btn.setOnClickListener {


            findNavController().navigate(R.id.service_plan_fragment)
        }




        return view
    }


}