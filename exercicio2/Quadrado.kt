package exercicio2

class Quadrado(
    private var ladoParametro : Float = 0.0F,
    private var alturaParametro : Float = ladoParametro,
) : Retangulo() {
    override fun calcularArea(): Float {
        return ladoParametro * alturaParametro
    }

    override fun calcularPerimetro(): Float {
        return super.calcularPerimetro()
    }
}