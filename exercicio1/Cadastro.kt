package exercicio1

class Cadastro {
    private lateinit var objetoItem : Item
    private lateinit var nome : String
    private lateinit var preco : String
    private lateinit var detalheUnico : String
    private lateinit var codigoDeBarras : String
    private var listaItens : ArrayList <Item> = ArrayList()


    fun tipoDeProduto(){
        println("-----------------------------------")
        println("Qual o tipo do produto?")
        println("[1] CD")
        println("[2] DVD")
        println("[3] Livro")
        println("-----------------------------------")
        val escolha = readln().toInt()

        when (escolha) {
            1 -> {
                objetoItem = CDs()
                cadastrarInfoBasica()
                detalheUnico = pegarInfo("Número de faixas do CD: ")
                objetoItem.mostrarDetalhesDoItem(nome, preco, detalheUnico,codigoDeBarras)
                adicionarItemLista()
            }
            2 -> {
                objetoItem = DVDs()
                cadastrarInfoBasica()
                detalheUnico = pegarInfo("Duração do DVD: ")
                objetoItem.mostrarDetalhesDoItem(nome, preco, detalheUnico, codigoDeBarras)
                adicionarItemLista()
            }
            3 -> {
                objetoItem = Livros()
                cadastrarInfoBasica()
                detalheUnico = pegarInfo("Autor do Livro: ")
                objetoItem.mostrarDetalhesDoItem(nome, preco, detalheUnico, codigoDeBarras)
                adicionarItemLista()
            }
        }
    }

    private fun cadastrarInfoBasica(){
        codigoDeBarras = pegarInfo("Codigo de barras do produto:")
        nome = pegarInfo("Nome do produto: ")
        preco = pegarInfo("Preço do produto: ")
    }

    private fun pegarInfo(texto : String): String {
        println("-----------------------------------")
        print(texto)
        return readln()
    }

    private fun adicionarItemLista(){
        listaItens.add(objetoItem)
    }

    fun encontrarItemLista(){
        println("Insira o código de barras que deseja verificar")
        val codigo = readln()

        for (contador in listaItens.indices){
        listaItens[contador].equals(codigo)
        }
    }

    override fun equals(other: Any?): Boolean {
        return other == codigoDeBarras
    }
}