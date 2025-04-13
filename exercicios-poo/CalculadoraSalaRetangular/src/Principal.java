public class Principal {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        System.out.println("A área do retângulo é: " + calculadora.calcularArea(5, 5.8));
        System.out.println("O perimetro do retângulo é: " + calculadora.calcularPerimetro(9, 5, 6, 0));
    }
}