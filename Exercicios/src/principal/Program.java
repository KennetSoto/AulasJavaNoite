package principal;

import java.util.Scanner;

public class Program {
	public void somaDois() {
		Scanner scan = new Scanner(System.in);
		int numA, numB, soma;
		System.out.println("digite o primeiro numero: ");
		numA = scan.nextInt();
		
		System.out.println("digite o segundo numero: ");
		numB = scan.nextInt();
		
		soma = numA + numB;
		System.out.println("A soma dos numeros �: "+ soma);
		
		scan.close();
	}
	public static void main(String[] args) {
		Program obj = new Program();
		obj.somaDois();
	}
}
