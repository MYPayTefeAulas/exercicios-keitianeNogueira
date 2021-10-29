package com.example.myapptextr10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityLista2Binding


class listaActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityLista2Binding

    private val listaFrutas = listOf("maça", "mamão", "abacate")
    private val listaVegetais = listOf("pipino", "alface", "cebola")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLista2Binding.inflate(layoutInflater)

        binding.btanalisar.setOnClickListener {
            binding.txtsaida.text= analisa(binding.txtentrada.text.toString())
        }

        setContentView(binding.root)
    }
    fun analisa(entrada: String): String {
        var saida= ""

        for(frutas in listaFrutas) {
            if(frutas == entrada) {
                saida= "é um frutas"
                break
            }
            for(vegetais in listaVegetais) {
                if(vegetais== entrada) {
                    saida= "é um vegetal"
                    break
                }
                if(saida==""){
                    saida= "não sei o que é isso"
                }
            }
        }
        return saida
    }

}