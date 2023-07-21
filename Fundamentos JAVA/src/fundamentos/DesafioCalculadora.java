package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
    // Ler num1
    // Ler num2
    // + - * %

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe a operação:");
        String operacao = entrada.nextLine();
        //Lógica
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;

        System.out.printf("%.2f %s %.2f = ?",
                num1, operacao, num2, resultado);








        entrada.close();

    }

}
