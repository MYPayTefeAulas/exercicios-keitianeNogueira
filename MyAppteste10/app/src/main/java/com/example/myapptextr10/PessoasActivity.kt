package com.example.myapptextr10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityMainBinding
import com.example.myapptextr10.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPessoasBinding
    private var nome= ""
    private var idade= 0

    private val listaPessoas= mutableListOf<pessoa >()
    private var indiceAtual= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoasBinding.inflate(layoutInflater)
        binding.txtImprimi.setOnClickListener {
            binding.txtsaida.text= Pessoas()
        }
        binding.btSalva.setOnClickListener {
            nome= binding.textNome.text.toString()
            binding.textNome.text.clear()
            idade= binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()

            val pessoa= pessoa(nome,idade)
            listaPessoas.add(pessoa)

        }

        setContentView(binding.root)
    }
    fun Pessoas(): String {
        if(indiceAtual>= listaPessoas.size)
            indiceAtual=0
        val pessoaAtual= listaPessoas[indiceAtual]
        indiceAtual++
        return "Nome: ${pessoaAtual.nome}, Idade: ${pessoaAtual.idade}"
    }
}