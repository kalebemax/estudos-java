import javax.swing.plaf.ProgressBarUI;
import java.util.ArrayList;

public class Produto {
    @Override
    public String toString() {
        return "[" +
                "nome= '" + nome + '\'' +
                ", preco= " + preco +
                ", quantidade= " + quantidade +
                ']';
    }

    String nome;
        double preco;
        int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
            Produto produto1 = new Produto("celular", 1200, 5);
            Produto produto2 = new Produto("sabão", 10.50, 3);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        System.out.println(produtos);
        System.out.println(produtos.size());
        System.out.println(produtos.getFirst());

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("macarrão", 12.75, 2, "2025-12-31");
        System.out.println(produtoPerecivel);
    }

}
