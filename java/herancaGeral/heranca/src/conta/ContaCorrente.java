package conta;

public class ContaCorrente extends Conta{
    @Override
    void deposito(double valor){
        this.saldo=this.saldo+1;
    }
}
