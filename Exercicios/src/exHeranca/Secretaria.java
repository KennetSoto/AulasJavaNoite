package exHeranca;

public class Secretaria extends Funcionarios {

	public Secretaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretaria(String nome, int idade, char sexo, String departamento, double salario) {
		super(nome, idade, sexo, departamento, salario);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void abono() {
		this.salario += 150.00;
		
	}

}
