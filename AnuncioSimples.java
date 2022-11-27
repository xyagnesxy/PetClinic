package pacote;

public class AnuncioSimples extends Anuncio {
	String descricao;//limitar a 20 palavras
	
	AnuncioSimples(String email, Contato contato, float valor, String secao, String descricao) {
		super(email, contato, valor, secao);
		this.setDescricao(descricao);
	}
	
	void setDescricao(String descricao) {
		
	}
}
