package exercicio1

class CDs : Item() {
    override fun mostrarDetalhesDoItem(nome: String, preco: String, detalheUnico: String, codigoDeBarras: String) {
        super.mostrarDetalhesDoItem(nome, preco, detalheUnico, codigoDeBarras)
        println("Número de faixas: $detalheUnico")
        println("-----------------------------------")
    }
}