public class Main {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Cristiano");
        idadePessoa.setIdade(40);
        System.out.println("Seu nome é " + idadePessoa.getNome());
        System.out.println("Tem " + idadePessoa.getIdade() + " anos");
        idadePessoa.verificarIdade(idadePessoa.getIdade());


    }
}