package exercicio1

class DVDs : Item() {
    override fun mostrarDetalhesDoItem(nome: String, preco: String, detalheUnico: String, codigoDeBarras: String) {
        super.mostrarDetalhesDoItem(nome, preco, detalheUnico, codigoDeBarras)
        println("Duração: $detalheUnico")
        println("-----------------------------------")
    }
}