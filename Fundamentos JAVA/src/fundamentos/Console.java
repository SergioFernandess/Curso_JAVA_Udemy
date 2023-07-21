package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        System.out.print("Bom");// O print vai continuar na mesma linha.
        System.out.print(" dia!\n\n");// \n quebra a linha.

        System.out.println("BOM");// Quando imprimir vai continuar na mesma linha.
        System.out.println("dia!");//  Quando imprimir vai para a linha de baixo.

        System.out.printf("Megasena: %d %d %d %d %d %d\n" , // Dola D (%d) = número inteiro.
                1, 2, 3, 4, 5, 6);// Print de String formatada.
        System.out.printf("Salário; %.2f%n", 1234.5678);// %.2f Mostrando 2 valores depois do ponto flutuante.
        System.out.printf("Nome: %s%n", "Sergio");// Dola S representa uma String.




        Scanner entrada = new Scanner(System.in);// Entrada do sistema
        // Tipo, nome indetificador, recebe um determinado valor.

        System.out.print("Digite o seu nome >>> ");
        String nome = entrada.nextLine();// Recebendo dados do cliente.

        System.out.print("Digite o seu sobrenome >>> ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a sua idade >>> ");
        int idade = entrada.nextInt();// nextInt me de um int e armasene idade.

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();
    }
}
