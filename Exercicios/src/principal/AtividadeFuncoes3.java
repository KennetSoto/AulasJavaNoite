package principal;
/*
 * 3) Fa�a um programa com uma fun��o que recebe dois par�metros (valorDoProduto, lucroProduto) os produtos a serem 
vendidos recebem o pre�o de custo e retorna o valor com uma porcentagem aplicada de lucro, por exemplo: 
se um produto custa 10,00 e � aplicada uma taxa de 10 % de lucro, o produto ser� vendido por 11,00;
 */

import java.util.Scanner;

public class AtividadeFuncoes3 {

	public static void main(String[] args) {
		System.out.println("O valor final do produto devera ser: R$"+lucro(0, 0));
		
	}
		public static double lucro(double valorDoProduto, double lucroProduto){
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o custo do produto: R$");
			double custoDoProduto = sc.nextDouble();
			System.out.println("Digite a porcentagem de lucro estimada: ");
			double porcentagem = sc.nextDouble();
			lucroProduto = (custoDoProduto * porcentagem/100);
			valorDoProduto = custoDoProduto + lucroProduto;
			sc.close();
			return valorDoProduto;		
			
		}
		
	}

