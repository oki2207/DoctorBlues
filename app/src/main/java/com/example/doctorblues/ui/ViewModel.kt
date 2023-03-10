package com.example.doctorblues.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.doctorblues.data.Repository
import com.example.doctorblues.data.local.getDatabase
import com.example.doctorblues.data.model.Score
import kotlinx.coroutines.launch

const val TAG = "ViewModel"

open class ViewModel(application: Application) : AndroidViewModel(application) {

    private val database = getDatabase(application)
    private val repository = Repository(database)

    var scoreList = repository.scoreList

    fun insertScore(score: Score){
        viewModelScope.launch {
            repository.insert(score)
        }
    }

    fun delete(){
        viewModelScope.launch {
            repository.delete()
        }
    }



    val contacts = repository.contacts
    val questions = repository.questions
    val user = repository.user



    val listesp = listOf<String>(
        "Du bist eine tolle Mama",
        "Kopf hoch, alles wird gut!",
        "Steinige Wege führen meist zu den schönsten Orten.",
        "Der Schmerz von Heute ist die Stärke von Morgen.",
        "Halte durch, ich weiß wie stark du bist. Es wird dir bald wieder besser gehen.",
        "In Gedanken umarme ich dich und wünsche dir von Herzen gute Besserung."
    )



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



