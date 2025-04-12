public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Edmundo");
        aluno.setNota1(6.7);
        aluno.setNota2(8.2);
        aluno.setNota3(5.5);
        aluno.setNota4(9.7);
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Notas: " + aluno.getNota1());
        System.out.println(aluno.getNota2());
        System.out.println(aluno.getNota3());
        System.out.println(aluno.getNota4());
        System.out.println("Média do aluno " + aluno.calcularMedia());
    }
}