package principal;
/*
 * 2) Fa�a um programa, com uma fun��o que necessite de tr�s argumentos
 *  e que forne�a a soma desses tr�s argumentos
 */

import java.util.Random;

public class AtividadeFuncoes2 {

	public static void main(String[] args) {
		Random randon = new Random();
		int a = randon.nextInt(10);
		int b = randon.nextInt(10);
		int c = randon.nextInt(10);
		int soma = funcSoma(a, b , c);
		System.out.println(a +" + "+ b +" + "+ c +" = " +soma);

	}
	public static int funcSoma(int a,int  b,int  c) {
		int soma =  a + b + c;
		return soma;
	}

	

}
