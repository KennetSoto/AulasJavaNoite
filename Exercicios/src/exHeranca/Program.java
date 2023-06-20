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
	//pode chamar classe funcionario por causa do polimorfismo
	Funcionarios gerente = new Gerente("Abel", 43, 'm', "técnico", 5000);
	//pode chamr direto referente a classe
	Secretaria secretaria = new Secretaria("Leila", 50, 'f', "presidente", 3000);
	
	
	//chamar o metodo que altera os valores para serem atribuidos no resultado
	funcionarios.abono();
	gerente.abono();
	secretaria.abono();
	
	System.out.println(funcionarios);
	System.out.println(gerente);
	System.out.println(secretaria);
		
	sc.close();
	}
}
