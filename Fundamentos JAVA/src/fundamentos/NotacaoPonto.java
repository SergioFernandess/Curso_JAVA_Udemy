package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

         String s = "Bom dia mano";
         s = s.replace("X", "Senhora");
         s = s.toUpperCase();
         s = s.concat("!!!");

        System.out.println(s);

        String x = "sergin".toUpperCase();
        System.out.println(x);

        String y = "Bom dia mano"
                .replace("mano", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."

    }
}
