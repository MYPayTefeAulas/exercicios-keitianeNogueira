package com.example.myprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myprimeiroapp.databinding.ActivityGreeeter2Binding

class Greeeter2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityGreeeter2Binding
    private var listapessoa = mutableListOf<Pessoas>()
    private  var indiceAtual2 = 0
    private var nome = ""
    private var idade = 0
    private lateinit var greeterAtual2 : GreeterTipo2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeeter2Binding.inflate(layoutInflater)
        val greeter1 = GreeterTipo2("oi","!")
        val greeter2 = GreeterTipo2("bem vindo", "!!")
        val greeter3 = GreeterTipo2("como você esta", "!!!")

        binding.btImprimirP.setOnClickListener {

            val pessoaAtual2 = listapessoa[indiceAtual2]
            binding.txtSaidaP.text = greeterAtual2.greeter2(pessoaAtual2)
            if(indiceAtual2 == listapessoa.size) {
                indiceAtual2 = 0
            } else{
                indiceAtual2++
            }
        }
        binding.btTrocarP.setOnClickListener {
            if(greeterAtual2 == greeter1) {
                greeterAtual2 = greeter2
                binding.txtNumeroGreeterPe.text = "2"
            } else if(greeterAtual2 == greeter2){
                greeterAtual2 = greeter3
                binding.txtNumeroGreeterPe.text = "3"
            } else{
                greeterAtual2 = greeter1
                binding.txtNumeroGreeterPe.text = "1"

            }
            binding.btSalvap.setOnClickListener {
                nome = binding.txtNome2.text.toString()
                binding.txtNome2.text.clear()
                idade = binding.txtIdade2.toString().toInt()
                binding.txtIdade2.text.clear()
                val pessoa = Pessoas(nome,idade)
                listapessoa.add(pessoa)


            }
        }


        setContentView(binding.root)
        }


    }

