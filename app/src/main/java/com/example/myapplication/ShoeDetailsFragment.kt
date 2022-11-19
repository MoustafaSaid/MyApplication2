package com.example.myapplication

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentShoeDetailsBinding
import com.example.myapplication.databinding.ShoesLayoutBinding
import com.example.myapplication.moodels.Shoe
import com.example.myapplication.moodels.ShoeListViewModel

class ShoeDetailsFragment : Fragment() {
    private val sharedViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentShoeDetailsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_details, container, false
        )


        binding.lifecycleOwner = this

        sharedViewModel.shoeListLiveData.observe(viewLifecycleOwner, Observer { shoeList ->

            for (item in shoeList) {

                val shoeItem = ShoesLayoutBinding.inflate(layoutInflater)

                shoeItem.shoe = item
                binding.mainLayout.addView(shoeItem.root)
            }
        })

        binding.floatingActionButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_shoeDetailsFragment_to_addNewShoeFragment)
        )

        return binding.root

    }

}