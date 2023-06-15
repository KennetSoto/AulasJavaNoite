package exEstoque;

import java.util.Scanner;
import exEstoque.ValorEstoque;
/*
 * Crie uma classe produto contendo os atributos descrição, quantidade, preço, 
 * valor total em estoque. Pense em uma forma de atualizar o valor total em
 * estoque através de 2 métodos, igual ao exemplo de conta que fizemos.
  Mostre os dados na tela, faça uma inserção dos dados e mostre os dados novamente,
  depois faça uma venda e mostre novamente os dados atualizados. 
  Lembre-se de usar o private para os atributos e os métodos get e set para cada atributo que possa ser acessado.
 */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ValorEstoque produto = new ValorEstoque();

		System.out.print("Entre com o nome do produto: ");
		produto.setDescricao(sc.nextLine());

		System.out.print("Entre com a quantidade a ser adicionada: ");
		produto.adicionaProduto(sc.nextInt());

		System.out.print("Entre com o valor unitário do produto: R$");
		produto.setPreco(sc.nextDouble());

		System.out.println(produto);

		System.out.println("Quantidade de unidades a ser vendida: ");
		produto.removeProduto(sc.nextInt());

		System.out.println(produto);

		sc.close();

	}
}

