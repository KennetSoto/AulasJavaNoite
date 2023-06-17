package exHeranca;

public class Funcionarios {
	public String nome;
	public int idade;
	public char sexo;
	public String departamento;
	public double salario;
	
	public Funcionarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Funcionarios(String nome, int idade, char sexo, String departamento, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.departamento = departamento;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void abono(double salario) {
		salario +=500;
	}

	@Override
	public String toString() {
		return "Funcionarios [nome= " + nome + ", idade= " + idade + ", sexo= " + sexo + ", departamento= " + departamento
				+ ", salario= " +getSalario() + "]";
	}

}
