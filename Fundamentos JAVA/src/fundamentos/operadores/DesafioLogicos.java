package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

    // Trabalho na terça (V ou F)
    // Trabalho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        System.out.println("Comprou TV de 50? " +comprouTv50);

        boolean comprouTv35 = trabalho1 ^ trabalho2;
        System.out.println("Comrpou TV de 35? " +comprouTv35);

        boolean comprouSorvete = trabalho1 || trabalho2;
        System.out.println("Comrpou sorvete? " +comprouSorvete);

        // Operador Unário!
        System.out.println("Mais saudável? " + !comprouSorvete);
    }
}
