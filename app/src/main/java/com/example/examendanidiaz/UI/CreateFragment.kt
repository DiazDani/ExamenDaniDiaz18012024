package com.example.examendanidiaz.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.examendanidiaz.R
import com.example.examendanidiaz.databinding.FragmentCreateBinding
import com.example.examendanidiaz.viewmodel.CreateViewModel

class CreateFragment : Fragment() {

    private lateinit var viewModel: CreateViewModel
    private lateinit var binding: FragmentCreateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCreateBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[CreateViewModel::class.java]

        binding.button.setOnClickListener {

            val name = binding.editTextName.text.toString()
            val group = binding.editTextGroup.text.toString()
            val grade = binding.editTextGrade.text.toString().toInt()

            viewModel.newStudient(requireContext(), name, group,grade)
          Navigation.findNavController(it).navigate(R.id.action_createFragment_to_viewFragment)
        }


        return binding.root
    }


}