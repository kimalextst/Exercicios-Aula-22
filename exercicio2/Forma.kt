package exercicio2

abstract class Forma {

    open fun mostrarForma(): String {
        return ""
    }
    abstract fun calcularArea(): Float
    abstract fun calcularPerimetro(): Float
}