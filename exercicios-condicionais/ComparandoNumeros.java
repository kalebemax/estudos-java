import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = leitura.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = leitura.nextInt();
        if (num1 == num2) {
            System.out.println("Os números são iguais!");
        } else if (num1 > num2){
            System.out.println("O maior número é " + num1 + ".");
        } else {
            System.out.println("O maior número é " + num2 + ".");
        }
    }
}
