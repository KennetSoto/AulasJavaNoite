package principal;

import java.util.Scanner;

/*
 * Faça um programa que receba o salario base de um funcionário (salario bruto)
 * faça o desconto de inss 5% e IR 11% mostre o valor dos descontos, e o valor do salario liquido
 */
public class Imposto {
	public void descontos() {
		Scanner scan = new Scanner(System.in);
		double salario;
		double inss;
		double ir;
		double salarioLiquido;
		
		System.out.println("Diga o seu salario: R$");
		salario = scan.nextDouble();
		
		inss = 5% salario;
		System.out.println("Desconto do Inss: R$"+ inss);
		
		ir = 11% salario;
		System.out.println("Desconto do IR: R$"+ ir);
		
		salarioLiquido = (salario - ir - inss);
		
		System.out.println("O valor do salario liquido restante: R$"+salarioLiquido);
		 scan.close();
	}

	public static void main(String[] args) {
		Imposto obj = new Imposto();
		obj.descontos();
	}

}
