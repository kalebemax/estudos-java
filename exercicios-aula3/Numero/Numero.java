package Numero;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Por favor, digite um número");
        int numero = leitura.nextInt();
        
        
        if (numero < 0) {
            System.out.println("O número é negativo");
        } else if (numero > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é zero");
        }
    }
}
