package exEstoque;

import java.util.Scanner;
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
	
	System.out.println("Entre com nome do produto: ");
    String nome = sc.nextLine();
    
    System.out.println("Entre com a quantidade: ");
    int quantidade = sc.nextInt();
    
    System.out.println("Entre com preço: ");
    double preco = sc.nextDouble();
    
    ValorEstoque valor = new ValorEstoque();
    
    System.out.println(valor);
    sc.close();
	
	}
}
