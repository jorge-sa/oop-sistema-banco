import java.util.ArrayList;

public class AgenciaBancaria {
    
    private int numero_agencia;
    private ArrayList<ContaBancaria> lista_ContaBancarias = new ArrayList<ContaBancaria>();

    public int getNumeroAgencia() {
        return this.numero_agencia;
    }

    public void setNumeroAgencia( int novo_numero_agencia ) {
        this.numero_agencia = novo_numero_agencia;
    }

    public void adicionarContaBanciaria ( int n_conta, float saldo, String titular ) {
        ContaBancaria conta_temp = new ContaBancaria();
        conta_temp.setNomeTitular(titular);
        conta_temp.setNumeroConta(n_conta);
        conta_temp.setSaldo(saldo);
        lista_ContaBancarias.add(conta_temp);
    }

    public void verContasBancarias() {
        if (lista_ContaBancarias.size() == 0) {
            System.out.println("Não há contas nesta agencia.");
            return;
        }
        for ( ContaBancaria conta : lista_ContaBancarias ) {
            System.out.println(conta.getNumeroConta() + " " + conta.getNomeTitular());
        }
    }

}
