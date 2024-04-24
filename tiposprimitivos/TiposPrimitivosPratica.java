package tiposprimitivos;

/*
*Tipos primitivos são providos pela linguagem nativamente.
 */

public class TiposPrimitivosPratica {
    public static void main(String[] args) {
        // Caracteres ou Characters
        char primeiraLetraDoNome = 'I';
        char primeiraLetraDoNomeASCII = 73;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        // Inteiros ou Integers
        byte nota = 10; // -128 a 127;
        short itensComprados = 2; // -32768 a 32767
        int quantidadeEstoque = 23_366; // -2_147_483_648 a 2_147_483_647
        long numeroMuitoGrande = 47647862378462378L; // 19 digitos

        // Tipos Decimais
        float peso = 1.5f; // 6 - 7 casas decimais
        double preco = 24.99; // ~15 casas decimais

       // Booleanos ou Booleans
        boolean verdadeiro = true;
        boolean falso = false;
}
}
