package exercicio2

open class Retangulo(
    private var ladoParametro : Float = 0.0F,
    private var alturaParametro : Float = 0.0F
) : Forma() {
    private var forma : String = "Retângulo"

    override fun mostrarForma(): String {
        return forma
    }

    override fun calcularArea(): Float {
        return ladoParametro * alturaParametro
    }

    override fun calcularPerimetro(): Float {
        return (2 * ladoParametro) + (2 * alturaParametro)
    }
}