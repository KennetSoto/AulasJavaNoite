package principal;
/*
 * 1) Fa�a um programa que receba um valor em real e converta para d�lares na cota��o
atual, fa�a o inverso tamb�m;

3) Fa�a um programa com uma fun��o que recebe dois par�metros (valorDoProduto, lucroProduto) os produtos a serem 
vendidos recebem o pre�o de custo e retorna o valor com uma porcentagem aplicada de lucro, por exemplo: 
se um produto custa 10,00 e � aplicada uma taxa de 10 % de lucro, o produto ser� vendido por 11,00;
 */

import java.util.Scanner;

public class AtividadeFuncoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o valor em real:");
		 double real = sc.nextDouble();
		 double taxaCambio = 5.05;
		 double dollar = conversao(taxaCambio, real);
		 
		
		 
		System.out.printf("O valor convertido de R$"+ real+" para dollar �: $%.2f", dollar);
		sc.close();
	}

	public static double conversao( double taxaCambio, double real) {
		 double dollar = real * taxaCambio;
		 return dollar;
	 }

}
