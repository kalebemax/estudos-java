import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double numeroSecreto = new Random().nextInt(10);
    System.out.println("Digite um número de 0 a 10");
    int chute = leitura.nextInt();
    for (int i = 0; i < 4; i++) {
      if (chute == numeroSecreto) {
        System.out.println("Parabéns, você acertou!");
        break;
      } else if (chute > numeroSecreto) {
        System.out.println("O número secreto é menor");
      } else if (chute < numeroSecreto) {
        System.out.println("O número secreto é maior");
      } 
      System.out.println("Digite outro número");
      chute = leitura.nextInt();
      if (i == 3) {
        System.out.println("Que pena, Você perdeu! O número secreto era " + numeroSecreto);
      }
    }
  }
}
