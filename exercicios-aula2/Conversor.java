public class Conversor {
    public static void main(String[] args) {

        double temperaturaEmCelsius = 33.5;
        int resultadoDaConversao = (int) (temperaturaEmCelsius * 1.8) + 32;
        String msg = "A temperatura em fahrenheit após a conversão é igual à: ";
        System.out.println(msg + resultadoDaConversao);
    }
}