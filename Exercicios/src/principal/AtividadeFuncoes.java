package principal;
/*
 * 1) Fa�a um programa que receba um valor em real e converta para d�lares na cota��o
atual, fa�a o inverso tamb�m;

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
		

		System.out.printf("O valor convertido de R$"+ real+" para dollar �: $%.2f", dollarConvertido);
		System.out.println();
		System.out.printf("O valor convertido de $"+ dollar+" para real �: R$%.2f", realConvertido);
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
