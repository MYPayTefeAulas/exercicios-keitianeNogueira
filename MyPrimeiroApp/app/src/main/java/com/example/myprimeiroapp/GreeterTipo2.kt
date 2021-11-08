package com.example.myprimeiroapp

class GreeterTipo2(val cumplimento: String, val cumplimentoSufixo: String) {

    fun greeter2( pessoa : Pessoas): String {

        val cuplimentoCompleto2 = "$cumplimento, $cumplimentoSufixo, $pessoa.nome,$pessoa.idade"
        return cuplimentoCompleto2
    }
}