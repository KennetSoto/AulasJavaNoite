package exHeranca;

public class Gerente extends Funcionarios {

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, int idade, char sexo, String departamento, double salario) {
		super(nome, idade, sexo, departamento, salario);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void abono() {
		this.salario += 500.00;
	}
	

}
