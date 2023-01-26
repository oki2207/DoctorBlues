package com.example.doctorblues.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.doctorblues.data.Repository
import com.example.doctorblues.data.User
import kotlinx.coroutines.launch

const val TAG = "ViewModel"

open class ViewModel : ViewModel() {

    private val repository = Repository()

    val contacts = repository.contacts
    val questions = repository.questions
    val user = repository.user


            fun getContacts() {
                viewModelScope.launch {
                    repository.getContacts()



                        }
                    }

    fun getQuestion() {
        viewModelScope.launch {
            repository.getQuestion()
        }
    }
}



