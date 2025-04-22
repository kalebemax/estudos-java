import java.util.Scanner;

public class VerificacaoAcessoSistema {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int codigoCorreto = 2023;
        System.out.println("Digite o código de acesso:");
        int codigoDeAcesso = leitura.nextInt();
        System.out.println("Digite o nível de permissão:");
        int nivelDePermissao = leitura.nextInt();
        String msg = "Acesso negado, código incorreto!";
        String msg2 = "Acesso negado, nível de permissão inválido!";
        String msg3 = "Acesso permitido, Bem-vindo ao sistema!";
        String msg4 = "Acesso negado, código incorreto e nível de permissão inválido!";
        if (codigoDeAcesso == codigoCorreto && nivelDePermissao == 1) {
            System.out.println(msg3);
        }
        else if (codigoDeAcesso == codigoCorreto && nivelDePermissao == 2) {
            System.out.println(msg3);
        }
        else if (codigoDeAcesso == codigoCorreto && nivelDePermissao == 3) {
            System.out.println(msg3);
        }
        else if (codigoDeAcesso != codigoCorreto && nivelDePermissao == 1) {
            System.out.println(msg);
        }
        else if (codigoDeAcesso != codigoCorreto && nivelDePermissao == 2) {
            System.out.println(msg);
        }
        else if (codigoDeAcesso != codigoCorreto && nivelDePermissao == 3) {
            System.out.println(msg);
        }
        else if (codigoDeAcesso == codigoCorreto && nivelDePermissao != 1) {
            System.out.println(msg2);
        }
        else if (codigoDeAcesso == codigoCorreto && nivelDePermissao != 2) {
            System.out.println(msg2);
        }
        else if (codigoDeAcesso == codigoCorreto && nivelDePermissao != 3) {
            System.out.println(msg2);
        }
        else {
            System.out.println(msg4);
        }
    }
}
