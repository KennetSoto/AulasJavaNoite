package atividadeConstrutores;

public class Livro {
	//Ordem sugerida a seguir na classe:
	//1º atributos da classe
	// 2º construtores
	// 3º metodo get e set
	// 4º demais métodos
	//get é pra obter e set é pra atribuir
	//quando precisa de dados obrigatórios faz o construtor (Alt + Shift + S Constructor superClass) 
	// o this é uma palavra para distinguir o que é atributo da classe para o parametro recebido

	private String nomeLivro;
	private int edicao;
	private double valor;

	public Livro(String nomeLivro, int edicao, double valor) {
		super();
		this.nomeLivro = nomeLivro;
		this.edicao = edicao;
		this.valor = valor;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 100) {
			this.valor+= (valor * 0.30);
		}
		else {
			this.valor = valor;
		}



	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Livro: " + nomeLivro + "\nEdição: " + edicao + "\nValor: R$ " + valor;

	}


}