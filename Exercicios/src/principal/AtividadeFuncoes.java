package principal;
/*
 * 1) Faça um programa que receba um valor em real e converta para dólares na cotação
atual, faça o inverso também;

3) Faça um programa com uma função que recebe dois parâmetros (valorDoProduto, lucroProduto) os produtos a serem 
vendidos recebem o preço de custo e retorna o valor com uma porcentagem aplicada de lucro, por exemplo: 
se um produto custa 10,00 e é aplicada uma taxa de 10 % de lucro, o produto será vendido por 11,00;
 */

import java.util.Scanner;

public class AtividadeFuncoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o valor em real:");
		 double real = sc.nextDouble();
		 double taxaCambio = 5.05;
		 double dollar = conversao(taxaCambio, real);
		 
		
		 
		System.out.printf("O valor convertido de R$"+ real+" para dollar é: $%.2f", dollar);
		sc.close();
	}

	public static double conversao( double taxaCambio, double real) {
		 double dollar = real * taxaCambio;
		 return dollar;
	 }

}
