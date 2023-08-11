import java.util.ArrayList;

public class AgenciaBancaria {
    
    private int numero_agencia, conta_count = 1;
    private ArrayList<ContaBancaria> lista_ContaBancarias = new ArrayList<ContaBancaria>();

    public int getNumeroAgencia() {
        return this.numero_agencia;
    }

    public void setNumeroAgencia( int novo_numero_agencia ) {
        this.numero_agencia = novo_numero_agencia;
    }

    public ContaBancaria getContaBancaria( int n_conta ) {
        for (ContaBancaria conta : lista_ContaBancarias) {
            if (conta.getNumeroConta() == n_conta) {
                return conta;
            }
        }
        return null;
    }

    public void adicionarContaBanciaria ( float saldo, String titular ) {
        ContaBancaria conta_temp = new ContaBancaria();
        conta_temp.setNomeTitular(titular);
        conta_temp.setNumeroConta(conta_count);
        conta_temp.deposito(saldo);
        lista_ContaBancarias.add(conta_temp);
        System.out.println("Conta criada!");
        System.out.println("| Numero: " + this.conta_count + " | Titular: "
        + titular + " | Saldo: " + saldo);
        conta_count++;
    }

    public void verContasBancarias() {
        if (lista_ContaBancarias.size() == 0) {
            System.out.println("Não há contas nesta agencia.");
            return;
        }
        for ( ContaBancaria conta : lista_ContaBancarias ) {
            System.out.println(conta.getNumeroConta() + " | Titular: " + conta.getNomeTitular()
            + " | Saldo: " + conta.getSaldo() + " |");
        }
    }

}
