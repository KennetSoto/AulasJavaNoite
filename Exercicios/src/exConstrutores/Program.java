package exConstrutores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa;
		
		//quando é lista o nome da variavel vem com plural
		List<Pessoa> pessoas = new ArrayList<>();
		
		char opcao;
		
		do {
			//criando nova instancia
			pessoa = new Pessoa();
			
			System.out.println("Entre com nome:");
			pessoa.setNome(sc.nextLine());
			
			System.out.println("Entre com telefone:");
			pessoa.setTelefone(sc.nextLine());
			
			System.out.println("Entre com idade:");
			pessoa.setIdade(sc.nextInt());
			
			//adicionando pessoas
			pessoas.add(pessoa);
			
			System.out.println("Deseja cadastrar mais uma pessoa? ");
			System.out.print("s/n");
			opcao = sc.next().charAt(0);
			
			//limpar buffer do scanner
			sc.nextLine();
			
			//verificando a opcao
			//trocando para caixa alta = Character.toLowerCase
		}while(Character.toLowerCase(opcao) == 's');

		//forach para conferir pessoas
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
	
		sc.close();
	}
}
