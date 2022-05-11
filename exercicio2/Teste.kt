package exercicio2

import kotlin.system.exitProcess

class Teste {
    private var listaFormas : ArrayList <Forma> = ArrayList()
    private lateinit var objetoForma : Forma

    fun escolhaFormas() {
        var forma = ""

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
            else -> {
                println("Ei, escolha inválida. Tente novamente")
                escolhaFormas()
            }
        }

        atributosFormas(forma)
    }

    private fun atributosFormas(forma: String) {
        when (forma) {
            "Circulo" -> {
                println("-------------------------------------------------")
                val raio = pegarAtributo("Qual o raio do circulo?")
                println("-------------------------------------------------")
                objetoForma = Circulo(raioParametro = raio)
            }
            "Retângulo" -> {
                println("-------------------------------------------------")
                val lado = pegarAtributo("Qual o lado do retângulo?")
                println("-------------------------------------------------")
                val altura = pegarAtributo("Qual a altura do retângulo?")
                println("-------------------------------------------------")
                objetoForma = Retangulo(ladoParametro = lado, alturaParametro = altura)
            }
            "Quadrado" -> {
                println("-------------------------------------------------")
                val lado = pegarAtributo("Qual o lado do quadrado?")
                println("-------------------------------------------------")
                objetoForma = Quadrado(ladoParametro = lado)
            }
        }

        mostrarFormaRecemCadastrada(forma, objetoForma.calcularArea(), objetoForma.calcularPerimetro())
        adicionarFormasLista(objetoForma)
        escolhaNovoCadastro()
    }

    private fun adicionarFormasLista(objeto : Forma){
        listaFormas.add(objeto)
    }

    private fun mostrarFormasLista(){
        listaFormas.forEach{ forma ->
            mostrarFormaRecemCadastrada(forma.mostrarForma(), forma.calcularArea(), forma.calcularPerimetro())
        }

    }

    private fun pegarAtributo(texto : String): Float {
        println(texto)
        return readln().toFloat()
    }

    private fun mostrarFormaRecemCadastrada(forma : String, area : Float, perimetro : Float){
        println("-------------------------------------------------")
        println("Forma: $forma")
        println("Area: $area")
        println("Perimetro: $perimetro")
        println("-------------------------------------------------")
    }

    private fun escolhaNovoCadastro(){
        println("Deseja cadastrar outra forma? ([S] Sim // [N] Não)")
        println("-------------------------------------------------")
        val escolha = readln()

        when (escolha) {
            "S", "s" -> {
                escolhaFormas()
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