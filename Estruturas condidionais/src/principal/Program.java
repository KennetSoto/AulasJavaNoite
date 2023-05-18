package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Operadores de compara��o: 
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
		 * ! = nega��o
		 */

		int numero1 = 10;
		int numero2 = 20;
		boolean condicao = false;

		// comparando se o numero1 � maior (>) que o numero2
		if (numero1 > numero2) {
			System.out.println("numero 1 � o maior");
		} else {
			System.out.println("numero 2 � o maior");
		}

		// comparando se condicao � diferente (!=) de verdadeiro
		if (condicao != true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

		// comparando se condicao � diferente (!variavel) de verdadeiro na declara��o
		if (!condicao == true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

		// exemplo usando resto da divisao

		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.println("Entre com numero para saber se � par ou impar:");
		numero = leia.nextInt();

		// dividindo a variavel numero por 2 e se o resto for igual (==) a 0 entao � par
		// calcula o resto da divisao (%)
		if (numero % 2 == 0) {
			System.out.println("O numero � par");
		} else {
			System.out.println("O numero � impar");
		}

		leia.close();
	}

}
