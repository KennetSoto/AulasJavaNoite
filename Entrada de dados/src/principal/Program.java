package principal;

//Control + Shift + O para Importar todas as classes declaradas
//importa��o da biblioteca Scanner
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		//instanciou a classe Scanner e passou parametro
		Scanner leia = new Scanner(System.in);
		
		int idade;
		double precoDaCamisa;
		String nome;
		char sexo;
				
		System.out.println("Entre com seu nome: ");
		//O metodo nextLine le ate encontrar uma quebra de linha, l� a entrada do usuario como uma string
		//nextline() tambem serve para encerrar uma instru��o, caso de erro int/string por exemplo
		nome = leia.nextLine();
		
		System.out.println("Entre com sexo: ");
		//charAt(0) � para definir o indice que vamos capturar na posi��o 0,no caso(m ou f)
		sexo = leia.next().charAt(0);	
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite o pre�o da camisa: ");
		precoDaCamisa = leia.nextDouble();
		
		System.out.println("Nome digitado:"+nome);
		System.out.println("Sexo digitado:"+sexo);
		System.out.println("Idade digitado:"+idade);
		System.out.println("Valor digitado:"+precoDaCamisa);
				
		//operadores aritmeticos (+, -, *, /, %)
		//
		
		//fechar Scanner � boa pratica, serve para nao deixar o objeto rodando, economizar os recursos
		leia.close();
	}
}
