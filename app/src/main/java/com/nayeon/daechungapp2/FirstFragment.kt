package com.nayeon.daechungapp2
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.nayeon.daechungapp2.R
import androidx.fragment.app.FragmentTransaction

import com.nayeon.daechungapp2.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)


        val service_btn: Button = view.findViewById(R.id.service_btn)

        service_btn.setOnClickListener {


            findNavController().navigate(R.id.service_job_fragment)
        }




        return view
    }


}



