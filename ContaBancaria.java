public class ContaBancaria {

    private int numero_conta;
    private String nome_titular;
    private float saldo = 0f;

    public int getNumeroConta() {
        return this.numero_conta;
    }

    public void setNumeroConta( int novo_numero ) {
        this.numero_conta = novo_numero;
    }

    public String getNomeTitular() {
        return this.nome_titular;
    }

    public void setNomeTitular( String novo_nome_titular ) {
        this.nome_titular = novo_nome_titular;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void saque( float valor_saque ) {
        this.saldo -= valor_saque;
        System.out.println("Novo saldo: " + this.saldo);
    }

    public void deposito( float valor_deposito ) {
        this.saldo += valor_deposito;
        System.out.println("Novo saldo: " + this.saldo);
    }

}