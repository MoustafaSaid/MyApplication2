package com.example.myapplication.moodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeListViewModel:ViewModel() {
    private  val  _shoeList=MutableLiveData<MutableList<Shoe>>(mutableListOf())
    val shoeListLiveData:LiveData<MutableList<Shoe>>
       get()=_shoeList

    private  var shoeList= mutableListOf<Shoe>()
    init {
        _shoeList.value=shoeList
    }
    fun addShoe(shoe: Shoe){
        _shoeList.value!!.add(shoe)
    }
}