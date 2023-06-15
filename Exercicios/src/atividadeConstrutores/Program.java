package atividadeConstrutores;

import java.util.Scanner;
/*
 *Crie uma classe Livro onde seja obrigatório a inserção de do nome, 
 *titulo e valor do livro. Caso o livro ultrapasse o valor de  100 reais,
 *adicione uma taxa de 30% de imposto, você não poderá criar um método especifico para isso,
 *apenas os métodos get e set já existentes. Mostre os dados do livro cadastrado.
 */
import atividadeConstrutores.Livro;

public class Program {

	public static void main(String[] args) {
		/*
		 * Crie uma classe Livro onde seja obrigatório a inserção do nome, edição e
		 * valor do livro. Caso o livro ultrapasse o valor de 100 reais, adicione uma
		 * taxa de 30% de imposto, você não poderá criar um método especifico para isso,
		 * apenas os métodos get e set já existentes. Mostre os dados do livro
		 * cadastrado.
		 */

		Scanner sc = new Scanner(System.in);


		System.out.print("Entre com o nome do livro: ");
		String nomeLivro = sc.nextLine();

		System.out.print("Entre com a edição do livro: ");
		int edicao = sc.nextInt();

		System.out.print("Entre com o valor do livro: R$ ");
		double valor = sc.nextInt();


		Livro livro = new Livro (nomeLivro, edicao, valor);
		livro.setValor(valor);


		System.out.println(livro);

		sc.close();

	}
}
