import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> listaDePessoas = new ArrayList<>();
        listaDePessoas.add("João");
        listaDePessoas.add("Paulo");
        listaDePessoas.add("Marcos");
        System.out.println("Este é o tamanho da lista: " + listaDePessoas.size());
        System.out.println("Esta é a primeira pessoa da lista: " + listaDePessoas.getFirst());
        System.out.println(listaDePessoas.toString());
    }
}
