package com.softserve.databaseapp.ui.main.database.conection

import android.content.ClipData
import androidx.room.*
import com.softserve.databaseapp.ui.main.database.entity.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(task: Task)

    @Update
    suspend fun update(task: Task)

    @Delete
    suspend fun delete(task: Task)


    @Query("SELECT * FROM task ORDER BY TaskId")
    fun getAllTasks(): Flow<List<Task>>
}