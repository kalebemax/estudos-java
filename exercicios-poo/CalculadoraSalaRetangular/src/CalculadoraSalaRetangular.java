public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    @Override
    public double calcularPerimetro(double medida1, double medida2, double medida3, double medida4) {
        return medida1 + medida2 + medida3 + medida4;
    }
}
