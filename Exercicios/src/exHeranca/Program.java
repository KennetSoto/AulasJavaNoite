package exHeranca;
/*
 * Crie uma classe funcionário, e 2 classes filhas sendo gerente e secretaria; 
 * os atributos da classe funcionário são: nome, idade, sexo, departamento, e salario; 
 * gerente ganha uma bonificação de 500 reais e os demais funcionários ganham uma bonificação de  150 reais por mês.
 *  mostre os dados dos funcionários e seus respectivos salários acrescidos da bonificação;
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
