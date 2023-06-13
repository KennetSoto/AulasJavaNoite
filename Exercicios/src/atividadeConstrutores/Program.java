package atividadeConstrutores;

import java.util.Scanner;
/*
 *Crie uma classe Livro onde seja obrigatório a inserção de do nome, 
 *titulo e valor do livro. Caso o livro ultrapasse o valor de  100 reais,
 *adicione uma taxa de 30% de imposto, você não poderá criar um método especifico para isso,
 *apenas os métodos get e set já existentes. Mostre os dados do livro cadastrado.
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
