package com.example.myprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myprimeiroapp.databinding.ActivityGreeterBinding

class GreeterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGreeterBinding
    private val listanomes = mutableListOf<String>()
    private var indiceAtual = 0
    private lateinit var greeterAtual: GreeterTipo1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeterBinding.inflate(layoutInflater)
        //---------------------------------------
        //configuração de variações globais da tela

        val greeter1 = GreeterTipo1("0lá","!")
        val greeter2 = GreeterTipo1("bem vindo","!!")
        val greeter3 = GreeterTipo1("tudo bem", "!!!")
        greeterAtual = greeter1
        listanomes.add("keitiane")
        listanomes.add("juliana")
        listanomes.add("keite")
        listanomes.add("diemenson")
        listanomes.add("diego")

        // configuração de botões
        binding.btImprimirGreeter.setOnClickListener {
            val NomeAtual = listanomes[indiceAtual]
            binding.txtSaidaGreeter.text = greeterAtual.greeter(NomeAtual)
            if(indiceAtual == listanomes.size -1) {
                indiceAtual = 0
            } else {
                indiceAtual++
            }

        }
        binding.btTrocarGreeter.setOnClickListener {

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