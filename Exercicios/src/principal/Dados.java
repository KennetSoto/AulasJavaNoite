package principal;

import java.util.Random;

/*
 * Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, mostre a soma dos n�meros que sa�ram.
 *  Se 2 dados sa�rem com a mesma numera��o o jogador ganha 2 pontos de b�nus, se os 3 dados sa�rem com 
 *  a mesma numera��o ele ganha 6 pontos de b�nus e deve aparecer a mensagem "voc� � muito sortudo". 
 *  Se o total da soma dos dados mais o b�nus for menor que 15 o jogador perde e apresenta a mensagem:
 *   "Lamento, mas voc� perdeu" , se for maior ou igual a 15 ele ganha e apresenta a mensagem "
parab�ns, voc� ganhou!" .
 */

public class Dados {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int dado1, dado2, dado3;
		int bonus =0;
		int pontos = 0;
		
		dado1 = aleatorio.nextInt(6);
		System.out.println("Primeiro dado saiu: "+ dado1);
		
		dado2 = aleatorio.nextInt(6);
		System.out.println("Segundo dado saiu: "+ dado2);
		
		dado3 = aleatorio.nextInt(6);
		System.out.println("Terceiro dado saiu: "+ dado3);
		
		System.out.println();
		
		pontos = dado1 + dado2 + dado3;
		
		if (dado1 == dado2 && dado2 == dado3) {
			bonus = 6;
			pontos += bonus;
			System.out.println("Voce � muito sortudo");
			System.out.println("Ganhou 6 pontos de bonus");
		}
		else if ((dado1 == dado2) || (dado2 ==  dado3) || (dado3 == dado1)) {
			bonus = 2;
			System.out.println("Ganhou 2 pontos de bonus");
			pontos += bonus;
		}
		System.out.println();
		System.out.println("Total de pontos: "+pontos);
		if (pontos < 15) {
			System.out.println("Lamento, mas voc� perdeu");
		}
		if (pontos >= 15) {
			System.out.println("Parab�ns, voc� ganhou");
		}
				
		}
}
