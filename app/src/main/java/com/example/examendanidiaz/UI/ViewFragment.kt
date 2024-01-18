package com.example.examendanidiaz.UI


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examendanidiaz.R
import com.example.examendanidiaz.databinding.FragmentViewBinding
import com.example.examendanidiaz.viewmodel.ViewViewModel

class ViewFragment : Fragment() {



    private lateinit var viewModel: ViewViewModel
    private lateinit var binding: FragmentViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentViewBinding.inflate(layoutInflater)



        return binding.root
    }



}