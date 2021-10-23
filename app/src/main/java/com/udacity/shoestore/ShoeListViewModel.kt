package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel :ViewModel(){

    var shoeItem: Shoe? = null
    private var shoe = mutableListOf<Shoe>()


    private val _shoes = MutableLiveData<MutableList<Shoe>>()
            val shoes:LiveData<MutableList<Shoe>>
            get() = _shoes

    private val _formIncomplete = MutableLiveData<Boolean>()
    val formIncomplete: LiveData<Boolean>
        get() = _formIncomplete

    private val _detailReturnToList = MutableLiveData<Boolean>()
    val detailReturnToList: LiveData<Boolean>
        get() = _detailReturnToList

    fun addShoe(){
        shoeItem?.let { shoeadd ->
               shoe.add(shoeadd)
                returnToList()
                _shoes.value = shoe

        }


    }
    fun returnToList() {
        _detailReturnToList.value = true
    }

    fun implementNewShoe() {
        shoeItem = Shoe("", "", "", "", emptyList())

    }

    fun finish() {
        _detailReturnToList.value = false
        _formIncomplete.value = false
    }

    fun clearInventory() {
        shoe.clear()
    }





}