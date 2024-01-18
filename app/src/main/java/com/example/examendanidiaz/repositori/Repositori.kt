package com.example.examendanidiaz.repositori

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.examendanidiaz.database.Alumnes
import com.example.examendanidiaz.database.AlumnesDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Repositori {

    companion object {

        var alumneDatabase: AlumnesDatabase? = null

        var alumne: LiveData<List<Alumnes>>? = null




        fun initializeDB(context: Context): AlumnesDatabase {
            return AlumnesDatabase.getDatabase(context)
        }

        //INSERT moble
        fun addAlumn(context: Context, alumnes: Alumnes) {

            alumneDatabase = initializeDB(context)

            CoroutineScope(Dispatchers.IO).launch {
                alumneDatabase!!.AlumnesDAO().addAlum(alumnes)
            }
        }



        //SQL moble
        fun getAllStudients(context: Context): LiveData<List<Alumnes>>? {

            alumneDatabase = initializeDB(context)

            CoroutineScope(Dispatchers.IO).launch {
                alumne = alumneDatabase!!.AlumnesDAO().getAllAlum()
            }
            return alumne
        }

        fun getFailed(context: Context): LiveData<List<Alumnes>>? {

            alumneDatabase = initializeDB(context)

            CoroutineScope(Dispatchers.IO).launch {
                alumne = alumneDatabase!!.AlumnesDAO().getFailed()
            }
            return alumne
        }
        fun getApproved(context: Context): LiveData<List<Alumnes>>? {

            alumneDatabase = initializeDB(context)

            CoroutineScope(Dispatchers.IO).launch {
                alumne = alumneDatabase!!.AlumnesDAO().getApproved()
            }
            return alumne
        }


    }
}