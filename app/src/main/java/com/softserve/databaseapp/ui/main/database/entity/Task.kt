package com.softserve.databaseapp.ui.main.database.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Task")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val taskId: Int = 0,
    @ColumnInfo(name = "title")
    @NonNull
    var taskTitle: String,
    @ColumnInfo(name = "content")
    @NonNull
    var taskContent: String,
    @NonNull
    @ColumnInfo(name = "priority")
    var taskPriority: Int
)
