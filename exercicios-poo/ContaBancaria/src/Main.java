public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.setNumeroConta(35436657);
        minhaConta.setSaldo(150.00);
        minhaConta.titular = "Roger";

        System.out.println("Este é o saldo: " + minhaConta.getSaldo());
        System.out.println("Este é o número da conta: " + minhaConta.getNumeroConta());
        System.out.println("Este é o nome do titular: " + minhaConta.titular);
    }
}