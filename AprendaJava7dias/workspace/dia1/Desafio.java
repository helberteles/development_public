import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 + numero2;

        System.out.print("A soma de " + numero1 + " + " + numero2 + " eh: " + resultado +"\n");

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
