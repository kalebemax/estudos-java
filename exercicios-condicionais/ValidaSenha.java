import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int senha = 123456;
        System.out.println("Digite a senha:");
        int senhaDigitada = leitura.nextInt();

        if (senha != senhaDigitada){
            System.out.println("Acesso negado!");
        } else {
            System.out.println("Acesso permitido!");
        }
    }
}
