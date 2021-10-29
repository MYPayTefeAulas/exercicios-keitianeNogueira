package com.example.myapptextr10.greeter

class GreeterTipo2(val cumplimento: String, val cumplimentoSufixo: String) {

    fun greeter2(pessoa: Pessoas): String {
        val cumprimentoCompleto = "$cumplimento, ${pessoa.nome}, ${pessoa.idade}, $cumplimentoSufixo"
        return cumprimentoCompleto
    }
}