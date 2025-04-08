package DoisNumeros;

import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double numero1 = leitura.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = leitura.nextDouble();
        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
