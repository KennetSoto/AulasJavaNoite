package atividadeConstrutores;

import java.util.Scanner;
/*
 *Crie uma classe Livro onde seja obrigat�rio a inser��o de do nome, 
 *titulo e valor do livro. Caso o livro ultrapasse o valor de  100 reais,
 *adicione uma taxa de 30% de imposto, voc� n�o poder� criar um m�todo especifico para isso,
 *apenas os m�todos get e set j� existentes. Mostre os dados do livro cadastrado.
 */
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com nome:");
		String nome = sc.nextLine();
		System.out.println("Entre com titulo:");
		String titulo = sc.nextLine();
		System.out.println("Entre com valor do Livro: ");
		double valor = sc.nextDouble();
		
		Livro livro = new Livro();
		System.out.println(livro);
		
		sc.close();
	}

}
