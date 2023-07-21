package fundamentos;

public class PrimitiviVsObjeto {

    public static void main(String[] args) {

         String s = ("texto");// String é uma classe
         s.toUpperCase();// Comportamento do objeto string que foi criado

         //warppers são a versão objeto dos tipos
        //Primitivos!
        int a = 123;
        System.out.println(a);
    }
}
