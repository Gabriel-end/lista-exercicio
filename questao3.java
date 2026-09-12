import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        System.out.println("Números primos entre 2 e " + n + ":");

        for (int numero = 2; numero <= n; numero++) {
            boolean primo = true;

            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(numero + " ");
            }
        }

    }
}