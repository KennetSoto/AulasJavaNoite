package exGerencia;

import java.util.Scanner;
import exGerencia.Funcionario;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Digite o cargo: (funcionario) ou (gerente): ");
		func.cargo = sc.nextLine();
		
		System.out.println("Digite o salario: ");
		func.salario  = sc.nextDouble();
		
		func.verificaSalario();
		
	}

}
