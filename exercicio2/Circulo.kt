package exercicio2

class Circulo(
    private var raioParametro : Float = 0.0F
) : Forma() {
    private var forma : String = "Circulo"

    override fun mostrarForma(): String {
        return forma
    }

    override fun calcularArea(): Float {
        return PI * (raioParametro * raioParametro)
    }

    override fun calcularPerimetro(): Float {
        return 2 * PI * raioParametro
    }
}