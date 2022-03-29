package com.example.aboutme2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

class FragmentTitleBinding : ViewDataBinding() {

}
override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {
    val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
        R.layout.fragment_title,container,false)
    return binding.root
}