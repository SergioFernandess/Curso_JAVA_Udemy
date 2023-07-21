package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
    // Ler num1
    // Ler num2
    // + - * %

        Scanner entrada =  new Scanner(System.in);
        // Tipo, nome indetificador, recebe um determinado valor.(Receber inf do teclado)

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        // Tipo, variavel, recebe um determinado valor double.

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        // Tipo, variavel, recebe um determinado valor double.

        System.out.print("Informe a operação:");
        String operacao = entrada.next();
        // Next vai pegar o valor e jogar em operação.

        // Lógica
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        // se mais for igual a variavel (operacao) ?
        // significa que ele vai pegar o valor de num1 + num2
        // caso contrario ele vai retornar o valor ZERO 0

        // O que aconteceu, substituição da variavel.
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        // %.2f Para exibir o double com duas casas decimais.
        // %s Para exibir a operação.
        // Que vai ser = ? a alguma coisa que será colculada.

        entrada.close();
    }

}
