package pacote;

public class Contato {
	String nome;
	String telefone;
	String descricao;//limitar a 5 palavras
	
	Contato(String nome, String telefone, String descricao){
		verificaDescricao(descricao);
		this.nome = nome;
		this.telefone = telefone;
		this.descricao = descricao;
		
		
		
	}
	void verificaDescricao(String descricao) {
		//verifica se tem at� 5 palavras
		//ou corta ela pra caber
	}
	
	public String toString() {
		return "nome: "+nome+"\ntelefone: "+telefone+"\ndescri��o: "+descricao;
	}
}
