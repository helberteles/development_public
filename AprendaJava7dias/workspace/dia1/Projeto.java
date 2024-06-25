import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;

        System.out.print("A soma de " + numero1 + " + " + numero2 + " eh: " + resultado +"\n");

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
