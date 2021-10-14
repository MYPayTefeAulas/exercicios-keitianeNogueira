package com.example.myprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myprimeiroapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btTrocar.setOnClickListener {
//            TrocarTexto()
//           binding.txtHello.text =  TrocarTexto()
//            binding.txtHello.text = TrocarTexto2()
//            binding.txtHello.text = CalcularDobro()
//            binding.txtHello.text = Multiplicar()
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
            resultadoString = (numero1 / numero2).toString()
        }
        else{
            resultadoString = "Operação naõ supodada"
        }
        return resultadoString.toString()
    }

    fun CalcularDobro(): String {
        val Calcular = binding.txtnumero1.text.toString()
        val Numero1 = Calcular.toInt()
        val dobro = Numero1*2
        return dobro.toString()

    }
    fun Multiplicar(): String {
        val numero1 = binding.txtnumero1.text.toString().toInt()
        val numero2 = binding.txtnumero2.text.toString().toInt()
        val calcular = numero1*numero2
        return calcular.toString()

    }

//    fun TrocarTexto(){
//        Binding.txtHello.text = "oi\n Em que posso ajudar"
//    }
    fun TrocarTexto(): String{
        return  "oi\n Em que posso ajudar"

    }
    fun TrocarTexto2(): String {
        return binding.txtnumero1.text.toString()

    }

}