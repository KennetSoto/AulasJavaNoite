package exEstoque;

public class ValorEstoque {
	public int quantidade;
	public double preco;
	public String descicao;
	
	public ValorEstoque() {
		super();
	}
	public ValorEstoque(int quantidade, double preco, String descicao) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.descicao = descicao;
	}
	

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescicao() {
		return descicao;
	}

	public void setDescicao(String descicao) {
		this.descicao = descicao;
	}

}
