package principal;

import java.util.Random;

/*
 * Faça um programa para gerar 3 números aleatórios para 3 dados, mostre a soma dos números que saíram.
 *  Se 2 dados saírem com a mesma numeração o jogador ganha 2 pontos de bônus, se os 3 dados saírem com 
 *  a mesma numeração ele ganha 6 pontos de bônus e deve aparecer a mensagem "você é muito sortudo". 
 *  Se o total da soma dos dados mais o bônus for menor que 15 o jogador perde e apresenta a mensagem:
 *   "Lamento, mas você perdeu" , se for maior ou igual a 15 ele ganha e apresenta a mensagem "
parabéns, você ganhou!" .
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
			System.out.println("Voce é muito sortudo");
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
			System.out.println("Lamento, mas você perdeu");
		}
		if (pontos >= 15) {
			System.out.println("Parabéns, você ganhou");
		}
				
		}
}
