package fundamentos.ExerciciosFinais;

import java.util.Scanner;

public class aoQuadradoeaoCulbo4 {
    public static void main(String[] args) {
    // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

     Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qualquer valor: ");
        double valor = scanner.nextDouble();


        double quadrado = Math.pow(valor, 2) ;
        // É usada para calcular potências de números.

        double cubo = Math.pow(valor, 3) ;

        System.out.println("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);

        scanner.close();
    }
}
