package com.example.myapptextr10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityTelaInicialBinding
import com.example.myapptextr10.greeter.Greeter1Activity
import com.example.myapptextr10.greeter.Greeter2Activity

class TelaInicialActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInicialBinding.inflate(layoutInflater)

        binding.btAbrirExcecicioLista.setOnClickListener {
            val intent = Intent(this, listaActivity2::class.java)
            startActivity(intent)
        }
        binding.btAbrirExercicioPessoa.setOnClickListener {
            val intent = Intent(this, PessoasActivity::class.java)
            startActivity(intent)
        }
        binding.btAbrirExercicioGreeter.setOnClickListener {
            val intent = Intent(this, Greeter1Activity::class.java )
            startActivity(intent)
        }
        binding.btExGreeter2.setOnClickListener {
            val intent = Intent(this,Greeter2Activity::class.java )
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}