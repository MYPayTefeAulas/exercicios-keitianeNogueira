package com.example.myprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myprimeiroapp.databinding.ActivityPessoas2Binding

class Pessoas2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPessoas2Binding
    private var nome = ""
    private var idade = 0


    private val listaPessoas = mutableListOf<Pessoa>()
    private var indiciAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoas2Binding.inflate(layoutInflater)

        binding.btImprimir.setOnClickListener {
            binding.txtSaida.text = ImprimirPessoas()
        }
        binding.btsalva.setOnClickListener {
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            idade = binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()

            val pessoas = Pessoa(nome, idade)
            listaPessoas.add(pessoas)
        }
        setContentView(binding.root)
    }
    fun ImprimirPessoas(): String {
        if(indiciAtual >= listaPessoas.size)
            indiciAtual = 0
        val pessoaAtual = listaPessoas[indiciAtual]
        indiciAtual++
        return "Nome: ${pessoaAtual.nome}, Idade: ${pessoaAtual.idade}"
    }
}