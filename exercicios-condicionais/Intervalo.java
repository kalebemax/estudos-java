import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo:");
        double valorDoEmprestimo = leitura.nextDouble();
        if (valorDoEmprestimo >= 1000 && valorDoEmprestimo <= 5000) {
            System.out.println("O valor " + valorDoEmprestimo + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valorDoEmprestimo + " não está dentro do intervalo permitido para empréstimo.");
        }
    }
}
