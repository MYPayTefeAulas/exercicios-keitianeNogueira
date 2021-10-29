package com.example.myapptextr10.greeter

class GreeterTipo1(val cumprimento: String, val cumprimentoSufixo: String){
    fun greeter(nome: String): String {
        val cumprimentoCompleto = "$cumprimento, $nome, $cumprimentoSufixo"
        return cumprimentoCompleto
    }


}
