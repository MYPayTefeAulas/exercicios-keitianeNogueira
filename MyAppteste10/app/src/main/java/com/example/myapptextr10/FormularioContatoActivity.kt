package com.example.myapptextr10

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityFormularioContatoBinding

class FormularioContatoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFormularioContatoBinding
    private val listaContatos2 = mutableListOf<Contato2>()
    private var indiceAtul = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFormularioContatoBinding.inflate(layoutInflater)

//        val nome: String = intent.getStringExtra("nome")!!
//        val telefone: String = intent.getStringExtra("telefone")!!
        var contatoAtual: Contato2? = intent.getParcelableExtra<Contato2>("Contato")
        if (contatoAtual != null) {
            binding.txtNomeA2.setText(contatoAtual.nome)
            binding.txtTelfoneA2.setText(contatoAtual.telefone)
        }



        binding.btDeletar2.setOnClickListener {
            if (deletarContato2()) {
                binding.txtNomeA2.text.clear()
                binding.txtTelfoneA2.text.clear()
                contatoAtual = null
            }


        }
        binding.btSlvaA2.setOnClickListener {
          AgendaDois.listaContato2[indiceAtul].nome = binding.txtNomeA2.text.toString()
            AgendaDois.listaContato2[indiceAtul].telefone = binding.txtTelfoneA2.text.toString()


        }

        setContentView(binding.root)
    }
    fun Pessoas(): String {
        if(indiceAtul>= listaContatos2.size)
            indiceAtul=0
        val pessoaAtual= listaContatos2[indiceAtul]
        indiceAtul++
        return "Nome: ${pessoaAtual.nome}, telefine: ${pessoaAtual.telefone}"
    }
    

    fun deletarContato2(): Boolean {
        if (indiceAtul >= 1) {
            indiceAtul -= 1
            val contatoAtual = listaContatos2[indiceAtul]
            listaContatos2.remove(contatoAtual)
        } else {
            val contatoAtual = listaContatos2[indiceAtul]
            listaContatos2.remove(contatoAtual)
        }
        return false
    }
    



    }