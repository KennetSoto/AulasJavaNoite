package principal;

import java.util.Scanner;

/*
 * *Faça um programa que receba o nome do
aluno e as 4 notas bimestrais desse aluno e mostre a media;
 */

public class AtividadeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []nota = new int [4];
		String nomes = new String();
		int notaFinal = 0;
		int media = 0;
		
		
			System.out.println("Diga o nome do aluno: ");
			nomes = sc.nextLine();
			for(int cont = 0; cont<nota.length; cont++) {
				System.out.println("Digite a nota do Aluno: ");
				nota [cont] = sc.nextInt();
				notaFinal += nota[cont];
			}
		
		media = notaFinal /4;
		System.out.printf("A média do aluno %s é %d", nomes, media);
		
	}

}
