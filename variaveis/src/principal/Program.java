package principal;

public class Program {

	public static void main(String[] args) {
		//PRIMEIRA AULA JAVA
		
		/*
		 * variaveis s�o espacos alocados na memoria que salvam uma informa��o (um dado) 
		 */
	
		// O tipo int armazena numeros inteiros, s�o on numeros 1, 2, 3, 10, 23...
		int numero = 23;
		
		// O tipo double s�o numeros que armazenam numeros com casas decimais: 10.50, 25,99...
		double precoDaCamisa = 70.5;
		
		// O tipo String � uma classe de java utilizada para armazenar cadeias de caracteres,
		// com aspas duplas: "frases por exemplo", "nomes"..
		String nome = "Veiga";
		
		// O tipo Char armazena um caractere � um tipo literal e a sua inicializa��o � feita 
		// com aspas simples 'a', 'b', '1','2'...
		char sexo = 'M';
		
		//Imprimindo valor das variaveis
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
		
		
		//println serve para imprimir pulando uma linha
		System.out.println();
		System.out.println();
		
		//print serve para imprimir tudo na mesma linha
		System.out.print(numero);
		System.out.print(precoDaCamisa);
		System.out.print(nome);
		System.out.print(sexo);
		System.out.println();
		System.out.println();
		
		//concatena��o com +
		System.out.println(numero + " " + precoDaCamisa + " " + nome  + " " + sexo);
		System.out.println(nome + " quer comprar uma camisa com valor de R$:" + precoDaCamisa);
		
		nome = "Pel�";
		numero = 10;
		precoDaCamisa = 100.00;
		System.out.println();
		System.out.println();
		System.out.println("A camisa com numero " + numero + " tem o pre�o de R$" + precoDaCamisa + " "
				+ "se quiser o nome:" + nome + " e o sexo " + sexo + " vai ser mais caro!");
		System.out.println();
		System.out.println();
		
		//somando variaveis
		int num2 = 5;
		int num3 =10;
		int soma = num2 + num3;
		System.out.println("O resultado da soma �: " + soma);
		System.out.println("O resultado da soma �: " + (num2 + num3));
		System.out.println();
		System.out.println();
		
		//concatenando e imprimindo as variaveis
		String nome2 = "Rony";
		int idade = 27;
		double saldo = 1000000;
		System.out.println(nome2 + " tem " + idade + " anos e possui " + saldo +" na conta");
		
	}
}
