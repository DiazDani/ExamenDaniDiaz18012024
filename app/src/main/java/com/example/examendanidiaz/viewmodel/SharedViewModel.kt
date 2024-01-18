package com.example.examendanidiaz.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.examendanidiaz.database.Alumnes


class SharedViewModel : ViewModel(){
    private val _selecteditem = MutableLiveData<Alumnes>()
    val selectedItem: LiveData<Alumnes> get() = _selecteditem

    fun setSelectedItem(item:Alumnes){
        _selecteditem.value=item
    }
}