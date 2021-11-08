package com.example.myapptextr10

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityAgenda2Binding

class Agenda2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityAgenda2Binding
    private  val agenda = Agenda2()
    private var contatoAtual: Contato2? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding  = ActivityAgenda2Binding.inflate(layoutInflater)

        AgendaDois.listaContato2.add(Contato2("keitiane", "111"))

        binding.btProximo2.setOnClickListener {
            if(agenda.temContato()){
                val proximoContato: Contato2 = agenda.getProximoContato()
                val novoTexto= """
                    nome: ${proximoContato.nome}
                    telefone: ${proximoContato.telefone}
                """.trimIndent()
                binding.txtMostrarContato.text = novoTexto
                setTxtAviso("", Color.BLACK)
                contatoAtual = proximoContato
            } else{
                setTxtAviso("Agenda Vzia!", COR_LARANJA)
            }
            binding.btEditar2.setOnClickListener {
                val intent = Intent(this, FormularioContatoActivity::class.java)
                if(contatoAtual !=null){
                    intent.putExtra("nome", contatoAtual!!.nome)
                    intent.putExtra("telefone", contatoAtual!!.telefone)
                }
                startActivity(intent)
            }



        }

        setContentView(binding.root)
    }



    fun setTxtAviso(mensagem: String, cor: Int){
        binding.txtMostrarContato.text = mensagem
        binding.txtMostrarContato.setTextColor(cor)

    }
    companion object {
        val COR_LARANJA = Color.rgb(214, 127, 0)
        val COR_VERDE = Color.rgb(5, 128, 8)
    }
}