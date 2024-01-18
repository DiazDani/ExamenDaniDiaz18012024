package com.example.examendanidiaz.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Studient")
data class Alumnes(
    @ColumnInfo(name = "Name")
    var Name: String,
    @ColumnInfo(name = "Group")
    var Group: String,
    @ColumnInfo(name = "Grade")
    var Grade: Int,

    ) {
    @PrimaryKey(autoGenerate = true)
    var Id: Int? = null
}
