package com.example.myapptexte10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptexte10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btTrocatexto.setOnClickListener {
//           Trocatexto()
//            binding.txtHello.text=  Trocatexto()
//            binding.txtHello.text= Trocafunção()
//            binding.txtHello.text= calculaDobro()
//            binding.txtHello.text= multi()
            binding.txtHello.text= calcula()

        }


        val view = binding.root
        setContentView(view)
    }
//    fun calculaDobro(): String {
//        val txtEntrada= binding.txtInput1.text.toString()
//        val numero= txtEntrada.toInt()
//        val dobro= numero*2
//        return dobro.toString()
//    }
//    fun multi(): String {
//        val numero1= binding.txtInput1.text.toString().toInt()
//        val numer2= binding.txtInput2.text.toString().toInt()
//        val resultado= numero1*numer2
//        return resultado.toString()
//    }
    fun calcula(): String {
        val Operação= binding.txtOperaO.text.toString()
        val numero1= binding.txtInput1.text.toString().toInt()
        val numero2= binding.txtInput2.text.toString().toInt()
        var resutadoString =""
        if(Operação=="+"){
            resutadoString= (numero1+numero2).toString()
        } else if(Operação=="-"){
            resutadoString= (numero1-numero2).toString()
        } else if(Operação=="/"){
            resutadoString= (numero1/numero2).toString()
        }
        else if(Operação=="*"){
            resutadoString= (numero1*numero2).toString()
        }
        else{
            resutadoString= "Operação não suportada"
        }
        return resutadoString.toString()
    }


//    fun Trocatexto() {
//        binding.txtHello.text = "oi\n Tudo bem"
//    }
    fun Trocatexto(): String {
        return  "oi\n Tudo bem"
    }
    fun Trocafunção(): String {
        return binding.txtInput1.text.toString()
    }

}