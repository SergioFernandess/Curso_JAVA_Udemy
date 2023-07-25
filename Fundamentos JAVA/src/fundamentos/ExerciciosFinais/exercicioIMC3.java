package fundamentos.ExerciciosFinais;

import java.util.Scanner;

public class exercicioIMC3 {
    public static void main(String[] args) {
    //    Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso (em quilogramas): ");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double divisaoImc = peso / (altura * altura);

        System.out.println("O IMC é equivalente a: " + divisaoImc);

        scanner.close();

    }
}
