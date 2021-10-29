package com.example.myapptextr10.greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityGreeter1Binding

class Greeter1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityGreeter1Binding
    private val listaNomes = mutableListOf<String>()
    private var indidiceAtual = 0
    private lateinit var greeterAtual: GreeterTipo1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeter1Binding.inflate(layoutInflater)
        //---------------------------------------
        //configuração de variações globais da tela

        val greeter1 = GreeterTipo1("0lá","!")
        val greeter2 = GreeterTipo1("bem vindo","!!")
        val greeter3 = GreeterTipo1("tudo bem", "!!!")
        greeterAtual = greeter1
        listaNomes.add("keitiane")
        listaNomes.add("juliana")
        listaNomes.add("keite")
        listaNomes.add("diemenson")
        listaNomes.add("diego")

        // configuração de botões
        binding.btImprimir.setOnClickListener {
            val NomeAtual = listaNomes[indidiceAtual]
            binding.txtSaida.text = greeterAtual.greeter(NomeAtual)
            if(indidiceAtual == listaNomes.size -1) {
                indidiceAtual = 0
            } else {
                indidiceAtual++
            }

        }
        binding.btTrocarGree.setOnClickListener {

            if(greeterAtual == greeter1) {
                greeterAtual = greeter2
                binding.txtNumero.text = "2"
            } else if(greeterAtual == greeter2){
                greeterAtual = greeter3
                binding.txtNumero.text = "3"
            } else{
                greeterAtual = greeter1
                binding.txtNumero.text = "1"

            }
        }



        setContentView(binding.root)
    }
}