package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("ola pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa")); //Será que a string inicia ou não com a palavra boa //RETORNA TROE OU FALSE
        System.out.println(s.toLowerCase().startsWith("boa"));//toLowerCase é um método de classe String que converte a string original em uma nova string com todas as letras maiúsculas convertidas em letras minúsculas.
        System.out.println(s.endsWith("tarde"));//Será que a estring termina com // RETORNA TROE OU FALSE
        System.out.println(s.length());//Quantas caracter tem uma string
        System.out.println(s.equals("boa tarde")); //Comparação de igualdade
        System.out.println(s.equalsIgnoreCase("boa tarde")); //Não vai olhar se a letra e maiuscula ou minuscula

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "nome: " + nome + "\nsobrenome: " + sobrenome + "\nidade: " + idade + "\nsalario: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade,salario);//String de formatação

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade,salario); //%s String //%d Inteiro //%f Ponto flutuante (Ainda consigo determinar o valor das casas decimais.)
        System.out.println(frase);

        System.out.println("\nQual a boa".contains("Qual"));
        System.out.println("\nQual a boa".indexOf("boa")); // Quantos números minha string retorna
        System.out.println("\nQual a boa".substring(1, 5)); //Quero que começe a partir da String 1 até a 5

    }
}
