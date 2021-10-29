package com.example.myapptextr10.greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityGreeter2Binding

class Greeter2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityGreeter2Binding
    private var listapessoa = mutableListOf<Pessoas>()
    private var indiceAtual2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGreeter2Binding.inflate(layoutInflater)
        ///configurações globaes da tela
        val greeter1 = GreeterTipo2("oi","!")
        val greeter2 = GreeterTipo2("bem vindo", "!!")
        val greeter3 = GreeterTipo2("como você esta", "!!!")
        var greeterAtual2 = greeter1
            binding.btImprimir2.setOnClickListener {

                if(listapessoa.isEmpty()){
                   binding.txtSaida2.text = "Vazio"
                }else{
                    val pessoaAtual2 = listapessoa[indiceAtual2]
                    binding.txtSaida2.text = greeterAtual2.greeter2(pessoaAtual2)
                    if(indiceAtual2 == listapessoa.size - 1) {
                        indiceAtual2 = 0
                    } else{
                        indiceAtual2++
                    }
                }


        }
        binding.btTrocar2.setOnClickListener {
            if(greeterAtual2 == greeter1) {
                greeterAtual2 = greeter2
                binding.txtNumero2.text = "2"
            } else if(greeterAtual2 == greeter2){
                greeterAtual2 = greeter3
                binding.txtNumero2.text = "3"
            } else{
                greeterAtual2 = greeter1
                binding.txtNumero2.text = "1"

            }

        }
binding.btSalvar.setOnClickListener {
    val nome = binding.txtNome2.text.toString()
    binding.txtNome2.text.clear()
    val idade = binding.txtIdade2.text.toString()
    binding.txtIdade2.text.clear()
    val pessoa = Pessoas(nome,idade)
    listapessoa.add(pessoa)
}
        setContentView(binding.root)
    }
}