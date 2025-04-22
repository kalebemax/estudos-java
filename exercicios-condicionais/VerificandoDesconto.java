import java.util.Scanner;

public class VerificandoDesconto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor da compra:");
        double valorDaCompra = leitura.nextDouble();
        double desconto = valorDaCompra * 0.10;
        double valorComDesconto = valorDaCompra - desconto;
        String msgDeDesconto = """
                Desconto de 10% aplicado.
                Novo valor: R$ """ + valorComDesconto;
        String msgSemDesconto = """
                Nenhum desconto aplicado.
                Valor total: R$ """ + valorDaCompra;
        if (valorDaCompra >= 100) {
            System.out.println(msgDeDesconto);
        } else {
            System.out.println(msgSemDesconto);
        }
    }
}
