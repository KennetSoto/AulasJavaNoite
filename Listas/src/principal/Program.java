package principal;

import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String []args) {

	List<String> nomes = new ArrayList<>();
	
	//adiciona dados da lista
	nomes.add("Luan");
	nomes.add("Maria");
	nomes.add("Grogu");
	nomes.add("Refri Poti");
	
	//mostra dados da lista
	for(String nome : nomes) {
		System.out.println("Nome: "+nome);
	}
	
	//remove os dados da lista
	nomes.remove(2);
	for(String nome: nomes) {
		System.out.println("nome: "+ nome);
	}
	
	//obtem o dado da lista por indice (posiçao na memoria)
	System.out.println(nomes.get(3));

	System.out.println(nomes.equals("Luan"));
	
	//stream = procurar, filter = filtrar, findFirst = primeiro resultado que achar, orElse retorna nulo se nao achar
	String dado = nomes.stream().filter(x -> x =="Luan").findFirst().orElse(null);
	
	//Imprimindo em ordem alfabetica
	Collections.sort(nomes);
	System.out.println("Imprimindo em ordem alfabetica: ");
	for(String nome : nomes) {
		System.out.println("Nomes: "+nome);
	}
	
	System.out.println(dado);
		
    }
}
