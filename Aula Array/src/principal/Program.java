package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//declarando um array
		int [] array = new int [5];
		//atribuindo a valores da array
		int [] array2 = {100, 250, 02, 25,88};
		
		//atribuindo a cada posição da array
		array [0]=10;
		array [2]=25;
		array [2]=1;
		array [3]=99;
		array [4]=33;
		
		//imprimindo a array
		System.out.println(array[4]);
		System.out.println(array2[2]);
		System.out.println();
		
		System.out.println("Quantos nomes deseja salvar na memoria: ");
		int qtd = leia.nextInt();
		leia.nextLine();// para que o Scanner saiba que tem que ir para proxima linha
		String[] arrayNome = new String[qtd];
		
		//for para inserir dados no array
		//length indica que a condição do for deve seguir ate o comprimento total do array
		for(int cont =0; cont < arrayNome.length; cont++) {
			System.out.println("Entre com nome:");
			arrayNome[cont] = leia.nextLine();
		}
		//for para exibir os dados do array
		for(int cont =0; cont < arrayNome.length; cont++) {
			System.out.println("Impressão array"+arrayNome[cont]);
		}
		//usando foreach para imprimir os dados
		for(String nome : arrayNome) {
			System.out.println("Impressão foreach"+nome);
		}
		
		//para verificar se um dado do array é igual ao buscado
		String verificar = "Dudu";
		//utilizando equals para comparar tipo e valor do dado
		if(arrayNome[0].equals(verificar)) {
			System.out.println("É igual");
		}
		System.out.println();
		
	    String nome1 = new String("Dudu");
	    String nome2 = new String("Dudu");
	    String nome3 = "Dudu";
	    
	    //retorna o false porque == compara so o tipo da String
	    System.out.println(nome1 == nome2);
	    //retorna o true porque equals compara o tipo e o valor da String
	    System.out.println(nome1.equals(nome3));
	    
	    
		leia.close();
	}
}
