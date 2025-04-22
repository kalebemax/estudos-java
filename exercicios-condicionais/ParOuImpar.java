import java.util.Scanner;

class ParOuImpar {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner leitura = new Scanner(System.in);
        int valor = leitura.nextInt();
        if (valor % 2 == 0) {
            System.out.println("O número " + valor + " é par.");
        } else {
            System.out.println("O número " + valor + " é ímpar.");
        }
        System.out.println("Digite outro número ou digite 00 para sair do programa");
        valor = leitura.nextInt();
        while (valor != 00) {
            if (valor % 2 == 0) {
                System.out.println("O número " + valor + " é par.");
            } else {
                System.out.println("O número " + valor + " é ímpar.");
            }
            System.out.println("Digite outro número ou digite 00 para sair do programa");
            valor = leitura.nextInt();
        }

    }
}