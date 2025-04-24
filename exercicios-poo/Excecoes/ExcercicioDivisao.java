package Excecoes;

import java.util.Scanner;

public class ExcercicioDivisao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
           int num1 = leitura.nextInt();
           System.out.println("Digite o segundo número:");
           int num2 = leitura.nextInt();
        try {
           System.out.println("Resultado da divisão: " + num1 / num2);
       } catch (ArithmeticException e) {
           System.out.println("Ocorreu um erro, 0 não é divisível!");
       }
    }
}
