package com.example.examendanidiaz.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AlumnesDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addAlum(alumnes: Alumnes)


    @Query("SELECT * FROM Studient ORDER BY Name DESC")
    fun getAllAlum(): LiveData<List<Alumnes>>



    @Query("SELECT * FROM Studient WHERE Grade<5 ORDER BY Name DESC")
    fun getFailed(): LiveData<List<Alumnes>>

    @Query("SELECT * FROM Studient WHERE  Grade>=5 ORDER BY Name DESC")
    fun getApproved(): LiveData<List<Alumnes>>
}