package Exercicios;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada de multiplicação:");
        int num1 = scanner.nextInt();

        int num2 = 0;
        boolean resultado = true;

        while (resultado && num2 <= 10) {
            System.out.println(num1 + " x " + num2 + ": " + (num1 * num2));
            num2++;
        }
        scanner.close();
    }
}