package fundamentos.operadores;

public class Relacionais { // RETORNA VALORES VERDADEIROS FALSOS

    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println( a == b); // IGUAL
        System.out.println(3 > 4); // MAIOR
        System.out.println(3 >= 3); // MAIOR IGUAL
        System.out.println(3 < 7); // MENOR
        System.out.println(30 <= 7); // MENOR IGUAL
        System.out.println(30 != 7); // DIFERENTE

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMerdia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMerdia;

        System.out.println("Tem desconto? " + temDesconto);

    }
}
