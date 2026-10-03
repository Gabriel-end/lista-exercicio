import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CRIAÇÃO DA CONTA =====");

        System.out.print("Digite o número da conta: ");

        while (!sc.hasNextInt()) {
            System.out.println("Digite apenas números inteiros.");
            sc.next();
            System.out.print("Digite o número da conta: ");
        }

        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = sc.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Digite apenas uma opção de 1 a 4.");
                sc.next();
                System.out.print("Escolha uma opção: ");
            }

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do saque: ");
                    float valorSaque = sc.nextFloat();
                    conta.sacar(valorSaque);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    float valorDeposito = sc.nextFloat();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.printf(
                        "Saldo atual: R$ %.2f%n",
                        conta.consultarSaldo()
                    );
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        sc.close();
    }
}