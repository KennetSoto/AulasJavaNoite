package principal;
/*
 * 1) Faça um programa que receba um valor em real e converta para dólares na cotação
atual, faça o inverso também;

 */

import java.util.Scanner;

public class AtividadeFuncoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o valor em real:");
		 double real = sc.nextDouble();
    	 double taxaCambio = 5.05;
    	 System.out.println("Digite o valor em dollar:");
		 double dollar = sc.nextDouble();
		 double dollarConvertido = conversao(taxaCambio, real);
		 double realConvertido = conversao2(taxaCambio,dollar);
		

		System.out.printf("O valor convertido de R$"+ real+" para dollar é: $%.2f", dollarConvertido);
		System.out.println();
		System.out.printf("O valor convertido de $"+ dollar+" para real é: R$%.2f", realConvertido);
		sc.close();
	}

	public static double conversao( double taxaCambio, double real) {
		 double dollar = real * taxaCambio;
		 return dollar;
	 }
	public static double conversao2( double taxaCambio, double dollar) {
		 double realConvertido = dollar / taxaCambio;
		 return realConvertido;
	}

}
