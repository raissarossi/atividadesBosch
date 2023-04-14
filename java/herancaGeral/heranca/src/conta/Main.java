package conta;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println(contaCorrente.saldo);
        contaCorrente.deposito(100);
        System.out.println(contaCorrente.saldo);
    }
}
