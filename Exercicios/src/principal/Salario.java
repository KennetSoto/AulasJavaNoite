package principal;

import java.util.Scanner;

public class Salario {
	public void calculoSalario() {
		Scanner scan = new Scanner(System.in);
		double sal;
		int horas;
		
		System.out.println("digite quanto voce ganha por hora: ");
		sal = scan.nextDouble();
		
		System.out.println("digite quantas horas trabalhou nesse m�s: ");
		horas = scan.nextInt();
		
		double pagamento = sal * horas;
		System.out.println("Voc� tem a receber: "+ pagamento);
		scan.close();
	}

	public static void main(String[] args) {
		Salario obj = new Salario();
		obj.calculoSalario();
	

	}

}
