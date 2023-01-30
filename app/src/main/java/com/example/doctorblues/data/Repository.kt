package com.example.doctorblues.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.doctorblues.data.model.Contacts
import com.example.doctorblues.data.model.Questions
import com.example.doctorblues.data.model.User
import com.example.doctorblues.data.remote.Api

class Repository {
    private val _contacts = MutableLiveData<List<Contacts>>()
    val contacts: LiveData<List<Contacts>>
        get() = _contacts

    private val _user = MutableLiveData<List<User>>()
    val user: LiveData<List<User>>
        get() = _user

    private val _test = MutableLiveData<List<Questions>>()
    val questions: LiveData<List<Questions>>
    get() = _test


    var api = Api

    suspend fun getContacts(){
        _contacts.value=api.retrofitService.getContacts()

    }

    suspend fun getQuestion() {
        _test.value=api.retrofitService.getQuestion()
    }

}





