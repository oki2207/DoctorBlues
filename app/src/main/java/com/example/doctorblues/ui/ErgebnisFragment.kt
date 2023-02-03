package com.example.doctorblues.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.doctorblues.R
import com.example.doctorblues.data.model.Score
import com.example.doctorblues.databinding.FragmentErgebnisBinding
import java.util.*

class ErgebnisFragment: Fragment() {
    private lateinit var binding: FragmentErgebnisBinding
    private lateinit var resultTextView: TextView
    private val viewModel: ViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_ergebnis, container, false)




        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_ergebnis,
            container, false

        )
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var score: Int = requireArguments().getInt("value")
        binding.textresult.text = "Du hast ${score} Punkte"

        var c=Calendar.getInstance()
        var year:Int = c.get(Calendar.YEAR)
        var month:Int = c.get(Calendar.MONTH)
        var day: Int = c.get(Calendar.DAY_OF_MONTH)
        var today= "${day}.${month+1}.${year}"
        //viewModel.delete()
        viewModel.insertScore(Score(date = today, score = score ))



        if (score <=11) {
            binding.anmerkungtextText.text="Mit $score Punkten scheint es keinen großen Grund zur Sorge zu geben.\n " +
                    "Deine Hormone spielen noch verrückt. Eine Geburt ist eine enmorme Umstellung für deinen Körper.\n" +
                    "Du selbst kennst dich am besten! Wenn du das Gefühl hast es wird tendeziel besser, dann mach weiter wie bisher und du wirst sehen es wird bald noch besser.\n" +
                    "Dann bist du einfach auf einem guten Weg. Bitte gib dir auch Zeit und hab Geduld.\n" +
                    "Natürlich kannst du dennoch professionelle Hilfe über unsere Hilfeseite in Anspruch nehmen.\n" +
                    "Dort wird man sich aufjedenfall um dich kümmern!\n Und denk immer dran.\n Du bist eine ganz tolle Mama!"

        } else if (score >= 12) {
            binding.anmerkungtextText.text="Mit $score Punkten leg ich dir nahe professionelle Hilfe über unsere Seite in Anspruch zu nehmen.\n" +
                    "Über unseren Reiter 'Hilfe' kannst du eine passende Stelle in deiner Umgebung finden.\n" +
                    "Aber das ist kein Grund zur Sorge. Mit den richtigen Menschen an deiner Seite, den Tipps die du hier findest und eine professionelle Hilfestelle\n" +
                    "wird es dir schon sehr bald besser gehen. Ich weiss der Tunnel ist lang und erscheint Endlos.\n" +
                    "Aber irgendwann wirst du blickst du zurück und wirst eines feststellen. Ich bin wieder Gesund.\n" +
                    "Denk immer dran, es ist eine Krankheit und\ndu bist eine tolle Mama!   "

        }

        binding.fertigButton.setOnClickListener {
            findNavController().navigate(
                ErgebnisFragmentDirections.actionErgebnisFragmentToStartFragment()
            )
        }
    }
}



