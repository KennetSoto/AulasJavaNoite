package exHeranca;
/*
 * Crie uma classe funcion�rio, e 2 classes filhas sendo gerente e secretaria; 
 * os atributos da classe funcion�rio s�o: nome, idade, sexo, departamento, e salario; 
 * gerente ganha uma bonifica��o de 500 reais e os demais funcion�rios ganham uma bonifica��o de  150 reais por m�s.
 *  mostre os dados dos funcion�rios e seus respectivos sal�rios acrescidos da bonifica��o;
 */

import java.util.Scanner;

public class Program {
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);

	Funcionarios funcionarios = new Funcionarios("Dudu", 34, 'm', "futebol", 10000);
	Gerente gerente = new Gerente("Abel", 43, 'm', "tecnico", 5000);
	Secretaria secretaria = new Secretaria("Leila", 50, 'f', "presidente", 3000);
	
	System.out.println(funcionarios);
	System.out.println(gerente);
	System.out.println(secretaria);
		
	sc.close();
	}
}
