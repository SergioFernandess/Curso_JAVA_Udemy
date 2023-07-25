package fundamentos.ExerciciosFinais;

import java.util.Scanner;

public class CelsiusParaFahrenheit2 {
    public static void main(String[] args) {
    // Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        double celsius = input.nextDouble() ;

        double convertendo = (celsius * 9/5) + 32;

        System.out.println("Valor em Fahrenheit: " + convertendo);

        input.close();

    }
}
