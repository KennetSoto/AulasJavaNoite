package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
	    System.out.println("Digite o nome da pessoa: ");
		pessoa.nome = sc.nextLine();
		
		System.out.println("Digite o ano de nascimento: ");
		//int ano = sc.nextInt();
		//pode ser chamado direto ao receber dados
		pessoa.retornaIdade(sc.nextInt());
		
		System.out.println("Digite o sexo da pessoa (M) ou (F): ");
		pessoa.sexo = sc.next().charAt(0);
		
		//retorno dos dados computados no metodo
		//pessoa.retornaIdade(ano);
		
		System.out.print("Dados da pessoa, nome: "+pessoa.nome+", idade: "+pessoa.idade+", sexo: "+ pessoa.sexo);
		
       sc.close();
	}

}
