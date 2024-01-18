package com.example.examendanidiaz.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.examendanidiaz.database.Alumnes
import com.example.examendanidiaz.repositori.Repositori

class ViewViewModel : ViewModel() {
    fun getStudients(context: Context): LiveData<List<Alumnes>>? {
        return Repositori.getAllStudients(context)
    }

    fun getApproved(context: Context): LiveData<List<Alumnes>>? {
        return Repositori.getApproved(context)
    }

    fun getFailed(context: Context): LiveData<List<Alumnes>>? {
        return Repositori.getFailed(context)
    }
}