package principal;

import java.util.Scanner;

/*
 * *faça um programa que receba 50 números, mostre os números pares 
* contidos em cada posição do vetor e a sua posição (indice) do vetor;
 */
public class AtividadeArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = new int[5];
		
		for(int cont = 0; cont<array.length; cont++) {
			System.out.printf("Digite o valor da %d: ", cont);
			array[cont] = sc.nextInt();			
		}
		for(int cont = 0; cont<array.length; cont++) {
		if(array[cont] %2==0) {
			System.out.println("A posição do array é "+cont+" e o valor no array ["+array[cont]+"]");
		}
			
		}
	}

}
