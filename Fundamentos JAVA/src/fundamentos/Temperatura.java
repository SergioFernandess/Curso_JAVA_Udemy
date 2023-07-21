package fundamentos;

public class Temperatura {

    public static void main(String[] args) {

        // (°F - 32) x 5/9 = °C          Atalho ° "alt E"

        final double Ajuste = 32;
        final double fator = 5.0/9.0;

        double fahrenheit = 96;
        double celcios = (fahrenheit - Ajuste  * fator);

        System.out.println("A resposta é = " + celcios + "°C. ");
    }
}
