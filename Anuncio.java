package pacote;

import java.util.ArrayList;

public abstract class Anuncio{
	private String emailVendedor;
	Contato contato;
	float valor;
	ArrayList<String> secao;
	
	Anuncio(String email, Contato contato, float valor, String secao) {
		this.emailVendedor = email;
		this.contato = contato;
		this.valor = valor;
		this.secao= new ArrayList<String>();
		this.secao.add(secao);
		this.secao.add(secao);
		
	}
}
