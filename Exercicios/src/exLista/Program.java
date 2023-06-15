package exLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Program {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Contato contato = new Contato();
		
		List<Contato> contatos = new ArrayList<>();
		
		char opcao;
		do {
			
			contato = new Contato();
			
			System.out.println("Insira o nome do contato: ");
			contato.setNome(sc.nextLine());
			
			sc.nextLine();
			
			System.out.println("Insira a idade do contato: ");
			contato.setIdade(sc.nextInt());
			
			sc.nextLine();
			
			System.out.println("Insira o telefone do contato: ");
			contato.setTelefone(sc.nextLine());
			
			contatos.add(contato);
			
			System.out.println("Deseja cadastrar mais uma pessoa? ");
			System.out.print("s/n");
			opcao = sc.next().charAt(0);
			
			
			
		}while(opcao == 's');
		
		
		System.out.println("Lista de contatos: ");
		for(Contato c : contatos) {
			System.out.println("Nomes: "+c);
		}
	
		}
}
