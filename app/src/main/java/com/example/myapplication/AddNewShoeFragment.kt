package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentAddNewShoeBinding
import com.example.myapplication.moodels.Shoe
import com.example.myapplication.moodels.ShoeListViewModel

class AddNewShoeFragment : Fragment() {
    private val sharedViewModel: ShoeListViewModel by activityViewModels()
    private val newShoe: Shoe = Shoe("",0.0, "","")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentAddNewShoeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_add_new_shoe, container,false)

        binding.shoe = newShoe
        binding.setLifecycleOwner {viewLifecycleOwner.lifecycle}

        binding.addshoe.setOnClickListener { view: View ->

            binding.apply {
                sharedViewModel.addShoe(newShoe)
            }

            view.findNavController().navigateUp()
        }

        binding.cancel.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_addNewShoeFragment_to_shoeDetailsFragment)
        )

        return binding.root
    }
}