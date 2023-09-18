public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitvos - Os oito tipos primitivos em Java são: int, byte, short, long, float, double, boolean e char – esses tipos não são considerados objetos, e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)
        
        //estudar a classe String que representa texto na aplicação

        String meuNome = "Maiara Viana";

        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        /* Para declarar uma variável como uma constante, utila-se a palavra "final",
         por convenção, esta variável deverá ser escrita toda em caixa alta. */

        final double VALOR_DE_PI = 3.14;
    }
}
