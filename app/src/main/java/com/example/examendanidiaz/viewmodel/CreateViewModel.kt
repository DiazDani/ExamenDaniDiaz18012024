package com.example.examendanidiaz.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.examendanidiaz.database.Alumnes
import com.example.examendanidiaz.repositori.Repositori

class CreateViewModel : ViewModel() {

    fun newStudient(context: Context, name:String,group:String, grade:Int) {

        var alumne = Alumnes(name,group,grade)
        Repositori.insertMoble(context,alumne)
    }

}