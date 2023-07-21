package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
    // Inferencia só acontece dentro dos metodos:
    // O java vai inferir determinando o tipo da variavel

        double a = 4.5;// Declarada e inicialização
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);// Vai inferir que é do tipo DOUBLE

        var c = "texto";
        System.out.println(c);

        c = "outro texto";
        System.out.println(c);

        double d;// Variavel foi declarada
        d = 123.65;// Inicializei a variavel
        System.out.println(d);// Usada!

    // Valores com casa decimal recebe valores inteiros, o contrario não!
    }
}
