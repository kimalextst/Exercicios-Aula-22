package exercicio2

class Circulo(
    private var raioParametro : Float = 0.0F
) : Forma() {
    override fun calcularArea(): Float {
        return PI * (raioParametro * 2)
    }

    override fun calcularPerimetro(): Float {
        return 2 * PI * raioParametro
    }
}