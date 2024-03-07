import javax.sound.midi.Soundbank;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
public class banco {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double saldo = new Random().nextDouble(5000.00);
        int depositar = 0;
        double transferir = 0;
        int resposta = 0 ;
        int continuar = 0;



        System.out.println("Bem vindo ao Banco X, informe seu nome para acessar sua conta:");
        String nome = leitura.nextLine();
        System.out.println("E o tipo da sua conta:");
        String tpconta = leitura.nextLine();
        System.out.println("Acesso Concedido");

        while (continuar != 1) {
            System.out.println("************************************************");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo de conta: " + tpconta);
            System.out.printf(String.format("Saldo: R$ %.2f", saldo));
            System.out.println("\nDigite 1 para continuar");
            continuar = leitura.nextInt();
            System.out.println("************************************************");
            break;
        };

        while ((resposta != 4) && (continuar != 4)) {
            System.out.println("\n************************************************");
            System.out.println("\nOperações:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            resposta = leitura.nextInt();

            if (resposta == 1){
                System.out.println(String.format(" Seu saldo atual é: R$ %.2f" , saldo));
            }
             else if (resposta == 2){
                System.out.println(String.format(" Quanto deseja depositar em sua conta ? \n Saldo Atual: R$ %.2f", saldo));
                depositar = leitura.nextInt();
                saldo += depositar;
                System.out.println(String.format("Saldo atual: R$ %.2f", saldo));
                System.out.println("Depósito concluìdo.");
            }
             else if (resposta == 3){
                System.out.println(String.format("Quanto deseja transferir ? \n Saldo atual: R$ %.2f", saldo));
                transferir = leitura.nextDouble();

                if (transferir > saldo){
                    System.out.println("Saldo Insuficiente para esta transferência.");
                }
                if (transferir <= saldo) {
                    saldo-=transferir;
                    System.out.println(String.format("Transferência Concluída. \nSaldo Atual: R$ %.2f", saldo));
                }
            }
             else if (resposta != 4){
                System.out.println("Opção inválida");
            };


        };
        System.out.println("Atendimento finalizado");







    }
}