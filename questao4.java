import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número entre 1 e 30: ");
            numeros[i] = scanner.nextInt();

            while (numeros[i] < 1 || numeros[i] > 30) {
                System.out.print("Número inválido. Digite um número entre 1 e 30: ");
                numeros[i] = scanner.nextInt();
            }
        }

        System.out.println("\nBarras:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}