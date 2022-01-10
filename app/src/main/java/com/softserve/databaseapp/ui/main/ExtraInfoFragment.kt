package com.softserve.databaseapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.softserve.databaseapp.R
import com.softserve.databaseapp.databinding.FragmentExtraInfoBinding
import com.softserve.databaseapp.ui.main.database.conection.TaskDatabase
import com.softserve.databaseapp.ui.main.database.entity.Task
import kotlinx.coroutines.*

class ExtraInfoFragment : Fragment() {

    val database: TaskDatabase by lazy {
        TaskDatabase.getDatabase(this.requireContext())
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentExtraInfoBinding.inflate(inflater)
        binding.extraInfoButton.setOnClickListener {
            insertItem(binding)
        findNavController().navigate(ExtraInfoFragmentDirections.actionExtraInfoFragmentToHomeFragment())
        }

        return binding.root
    }

    private fun insertItem(binding: FragmentExtraInfoBinding) {
        val task = Task(
            taskTitle = binding.inputTitle.text.toString(),
            taskContent = binding.inputTask.text.toString(),
            taskPriority = binding.inputPriority.text.toString().toInt()
        )
        val uiScope = CoroutineScope(Dispatchers.Main + Job())
        uiScope.launch(Dispatchers.IO) {
            database.taskDao().insert(task)
        }
    }

}