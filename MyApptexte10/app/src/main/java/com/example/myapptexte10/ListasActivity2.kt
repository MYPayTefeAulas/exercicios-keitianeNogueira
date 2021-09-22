package com.example.myapptexte10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptexte10.databinding.ActivityListasBinding
import com.example.myapptexte10.databinding.ActivityMainBinding

class ListasActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityListasBinding

    private val listaFrutas = listOf("maçã", "mamão", "abacate")
    private val litaVegetais = listOf("pipino", "alface", "pimentão")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListasBinding.inflate(layoutInflater)

        binding.btAnlisa.setOnClickListener {
            binding.textSaida.text = analisa(binding.txtEntrada.text.toString())
        }


        setContentView(binding.root)
    }

    fun analisa(entrada: String): String {
        var saida = ""

        for (fruta in listaFrutas) {
            if (fruta == entrada) {
                saida = "é uma fruta"

            }
            break
        }
        return saida
    }
}

