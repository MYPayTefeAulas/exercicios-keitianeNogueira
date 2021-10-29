package com.example.myapptextr10

class Agenda() {
    private val listaContatos = mutableListOf<PessoasAg>()
    private var indiceAtul = 0

    fun salvarContato(novoContato: PessoasAg) {
        listaContatos.add(novoContato)
    }

    fun ImprimrNomeContato(): String {
        if (indiceAtul == listaContatos.size)
            indiceAtul = 0
        val contatoAtual = listaContatos[indiceAtul]
        indiceAtul++
        return "${contatoAtual.nome}"
    }

    fun ImprimirTelefone(): String {
        indiceAtul -= 1
        if (indiceAtul == listaContatos.size)
            indiceAtul = 0
        val contatoAtual = listaContatos[indiceAtul]
        indiceAtul++
        return "${contatoAtual.telefone}"
    }

    fun deletarContato() {
        if (indiceAtul >= 1) {
            indiceAtul -= 1
            val contatoAtual = listaContatos[indiceAtul]
            listaContatos.remove(contatoAtual)
        } else {
            val contatoAtual = listaContatos[indiceAtul]
            listaContatos.remove(contatoAtual)
        }
    }

    fun retornaNumeroContatos(): Int {
        return listaContatos.size
    }
    fun existeTelefone(telefone: String): Boolean{
        for (contato in listaContatos){
            if (contato.telefone == telefone)
                return true
        }
        return false
    }

}
