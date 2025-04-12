public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ano = 2022;
        carro.anoAtual = 2025;
        carro.cor = "branco";
        carro.modelo = "Prisma";

        carro.exibeFichaTecnica();
        carro.calcularIdade();
    }
}