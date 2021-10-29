package com.example.myapptextr10

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendaBinding
    private val agenda = Agenda()
    private var i = 0
    private var nome =""
    private  var telefone = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgendaBinding.inflate(layoutInflater)


        binding.btSalvaAgenda.setOnClickListener {
            val nome = binding.txtNomeAgenda.text.toString()
            val telefone = binding.txtTelefone.text.toString()
            val novoContato = PessoasAg(nome, telefone = telefone, tefolene = null)
            if (agenda.existeTelefone(telefone)) {
                binding.txtSaidaAgenda.setTextColor(Color.rgb(200, 10, 10))
                binding.txtSaidaAgenda.text = "Este contato já existe"

            } else{
                agenda.salvarContato(novoContato)
                binding.txtNomeAgenda.text.clear()
                binding.txtTelefone.text.clear()
                binding.txtSaidaAgenda.setTextColor(Color.rgb(10, 200, 30))
                binding.txtSaidaAgenda.text = ""

            }
        }
        binding.btImprimirAgenda.setOnClickListener {

            binding.txtNomeAgenda.setText(agenda.ImprimrNomeContato())
            binding.txtTelefone.setText(agenda.ImprimirTelefone())

        }
        binding.btDeletar.setOnClickListener {
            if (agenda.retornaNumeroContatos() == 0) {
                binding.txtSaidaAgenda.setTextColor(Color.rgb(10, 200, 30))
                binding.txtSaidaAgenda.text = "Não exise contato para deletar"
            } else {
                agenda.deletarContato()
                binding.txtSaidaAgenda.setTextColor(Color.rgb(10, 200, 30))
                binding.txtSaidaAgenda.text = "Contato deletado"
            }
        }


        setContentView(binding.root)
    }
}