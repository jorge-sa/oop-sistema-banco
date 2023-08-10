import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        
        int n_conta, n_agencia = 1, op;
        String nm_titular;
        float saldo;
        ArrayList<AgenciaBancaria> lista_AgenciaBancarias = new ArrayList<>();

        Scanner rd = new Scanner(System.in);

        loop:{
            while (true) {
                System.out.println("=============================");
                System.out.println("1 - Criar Agencia Bancaria");
                System.out.println("2 - Criar Conta Bancaria");
                System.out.println("0 - Fechar Sistema");
                System.out.println("=============================");
            
                op = rd.nextInt();

                swit:{
                    switch (op) {
                        case 0:
                            break loop;
                        case 1:
                            AgenciaBancaria agencia_temp = new AgenciaBancaria();
                            agencia_temp.setNumeroAgencia(n_agencia);
                            n_agencia++;
                            lista_AgenciaBancarias.add(agencia_temp);
                            System.out.println("Agencia criada");
                            break;
                        case 2:
                            if (lista_AgenciaBancarias.size() == 0) {
                                System.out.println("Não existe uma Agencia Bancaria.");
                                break;
                            }

                            System.out.println("Selecione Agencia Bancaria [1-"+lista_AgenciaBancarias.size()+"]");
                            op = rd.nextInt();

                            for (AgenciaBancaria agencia : lista_AgenciaBancarias) {
                                if (agencia.getNumeroAgencia() == op) {
                                    System.out.println("Numero da conta: ");
                                    n_conta = rd.nextInt();
                                    System.out.println("Saldo da conta: ");
                                    saldo = rd.nextFloat();
                                    rd.nextLine();
                                    System.out.println("Nome do titular: ");
                                    nm_titular = rd.nextLine();

                                    agencia.adicionarContaBanciaria(n_conta, saldo, nm_titular);
                                    break swit;
                                }
                            }

                            System.out.println("Agencia selecionada não existe");
                            break;
                        default:
                            System.out.println("Opção invalida.");
                    }
                }
                
            }
        }
        
        rd.close();

        //ver registros
        System.out.println();
        for (AgenciaBancaria agencia : lista_AgenciaBancarias) {
            agencia.verContasBancarias();
            System.out.println("===============================");
        }
    }
}
