package exercicio1

abstract class Item {
    open fun mostrarDetalhesDoItem(nome : String, preco : String, detalheUnico : String, codigoDeBarras : String){
        println("-----------------------------------")
        println("Código de Barras: $codigoDeBarras")
        println("Produto: $nome")
        println("Preço: $preco")
    }
}