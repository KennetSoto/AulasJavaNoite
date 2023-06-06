package exGerencia;
/*
 * Faça um programa que tenha uma classe funcionário com os atributos nome, cargo, 
 * salario. Verifique o salario e o cargo, se for gerente e ganhar menos que 5 mil, 
 * recebe um bônus no salario de 1.5 % no valor do salario base, se for funcionário 
 * e ganhar menos que 1500 ganha 2% sobre o salario base. Mostre o valor do salario 
 * bruto atualizado e os dados do funcionário;
 */

public class Funcionario {
	public String nome;
	public String cargo;
	public double salario;
	
	public void verificaSalario() {
		if(cargo.equalsIgnoreCase("gerente")) {
		    if (salario <= 5000) {
			    salario += (salario * 1.5)/100;
		    }
		System.out.println("O salario do trabalhador "+nome+" é "+cargo+" e o salario é "+salario);
	  }
		if(cargo.equalsIgnoreCase("funcionario")){
			if(salario <= 1500) {
			   salario += (salario * 2)/100;
			}
		System.out.println("O trabalhador "+nome+" é "+cargo+" e o salario com bonus é "+salario);
		}
    }
}
