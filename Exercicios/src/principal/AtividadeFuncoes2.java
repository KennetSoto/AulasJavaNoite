package principal;
/*
 * 2) Faça um programa, com uma função que necessite de três argumentos
 *  e que forneça a soma desses três argumentos
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
