package principal;

import java.util.Scanner;
/*
Fa�a um programa que receba o tipo de opera��o a ser realizada 
(soma, divis�o, multiplica��o, subtra��o) e imprima a tabuada desse
 n�mero. ex.: 1x2 = 2, 1x3 = 3...
*/

public class Exrepticao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char adicao = '+';
		char subtracao = '-';
		char multiplicacao = '*';
		char divisao = '/';
		int num2 = 0;
		int tabuada =0;
		
		System.out.println("Digite que tipo de tabuada voce quer:");
		System.out.println("adi��o: '+', subtra��o: '-', multiplica��o: '*',divis�o: '/':");
		char operacao = scan.next().charAt(0);
		
		System.out.println("Digite o numero da tabuada que voc� quer: ");
		int num = scan.nextInt();
		
		if( operacao == '+') {
			for (int cont =1; cont <=10; cont++) {
				tabuada = num + cont;
				System.out.println( num+" + "+cont+"= "+tabuada);
			}
		}
		if( operacao == '-') {
			num2 = num;
			for (int cont =1; cont <=10; cont++) {
				System.out.println((num2 + cont)+" - "+(num)+"= "+((num2 +cont) - num));
			}
		}
		if( operacao == '*') {
			for (int cont =1; cont <=10; cont++) {
				tabuada = num * cont;
				System.out.println( num+" * "+cont+"= "+tabuada);
			}
		}
		if( operacao == '/') {
			for (int cont =1; cont <=10;cont++) {
				num2 = num * cont;
				tabuada = num2 / num;
				System.out.printf("\n %d / %d= %d", num2, num,tabuada);
				}
		}
		scan.close();
	}
}