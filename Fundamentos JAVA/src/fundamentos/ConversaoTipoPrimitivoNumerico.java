package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

       double a = 1; // Implícita pq o int vai para doble mas isso n tem problema
        System.out.println(a);

        float b = (float) 1.123456788888; // Quando faz uma explícita fique ciente que pode perder informação
        // (CAST) // Double suporta esse valor "float não"
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // Explícita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // Explícita (CAST)
        System.out.println(f);
    }
}
