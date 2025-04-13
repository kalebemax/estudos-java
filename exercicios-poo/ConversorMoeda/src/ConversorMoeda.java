public class ConversorMoeda implements ConversaoFinanceira {
    double valorEmDolar;
    double taxaDeCambio;

    public double converterDolarParaReal() {
        return valorEmDolar * taxaDeCambio;
    }
}