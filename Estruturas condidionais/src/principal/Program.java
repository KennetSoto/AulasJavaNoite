package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Operadores de comparação: 
		 * < maior que 
		 * < menor que 
		 * >= maior igual 
		 * >= menor
		 * igual 
		 * != diferente 
		 * == igual a
		 *
		 * Operadores Logicos: 
		 * && = e 
		 * || = ou 
		 * ! = negação
		 */

		int numero1 = 10;
		int numero2 = 20;
		boolean condicao = false;

		// comparando se o numero1 é maior (>) que o numero2
		if (numero1 > numero2) {
			System.out.println("numero 1 é o maior");
		} else {
			System.out.println("numero 2 é o maior");
		}

		// comparando se condicao é diferente (!=) de verdadeiro
		if (condicao != true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

		// comparando se condicao é diferente (!variavel) de verdadeiro na declaração
		if (!condicao == true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

		// exemplo usando resto da divisao

		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.println("Entre com numero para saber se é par ou impar:");
		numero = leia.nextInt();

		// dividindo a variavel numero por 2 e se o resto for igual (==) a 0 entao é par
		// calcula o resto da divisao (%)
		if (numero % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O numero é impar");
		}

		leia.close();
	}

}
