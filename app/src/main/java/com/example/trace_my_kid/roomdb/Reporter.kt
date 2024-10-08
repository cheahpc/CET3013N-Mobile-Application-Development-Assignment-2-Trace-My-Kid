package com.example.trace_my_kid.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reporter")
class Reporter(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    var id: Int? = null,

    @ColumnInfo(name="name")
    var name: String,

    @ColumnInfo(name="age")
    var age: Int?,

    @ColumnInfo(name="relationship")
    var relationship: String
) {

}