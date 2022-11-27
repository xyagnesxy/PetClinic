package pacote;

public class AnuncioDestaque extends Anuncio{
	String descricao;//limitar a 50 palavras;
	String imagem;
	
	AnuncioDestaque(String email, Contato contato, float valor, String secao, String descricao) {
		super(email, contato, valor, secao);
		this.setDescricao(descricao);
		this.setImagem();
		
		
		
	}
	void setDescricao(String descricao) {
		
	}
	void setImagem() {
		
	}
}
