package fundamentos.ExerciciosFinais;

import java.util.Scanner;

public class trianguloCalculaArea5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Base:");
        double base = scanner.nextDouble();

        System.out.println("Digite a Altura:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A Área do Triãngulo é: " + area);

        scanner.close();
    }
}
