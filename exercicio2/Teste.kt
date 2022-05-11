package exercicio2

import kotlin.system.exitProcess

class Teste {
    private var listaFormas : ArrayList <Forma> = ArrayList(5)
    private lateinit var objetoForma : Forma
    private lateinit var forma : String
    private var raio : Float = 0.0F
    private var lado : Float = 0.0F
    private var altura : Float = 0.0F

    fun escolhaFormas(){
        println("-------------------------------------------------")
        println("Qual a forma desejada?")
        println("[C] Circulo")
        println("[R] Retângulo")
        println("[Q] Quadrado")
        println("-------------------------------------------------")
        val escolha = readln()

        when(escolha){
            "C", "c" -> forma = "Circulo"
            "R", "r" -> forma = "Retângulo"
            "Q", "q" -> forma = "Quadrado"
        }
    }

    fun atributosFormas(){
        when (forma) {
            "Circulo" -> {
                println("-------------------------------------------------")
                raio = pegarAtributo("Qual o raio do circulo?")
                println("-------------------------------------------------")
                objetoForma = Circulo(raioParametro = raio)
                adicionarFormasLista()
            }
            "Retângulo" -> {
                println("-------------------------------------------------")
                lado = pegarAtributo("Qual o lado do retângulo?")
                println("-------------------------------------------------")
                altura = pegarAtributo("Qual a altura do retângulo?")
                println("-------------------------------------------------")
                objetoForma = Retangulo(ladoParametro = lado, alturaParametro = altura)
                adicionarFormasLista()
            }
            "Quadrado" -> {
                println("-------------------------------------------------")
                lado = pegarAtributo("Qual o lado do quadrado?")
                println("-------------------------------------------------")
                objetoForma = Quadrado(ladoParametro = lado)
                adicionarFormasLista()
            }
        }

        mostrarFormaRecemCadastrada()
        escolhaNovoCadastro()
    }

    private fun adicionarFormasLista(){
        listaFormas.add(objetoForma)
    }

    private fun mostrarFormasLista(){
        listaFormas.forEach{ _ ->
            mostrarFormaRecemCadastrada()
        }
    }

    private fun pegarAtributo(texto : String): Float {
        println(texto)
        return readln().toFloat()
    }

    private fun mostrarFormaRecemCadastrada(){
        println("-------------------------------------------------")
        println("Forma: $forma")
        println("Area: ${objetoForma.calcularArea()}")
        println("Perimetro: ${objetoForma.calcularPerimetro()}")
        println("-------------------------------------------------")
    }

    private fun escolhaNovoCadastro(){
        println("Deseja cadastrar outra forma? ([S] Sim // [N] Não)")
        println("-------------------------------------------------")
        val escolha = readln()

        when (escolha) {
            "S", "s" -> {
                main()
            }
            "N", "n" -> {
                decisaoSairOuVerLista()
            }
            else -> {
                println("Escolha inválida, tente novamente")
                escolhaNovoCadastro()
            }
        }
    }

    private fun decisaoSairOuVerLista(){
        println("-------------------------------------------------")
        println("Deseja sair do sistema de imediato[1]")
        println("Ou ver a lista de formas cadastradas primeiro?[2]")
        println("-------------------------------------------------")
        val escolha = readln().toInt()

        when (escolha) {
            1 -> {
                exitProcess(0)
            }
            2 -> {
                mostrarFormasLista()
            }
            else -> {
                println("Escolha inválida, tente novamente")
                decisaoSairOuVerLista()
            }
        }
    }
}