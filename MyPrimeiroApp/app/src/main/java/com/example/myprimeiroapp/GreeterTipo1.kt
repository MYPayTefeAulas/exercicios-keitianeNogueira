package com.example.myprimeiroapp

class GreeterTipo1(val cumprimento: String, val cumprimentoSufixo: String) {
    fun greeter(nome: String): String {
        val cumprimentoCompleto = "$cumprimento, $nome, $cumprimentoSufixo"
        return cumprimentoCompleto
    }
}