package principal;

import java.util.Scanner;

public class Media {
	public void notas() {
		Scanner scan = new Scanner(System.in);
		int numA, numB, numC, numD, medias;
		System.out.println("digite a nota primeiro aluno: ");
		numA = scan.nextInt();
		
		System.out.println("digite a nota segundo aluno: ");
		numB = scan.nextInt();
		
		System.out.println("digite a nota terceiro aluno: ");
		numC = scan.nextInt();
		
		System.out.println("digite a nota quarto aluno: ");
		numD = scan.nextInt();
		
		
		medias = (numA + numB + numC + numD)/4;
		System.out.println("A media da sala �: "+ medias);
		
		scan.close();
	}

	public static void main(String[] args) {
		Media obj = new Media();
		obj.notas();
		
	}

}
