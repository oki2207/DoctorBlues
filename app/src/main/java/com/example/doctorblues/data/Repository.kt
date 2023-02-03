package com.example.doctorblues.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.doctorblues.data.local.ScoreDatabase
import com.example.doctorblues.data.model.Contacts
import com.example.doctorblues.data.model.Questions
import com.example.doctorblues.data.model.Score
import com.example.doctorblues.data.model.User
import com.example.doctorblues.data.remote.Api

class Repository (private val database:ScoreDatabase) {


    private val _contacts = MutableLiveData<List<Contacts>>()
    val contacts: LiveData<List<Contacts>>
        get() = _contacts

    private val _user = MutableLiveData<List<User>>()
    val user: LiveData<List<User>>
        get() = _user

    private val _questions = MutableLiveData<List<Questions>>() //TODO
    val questions: LiveData<List<Questions>>
        get() = _questions

    val scoreList: LiveData<List<Score>> = database.ScoreDatabaseDao.getAll()

    suspend fun insert(score: Score){
        try {
            database.ScoreDatabaseDao.insertAll(score)
        }catch (e:Exception){
            Log.e("Repo", "Fehler beim einfügen: $e")
        }
    }

    suspend fun delete(){
        try {
            database.ScoreDatabaseDao.delete()
        }catch (e:Exception){
            Log.e("Repo", "Fehler beim löschen: $e")
        }
    }





    var api = Api

    suspend fun getContacts(){
        _contacts.value=api.retrofitService.getContacts()

    }

    suspend fun getQuestion() { //TODO
        _questions.value=api.retrofitService.getQuestion()
    }



}


