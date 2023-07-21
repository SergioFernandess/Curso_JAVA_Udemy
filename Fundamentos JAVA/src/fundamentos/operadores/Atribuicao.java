package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b; ATRIBUIÇÃO ADITIVA
        c -= a; // c = c - a; ATRIBUIÇÃO SUBTRATIVA
        c *= b; // c =c * b; ATRIBUIÇÃO MULTIPLICATIVA
        c /= a; // c = c / a; ATRIBUIÇÃO DIVIZIVA

        c++; // c = c + 1; Operador unario de incremento

        System.out.println(c);
        c %= 2; // c = c % 2;  0 ou 1 impar ou par ATRIBUIÇÃO DE MODULO

        System.out.println(c);
    }
}
