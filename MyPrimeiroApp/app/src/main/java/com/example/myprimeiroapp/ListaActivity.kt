package com.example.myprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myprimeiroapp.databinding.ActivityListaBinding

class ListaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListaBinding

    private val listasfrutas = listOf("maça", "banana", "abacaxi", "abacate")
    private val listasvegetais = listOf("pipino", "alface", "pimentão ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListaBinding.inflate(layoutInflater)

        binding.btAnalisar.setOnClickListener {

            binding.txtSaidaLista.text = analisar(binding.txtEntrada.text.toString())
        }

        setContentView(binding.root)
    }
    fun analisar(entrada: String):String{
        var saida = ""

//        var  encontrouAlimento = false

        for (fruta in listasfrutas){
            if (fruta == entrada) {
                saida = "É uma fruta"
//                encontrouAlimento = true
            }
            break
        }
        for (vegetal in listasvegetais){
            if ( vegetal == entrada){
                saida ="E um vegetal"
//                encontrouAlimento = true
            }
            break
        }
//        if (encontrouAlimento){
//            saida = "Não sei o que é isso!"
//        }

        return saida
    }

}