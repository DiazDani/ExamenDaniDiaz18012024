package com.example.examendanidiaz.UI


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examendanidiaz.R
import com.example.examendanidiaz.adapter.AlumneAdapter
import com.example.examendanidiaz.databinding.FragmentViewBinding
import com.example.examendanidiaz.viewmodel.SharedViewModel
import com.example.examendanidiaz.viewmodel.ViewViewModel

class ViewFragment : Fragment() /*, AdapterView.OnItemSelectedListener*/{



    private lateinit var viewModel: ViewViewModel
    private lateinit var binding: FragmentViewBinding
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var sharedViewModel: SharedViewModel

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentViewBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(ViewViewModel::class.java)

        viewManager = LinearLayoutManager(context)
        recyclerView= binding.recyclerView3.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
        }



     val switch=  binding.switch1

       switch.setOnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                viewModel.getApproved(requireContext())?.observe(viewLifecycleOwner, Observer { moblesLlistat ->
                    moblesLlistat?.let {
                        viewAdapter = AlumneAdapter(it) { selectedItem ->
                            sharedViewModel.setSelectedItem(selectedItem)
                        }
                        recyclerView.adapter = viewAdapter
                    }
                })
            }else{
                viewModel.getFailed(requireContext())?.observe(viewLifecycleOwner, Observer { moblesLlistat ->
                    moblesLlistat?.let {
                        viewAdapter = AlumneAdapter(it) { selectedItem ->
                            sharedViewModel.setSelectedItem(selectedItem)
                        }
                        recyclerView.adapter = viewAdapter
                    }
                })
            }

        }

        binding.button2.setOnClickListener{
            viewModel.getStudients(requireContext())?.observe(viewLifecycleOwner, Observer { moblesLlistat ->
                moblesLlistat?.let {
                    viewAdapter = AlumneAdapter(it) { selectedItem ->
                        sharedViewModel.setSelectedItem(selectedItem)
                    }
                    recyclerView.adapter = viewAdapter
                }
            })
        }


//                val spinner: Spinner = binding.spinner
//                // Create an ArrayAdapter using the string array and a default spinner layout.
//        context?.let {
//            ArrayAdapter.createFromResource(
//                //si n funciona puede que sea por esto
//                it,
//                //si n funciona puede que sea por esto
//
//                R.array.Options,
//                android.R.layout.simple_spinner_item
//            ).also { adapter ->
//                // Specify the layout to use when the list of choices appears.
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//                // Apply the adapter to the spinner.
//                spinner.adapter = adapter
//            }
//        }

        return binding.root
    }

//    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//    }
//
//    override fun onNothingSelected(parent: AdapterView<*>?) {
//
//    }


}