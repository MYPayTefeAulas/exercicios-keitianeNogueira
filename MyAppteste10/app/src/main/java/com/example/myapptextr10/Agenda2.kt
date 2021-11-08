package com.example.myapptextr10

class Agenda2 {
    private val listaContatos2 = mutableListOf<Contato2>()
    private var indiceAtul = 0

    fun temContato(): Boolean{
        return listaContatos2.size >0
    }
    fun getProximoContato(): Contato2{
        if (listaContatos2.size == 0)
            throw error("lista de conttato vazia!! use temContato antes de tudo")
        var proximoContatoo: Contato2
        proximoContatoo = listaContatos2[indiceAtul]
        if(indiceAtul +1 == listaContatos2.size)
            indiceAtul = 0
        else
            indiceAtul++
        return proximoContatoo
    }
    fun ImprimrNomeContato(): String {
        if (indiceAtul == listaContatos2.size)
            indiceAtul = 0
        val contatoAtual = listaContatos2[indiceAtul]
        indiceAtul++
        return "${contatoAtual.nome}"
    }

    fun ImprimirTelefone(): String {
        indiceAtul -= 1
        if (indiceAtul == listaContatos2.size)
            indiceAtul = 0
        val contatoAtual = listaContatos2[indiceAtul]
        indiceAtul++
        return "${contatoAtual.telefone}"
    }

    fun deletarContato() {
        if (indiceAtul >= 1) {
            indiceAtul -= 1
            val contatoAtual = listaContatos2[indiceAtul]
            listaContatos2.remove(contatoAtual)
        } else {
            val contatoAtual = listaContatos2[indiceAtul]
            listaContatos2.remove(contatoAtual)
        }
    }

    fun retornaNumeroContatos(): Int {
        return listaContatos2.size
    }
    fun existeTelefone(telefone: String): Boolean{
        for (contato in listaContatos2){
            if (contato.telefone == telefone)
                return true
        }
        return false
    }



}
