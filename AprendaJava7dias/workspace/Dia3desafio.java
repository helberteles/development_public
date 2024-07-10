import java.util.Scanner;

public class Dia3desafio {
    public static void main(String[] args) {
        // Input
        Scanner lerNumeros = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = lerNumeros.nextInt();
        
        // Code
        if (num < 10 && num >= 1) {
            System.out.println("Este numero tem 1 digito");
        } else if (num < 100 && num >= 10) {
            System.out.println("Este numero tem 2 digitos");
        } else if (num < 1000 && num >= 100) {
            System.out.println("Este numero tem 3 digitos");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("Este numero tem 4 digitos");
        } else if (num < 100000 && num >= 10000) {
            System.out.println("Este numero tem 5 digitos");
        } else {
            System.out.println("Este numero tem 5 digitos ou mais");
        }
        
    }
}