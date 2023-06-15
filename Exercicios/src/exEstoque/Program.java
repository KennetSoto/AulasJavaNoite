package exEstoque;

import java.util.Scanner;
import exEstoque.ValorEstoque;
/*
 * Crie uma classe produto contendo os atributos descri��o, quantidade, pre�o, 
 * valor total em estoque. Pense em uma forma de atualizar o valor total em
 * estoque atrav�s de 2 m�todos, igual ao exemplo de conta que fizemos.
  Mostre os dados na tela, fa�a uma inser��o dos dados e mostre os dados novamente,
  depois fa�a uma venda e mostre novamente os dados atualizados. 
  Lembre-se de usar o private para os atributos e os m�todos get e set para cada atributo que possa ser acessado.
 */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ValorEstoque produto = new ValorEstoque();

		System.out.print("Entre com o nome do produto: ");
		produto.setDescricao(sc.nextLine());

		System.out.print("Entre com a quantidade a ser adicionada: ");
		produto.adicionaProduto(sc.nextInt());

		System.out.print("Entre com o valor unit�rio do produto: R$");
		produto.setPreco(sc.nextDouble());

		System.out.println(produto);

		System.out.println("Quantidade de unidades a ser vendida: ");
		produto.removeProduto(sc.nextInt());

		System.out.println(produto);

		sc.close();

	}
}

