package exercicio2

class Quadrado(
    private var ladoParametro : Float = 0.0F,
) : Retangulo(ladoParametro = ladoParametro, alturaParametro =  ladoParametro) {
    private var forma : String = "Quadrado"

    override fun mostrarForma(): String {
        return forma
    }

    override fun calcularArea(): Float {
        return super.calcularArea()
    }

    override fun calcularPerimetro(): Float {
        return super.calcularPerimetro()
    }
}