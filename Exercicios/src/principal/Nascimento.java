package principal;

import java.util.Scanner;

/*
 * Fa�a um aplicativo que receba o ano de nascimento e o ano atual e mostre na tela sua idade;
 */

public class Nascimento {
	public void calculo(){
		Scanner scan = new Scanner(System.in);
		int aniver, ano;
		
		System.out.println("Digite o ano atual: ");
		ano = scan.nextInt();
		
		System.out.println("Digite o ano do seu Nascimento: ");
		aniver = scan.nextInt();
		
		int idade = ano - aniver;
		
		System.out.printf("No ano de %d o solicitante tem %d anos", ano, idade);
		scan.close();
	}

	public static void main(String[] args) {
		Nascimento obj = new Nascimento();
		obj.calculo();
		
	}

}
