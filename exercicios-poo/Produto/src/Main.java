public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Geladeira");
        produto.setPreco(250.00);

        System.out.println("O produto é uma " + produto.getNome());
        System.out.println("Custa " + produto.getPreco());
        System.out.println("Com o desconto fica por ");
        produto.aplicarDesconto(10);
        System.out.println(produto.getPreco());
    }
}