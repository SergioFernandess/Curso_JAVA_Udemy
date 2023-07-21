package fundamentos;

public class TiposPrimitivos1 {
    public static void main(String[] args) {
        // Informações do funcionario

        // tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDevoos = 542;
        int id = 56789;
         long pontosAcumulados = 3_234_845_223L; //L no final para forçar o long

        // Tipos numéricos reais
        float salario = 11_445.44F; // F no final para forçar o float
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        //Tipo caractere
        char status = 'A'; //Ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDevoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias?" + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
