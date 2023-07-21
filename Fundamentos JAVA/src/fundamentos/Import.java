package fundamentos;

import javax.swing.*; //Import fica sempre fora da classe
import java.util.Date; //A partir dos imports consigo interagir minhas classes
public class Import {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        JButton botao = new JButton();
        System.out.println(botao);
    }
}
