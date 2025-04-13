public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.taxaDeCambio = 5.16;
        conversorMoeda.valorEmDolar = 10;
        System.out.println("Valor em reais é: R$ " + conversorMoeda.converterDolarParaReal());
    }
}
