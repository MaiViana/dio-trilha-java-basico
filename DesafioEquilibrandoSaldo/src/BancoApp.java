import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class BancoApp {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Digite o valor inicial:");
        double valorInicial = scanner.nextDouble();  
        System.out.println("Digite a taxa de juros:");
        double taxaJuros = scanner.nextDouble();
        System.out.println("Digite a quantidade anos do investimento:");
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial *(Math.pow(1 + taxaJuros, periodo)) ;

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}