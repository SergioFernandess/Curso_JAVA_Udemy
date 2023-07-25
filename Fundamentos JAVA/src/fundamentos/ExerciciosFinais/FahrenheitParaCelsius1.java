package fundamentos.ExerciciosFinais;

import java.util.Scanner;

public class FahrenheitParaCelsius1 {
    // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        // Realiza a conversão para Celsius
        double temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;

        System.out.printf("%.2f °F equivale a %.2f °C",
                temperaturaFahrenheit, temperaturaCelsius);

        scanner.close();
    }
}
