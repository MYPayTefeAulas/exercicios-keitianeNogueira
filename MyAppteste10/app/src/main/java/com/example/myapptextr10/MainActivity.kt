package com.example.myapptextr10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptextr10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btTrocatexto.setOnClickListener {
//            Trocatexto()
//            binding.txtHello.text= Trocatexto2()
//            binding.txtHello.text = calculaDobro()
//            binding.txtHello.text = multiplica()
            binding.txtHello.text = calcula()


        }

        setContentView(binding.root)
    }
    fun calcula(): String {
        val Operação = binding.txtOperaO.text.toString()
        val numero1= binding.txtnumero1.text.toString().toInt()
        val numero2= binding.txtnumero2.text.toString().toInt()
        var resultadoString= ""

        if(Operação =="+") {
            resultadoString = (numero1 + numero2).toString()
        }
        else if(Operação =="-") {
            resultadoString= (numero1 - numero2).toString()
        }
        else if(Operação =="*") {
            resultadoString= (numero1 * numero2).toString()
        }
        else if(Operação =="/") {
            resultadoString= (numero1 / numero2).toString()
        }
        else{
            resultadoString = "Operação naõ supodada"
        }

        return resultadoString.toString()
    }
//    fun calculaDobro(): String {
//        val calcula= binding.txtnumero1.text.toString()
//        val numero= calcula.toInt()
//        val dobro= numero*2
//        return dobro.toString()
//    }
//    fun multiplica(): String {
//        val calcula = binding.txtOperaO.text.toString()
//        val numero1= binding.txtnumero1.text.toString().toInt()
//        val numero2=binding.txtnumero2.text.toString().toInt()
//        val resutado= numero1*numero2
//        return resutado.toString()
//    }
//    fun Trocatexto(){
//        binding.txtHello.text = "oi\n Em que posso ajuda"
//    }
    fun Trocatexto(): String{
        return "oi\n Em que posso ajuda"
    }
    fun Trocatexto2(): String {
        return binding.txtnumero1.text.toString()
    }
}
