// VARIAVEL E CONSTANTE

package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {
        double raio = 3.4; // Criando variavel e atribuindo valores!
        final double PI = 3.14159; // "CONSTANTE" Até o "final" pi morre com o mesmo número!

        double area = PI * raio * raio; // Calcúlei a área!

        System.out.println(area); // Imprimi a área!

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area); // Soma da string e da variavel = a concatenação!
    }
}
