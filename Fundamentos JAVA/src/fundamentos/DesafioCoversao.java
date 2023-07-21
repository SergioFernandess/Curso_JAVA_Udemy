package fundamentos;

import java.util.Scanner;

public class DesafioCoversao {
    public static void main(String[] args) {

        // A partir do scanner, pegue tres Strings usando nextline,
        // essas 3 strings deve receber os ultimos 3 salarios,
        // esses números deve ter a flexibilidade de usar as casas
        // decimais com ponto ou vigula, some os tres salarios e divida por 3
        //converão de uma String em valor númerico e no Scanner posso usar ou next ou nextLine

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Digite seu salario do mes 1: ");
        String salario1 = entrada.nextLine().replace(",", "."); //Replace é usado para a string receber o número int ou double

        System.out.println("Digite seu salaro do mes 2: ");
        String salario2 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite seu salario do mes 3: ");
        String salario3 = entrada.nextLine().replace(",", ".");


        double entrada1 = Double.parseDouble(salario1);
        double entrada2 = Double.parseDouble(salario2);
        double entrada3 = Double.parseDouble(salario3);

        double soma = entrada1 + entrada2 + entrada3;
        System.out.println("A soma é " + soma);
        System.out.println("A média salarial é " + soma / 3);

        entrada.close();

    }
}
