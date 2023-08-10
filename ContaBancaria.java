public class ContaBancaria {

    private int numero_conta;
    private String nome_titular;
    private float saldo;

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

    public void setSaldo( float novo_saldo ) {
        this.saldo = novo_saldo;
    }

}