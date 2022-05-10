package exercicio1

class Livros : Item() {
    override fun mostrarDetalhesDoItem(nome: String, preco: String, detalheUnico: String, codigoDeBarras: String) {
        super.mostrarDetalhesDoItem(nome, preco, detalheUnico, codigoDeBarras)
        println("Autor: $detalheUnico")
        println("-----------------------------------")
    }
}