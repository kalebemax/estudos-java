public class Carro {
    String modelo;
    String cor;
    int ano;
    int anoAtual;
    int idade;

    void exibeFichaTecnica() {
        System.out.println("O carro é um modelo: " + modelo);
        System.out.println("O carro é da cor " + cor);
        System.out.println("O carro é do ano " + ano);
        System.out.println("O carro tem " + calcularIdade() + " anos de idade");
    }

    int calcularIdade() {
        return anoAtual - ano;
    }
}
